/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import com.avosh.baseproject.enums.ResultCods;
import com.avosh.baseproject.excptions.DeleteExceptionException;
import com.avosh.baseproject.excptions.PasswordNotMatchException;
import com.avosh.baseproject.excptions.UserNotFoundException;
import com.avosh.baseproject.services.TokenService;
import com.avosh.baseproject.ws.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws")
public class Token{
    @Autowired
    private TokenService tokenService;

    @PostMapping("/token")
    public ResponseEntity getToken(@RequestBody TokenRequest tokenRequest) {
        TokenResponse tokenResponse = new TokenResponse();
        HttpStatus httpStatus = HttpStatus.OK;
        try {
            String res = tokenService.getTokenByUserPassword(tokenRequest.getUsername(),
                    tokenRequest.getPassword(), tokenRequest.getMac(),tokenRequest.getName());
            tokenResponse.setToken(res);
            tokenResponse.setResultCode(ResultCods.SUCCESS.getCode());
            tokenResponse.setResultDescription(ResultCods.SUCCESS.getDescription());
            httpStatus = (ResultCods.SUCCESS.getHttpStatus());

        } catch (UserNotFoundException e) {
            tokenResponse.setResultCode(ResultCods.USERNAME_PASSWORD_ERROR.getCode());
            tokenResponse.setResultDescription(ResultCods.USERNAME_PASSWORD_ERROR.getDescription());
            httpStatus = (ResultCods.USERNAME_PASSWORD_ERROR.getHttpStatus());
        } catch (PasswordNotMatchException e) {
            tokenResponse.setResultCode(ResultCods.USERNAME_PASSWORD_ERROR.getCode());
            tokenResponse.setResultDescription(ResultCods.USERNAME_PASSWORD_ERROR.getDescription());
            httpStatus = (ResultCods.USERNAME_PASSWORD_ERROR.getHttpStatus());
        } catch (Exception e) {
            tokenResponse.setResultCode(ResultCods.UNKNOWN_ERROR.getCode());
            tokenResponse.setResultDescription(ResultCods.UNKNOWN_ERROR.getDescription());
            httpStatus = (ResultCods.UNKNOWN_ERROR.getHttpStatus());
        }finally {
            return new ResponseEntity(tokenResponse,httpStatus);
        }
    }

    @PostMapping("/token/validate")
    public ResponseEntity validateToken(@RequestBody ValidateTokenRequest request) {
        Response response = new Response();
        HttpStatus httpStatus = HttpStatus.OK;
        try {
            Boolean res = tokenService.isTokenValid(request.getToken(),request.getMac());
            if(res){
                response.setResultCode(ResultCods.SUCCESS.getCode());
                response.setResultDescription(ResultCods.SUCCESS.getDescription());
                httpStatus = (ResultCods.SUCCESS.getHttpStatus());
            }else {
                response.setResultCode(ResultCods.TOKEN_NOT_VALID.getCode());
                response.setResultDescription(ResultCods.TOKEN_NOT_VALID.getDescription());
                httpStatus = (ResultCods.TOKEN_NOT_VALID.getHttpStatus());
            }

        } catch (Exception e) {
            response.setResultCode(ResultCods.UNKNOWN_ERROR.getCode());
            response.setResultDescription(ResultCods.UNKNOWN_ERROR.getDescription());
            httpStatus = (ResultCods.UNKNOWN_ERROR.getHttpStatus());
        }finally {
            return new ResponseEntity(response,httpStatus);
        }
    }

    @PostMapping("/token/remove")
    public ResponseEntity removeDevice(@RequestBody DeleteTokenRequest request) {
        Response response = new Response();
        HttpStatus httpStatus = HttpStatus.OK;
        try {
            tokenService.deleteDeviceByToken(request.getToken());
            response.setResultCode(ResultCods.SUCCESS.getCode());
            response.setResultDescription(ResultCods.SUCCESS.getDescription());
            httpStatus = (ResultCods.SUCCESS.getHttpStatus());
        }catch (DeleteExceptionException e){
            response.setResultCode(ResultCods.REMOVE_ERROR.getCode());
            response.setResultDescription(ResultCods.REMOVE_ERROR.getDescription());
            httpStatus = (ResultCods.REMOVE_ERROR.getHttpStatus());
        } catch (Exception e) {
            response.setResultCode(ResultCods.UNKNOWN_ERROR.getCode());
            response.setResultDescription(ResultCods.UNKNOWN_ERROR.getDescription());
            httpStatus = (ResultCods.UNKNOWN_ERROR.getHttpStatus());
        }finally {
            return new ResponseEntity(response,httpStatus);
        }
    }
}
