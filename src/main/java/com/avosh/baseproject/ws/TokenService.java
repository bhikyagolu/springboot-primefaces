/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class TokenService {
    @PostMapping("/token")
    public String getToken(String user, String password){
        return null;
    }
    @PostMapping("/validate/token")
    public String validateToken(String token){
        return null;
    }
    @PostMapping("/invalidate/token")
    public String invalidateToken(String token){
        return null;
    }
}
