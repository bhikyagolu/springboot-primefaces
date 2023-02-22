/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.services;

import org.springframework.security.core.userdetails.UserDetails;

public interface TokenService {
    UserDetails getUserDetailsFromUserName();
}
