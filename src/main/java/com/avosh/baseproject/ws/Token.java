/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import com.avosh.baseproject.services.TokenService;
import com.avosh.baseproject.ws.model.Response;
import com.avosh.baseproject.ws.model.TokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ws")
public class Token {
    @Autowired
    private TokenService tokenService;
    @PostMapping("/token")
    public TokenResponse getToken(@RequestParam String username, @RequestParam String password){
        TokenResponse tokenResponse = new TokenResponse();
        String res = tokenService.getTokenByUserPassword(username,password);
        tokenResponse.setToken(res);
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
