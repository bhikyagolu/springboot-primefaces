/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.repository.UserRepository;

public interface UserService extends BaseService<UserRepository, SecUser, UserDto>{

}
