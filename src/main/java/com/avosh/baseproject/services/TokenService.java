/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.services;

import com.avosh.baseproject.conf.CustomUserDetail;
import org.springframework.security.core.userdetails.UserDetails;

public interface TokenService {
    CustomUserDetail getUserDetailsFromUserName();
}
