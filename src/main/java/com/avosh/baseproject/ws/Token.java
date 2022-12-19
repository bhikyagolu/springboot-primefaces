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
    public TokenResponse getToken(@RequestBody TokenRequest tokenRequest){
        TokenResponse tokenResponse = new TokenResponse();
        try {
            String res = tokenService.getTokenByUserPassword(tokenRequest.getUsername(),
                    tokenRequest.getPassword());
            tokenResponse.setToken(res);
            tokenResponse.setResultCode(ResultCods.SUCCESS.getCode());
            tokenResponse.setResultDescription(ResultCods.SUCCESS.getDescription());
        } catch (Exception e) {
            tokenResponse.setResultCode(ResultCods.FAILURE.getCode());
            tokenResponse.setResultDescription(ResultCods.FAILURE.getDescription());
        }
        return tokenResponse;
    }

    @PostMapping("/validate/token")
    public Response validateToken(@PathVariable String token){
        return null;
    }

    @PostMapping("/invalidate/token")
    public Response invalidateToken(@PathVariable String token){
        return null;
    }
}
