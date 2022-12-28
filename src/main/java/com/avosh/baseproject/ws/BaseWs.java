package com.avosh.baseproject.ws;

import com.avosh.baseproject.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseWs {
    @Autowired
    private TokenService tokenService;

    public Boolean isTokenValid(String token, String mac) {
        try {
            Boolean res = tokenService.isTokenValid(token, mac);
            if (res) {
                return true;
            }else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean isTokenValid(String token) {
        try {
            Boolean res = tokenService.isTokenValid(token);
            if (res) {
                return true;
            }else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

}
