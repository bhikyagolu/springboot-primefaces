/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import com.avosh.baseproject.conf.CustomUserDetailService;
import com.avosh.baseproject.enums.ResultCodsEnum;
import com.avosh.baseproject.excptions.DeleteExceptionException;
import com.avosh.baseproject.excptions.PasswordNotMatchException;
import com.avosh.baseproject.excptions.UserIsDisabledException;
import com.avosh.baseproject.excptions.UserNotFoundException;
import com.avosh.baseproject.util.JwtTokenUtil;
import com.avosh.baseproject.ws.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TokenWs {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private CustomUserDetailService userDetailsService;


    @PostMapping("/token")
    public ResponseEntity getToken(@RequestBody TokenRequest tokenRequest) {
        TokenResponse tokenResponse = new TokenResponse();
        HttpStatus httpStatus = HttpStatus.OK;
        try {
            authenticate(tokenRequest.getUsername(), tokenRequest.getPassword());
            final UserDetails userDetails = userDetailsService
                    .loadUserByUsername(tokenRequest.getUsername());

            final String token = jwtTokenUtil.generateToken(userDetails);
            tokenResponse.setToken(token);
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

    @PostMapping("/ws/token/validate")
    public ResponseEntity validateToken(@RequestBody ValidateTokenRequest request) {
        Response response = new Response();
        HttpStatus httpStatus = HttpStatus.OK;
        try {
//            Boolean res = tokenService.isTokenValid(request.getToken(), request.getMac());
            if (true) {
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
//            tokenService.deleteDeviceByToken(request.getToken());
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


    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        } catch (Exception e) {
            throw new Exception("UNKNOWN_EXCEPTION", e);
        }
    }
}
