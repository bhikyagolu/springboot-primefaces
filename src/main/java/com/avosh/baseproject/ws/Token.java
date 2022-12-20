/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import com.avosh.baseproject.enums.ResultCods;
import com.avosh.baseproject.services.TokenService;
import com.avosh.baseproject.ws.model.Response;
import com.avosh.baseproject.ws.model.TokenRequest;
import com.avosh.baseproject.ws.model.TokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ws")
public class Token {
    @Autowired
    private TokenService tokenService;

    @PostMapping("/token")
    public TokenResponse getToken(@RequestBody TokenRequest tokenRequest) {
        TokenResponse tokenResponse = new TokenResponse();
        try {
            String res = tokenService.getTokenByUserPassword(tokenRequest.getUsername(),
                    tokenRequest.getPassword(), tokenRequest.getMac());
            tokenResponse.setToken(res);
            tokenResponse.setResultCode(ResultCods.SUCCESS.getCode());
            tokenResponse.setResultDescription(ResultCods.SUCCESS.getDescription());
        } catch (Exception e) {
            tokenResponse.setResultCode(ResultCods.FAILURE.getCode());
            tokenResponse.setResultDescription(ResultCods.FAILURE.getDescription());
        }finally {
            return tokenResponse;
        }
    }

    @PostMapping("/token/validate")
    public Response validateToken(@PathVariable String token) {
        Response response = new Response();
        try {
            tokenService.validateToken(token);
            response.setResultCode(ResultCods.SUCCESS.getCode());
            response.setResultDescription(ResultCods.SUCCESS.getDescription());
        } catch (Exception e) {
            response.setResultCode(ResultCods.FAILURE.getCode());
            response.setResultDescription(ResultCods.FAILURE.getDescription());
        }finally {
            return response;
        }
    }

    @PostMapping("/token/invalidate")
    public Response invalidateToken(@PathVariable String token) {
        Response response = new Response();
        try {
            tokenService.inValidateToken(token);
            response.setResultCode(ResultCods.SUCCESS.getCode());
            response.setResultDescription(ResultCods.SUCCESS.getDescription());
        } catch (Exception e) {
            response.setResultCode(ResultCods.FAILURE.getCode());
            response.setResultDescription(ResultCods.FAILURE.getDescription());
        }finally {
            return response;
        }
    }
}
