/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import com.avosh.baseproject.enums.ResultCodsEnum;
import com.avosh.baseproject.excptions.DeleteExceptionException;
import com.avosh.baseproject.excptions.PasswordNotMatchException;
import com.avosh.baseproject.excptions.UserIsDisabledException;
import com.avosh.baseproject.excptions.UserNotFoundException;
import com.avosh.baseproject.services.TokenService;
import com.avosh.baseproject.ws.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.authority.AuthorityUtils;

@RestController
@RequestMapping("/ws")
public class TokenWs {
//    @Autowired
//    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/token")
    public ResponseEntity getToken(@RequestBody TokenRequest tokenRequest) {
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                tokenRequest.getUsername(), tokenRequest.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authentication);

        TokenResponse tokenResponse = new TokenResponse();
        HttpStatus httpStatus = HttpStatus.OK;
        try {
            String res = tokenService.getTokenByUserPassword(tokenRequest.getUsername(),
                    tokenRequest.getPassword(), tokenRequest.getMac(), tokenRequest.getName());
            //todo
            getJWTToken(tokenRequest.getUsername());
            tokenResponse.setToken(res);
            tokenResponse.setResultCode(ResultCodsEnum.SUCCESS.getCode());
            tokenResponse.setResultDescription(ResultCodsEnum.SUCCESS.getDescription());
            httpStatus = (ResultCodsEnum.SUCCESS.getHttpStatus());

        } catch (UserNotFoundException | PasswordNotMatchException e) {
            tokenResponse.setResultCode(ResultCodsEnum.USERNAME_PASSWORD_ERROR.getCode());
            tokenResponse.setResultDescription(ResultCodsEnum.USERNAME_PASSWORD_ERROR.getDescription());
            httpStatus = (ResultCodsEnum.USERNAME_PASSWORD_ERROR.getHttpStatus());
        } catch (UserIsDisabledException e) {
            tokenResponse.setResultCode(ResultCodsEnum.USER_IS_NOT_ENABLE.getCode());
            tokenResponse.setResultDescription(ResultCodsEnum.USER_IS_NOT_ENABLE.getDescription());
            httpStatus = (ResultCodsEnum.USER_IS_NOT_ENABLE.getHttpStatus());
        } catch (Exception e) {
            tokenResponse.setResultCode(ResultCodsEnum.UNKNOWN_ERROR.getCode());
            tokenResponse.setResultDescription(ResultCodsEnum.UNKNOWN_ERROR.getDescription());
            httpStatus = (ResultCodsEnum.UNKNOWN_ERROR.getHttpStatus());
        } finally {
            return new ResponseEntity(tokenResponse, httpStatus);
        }
    }

    @PostMapping("/token/validate")
    public ResponseEntity validateToken(@RequestBody ValidateTokenRequest request) {
        Response response = new Response();
        HttpStatus httpStatus = HttpStatus.OK;
        try {
            Boolean res = tokenService.isTokenValid(request.getToken(), request.getMac());
            if (res) {
                response.setResultCode(ResultCodsEnum.SUCCESS.getCode());
                response.setResultDescription(ResultCodsEnum.SUCCESS.getDescription());
                httpStatus = (ResultCodsEnum.SUCCESS.getHttpStatus());
            } else {
                response.setResultCode(ResultCodsEnum.TOKEN_NOT_VALID.getCode());
                response.setResultDescription(ResultCodsEnum.TOKEN_NOT_VALID.getDescription());
                httpStatus = (ResultCodsEnum.TOKEN_NOT_VALID.getHttpStatus());
            }

        } catch (Exception e) {
            response.setResultCode(ResultCodsEnum.UNKNOWN_ERROR.getCode());
            response.setResultDescription(ResultCodsEnum.UNKNOWN_ERROR.getDescription());
            httpStatus = (ResultCodsEnum.UNKNOWN_ERROR.getHttpStatus());
        } finally {
            return new ResponseEntity(response, httpStatus);
        }
    }

    @PostMapping("/token/revoke")
    public ResponseEntity removeDevice(@RequestBody DeleteTokenRequest request) {
        Response response = new Response();
        HttpStatus httpStatus = HttpStatus.OK;
        try {
            tokenService.deleteDeviceByToken(request.getToken());
            response.setResultCode(ResultCodsEnum.SUCCESS.getCode());
            response.setResultDescription(ResultCodsEnum.SUCCESS.getDescription());
            httpStatus = (ResultCodsEnum.SUCCESS.getHttpStatus());
        } catch (DeleteExceptionException e) {
            response.setResultCode(ResultCodsEnum.REMOVE_ERROR.getCode());
            response.setResultDescription(ResultCodsEnum.REMOVE_ERROR.getDescription());
            httpStatus = (ResultCodsEnum.REMOVE_ERROR.getHttpStatus());
        } catch (Exception e) {
            response.setResultCode(ResultCodsEnum.UNKNOWN_ERROR.getCode());
            response.setResultDescription(ResultCodsEnum.UNKNOWN_ERROR.getDescription());
            httpStatus = (ResultCodsEnum.UNKNOWN_ERROR.getHttpStatus());
        } finally {
            return new ResponseEntity(response, httpStatus);
        }
    }

    private String getJWTToken(String username) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("softtekJWT")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();

        return "Bearer " + token;
    }
}
