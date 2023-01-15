/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.services;

public interface TokenService {
    String getTokenByUserPassword(String user, String pass, String mac, String name);

    Boolean isTokenValid(String token, String mac);

    Boolean isTokenValid(String token);

    void deleteDeviceByToken(String token);
}
