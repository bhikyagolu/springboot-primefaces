/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.repository.TokenRepository;
import com.avosh.baseproject.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TokenServiceImpl implements TokenService {
    @Autowired
    private TokenRepository tokenRepository;

    @Override
    public String getTokenByUserPassword(String user, String pass) {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

    @Override
    public String validateToken(String token) {
        return null;
    }

    @Override
    public String inValidateToken(String token) {
        return null;
    }
}
