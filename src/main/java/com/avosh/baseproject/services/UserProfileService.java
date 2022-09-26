/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.repository.UserRepository;

public interface UserProfileService extends BaseService<UserRepository, SecUser, UserDto>{
     UserDto retrieveById();
     Boolean changePassword(String newPassword,String oldPassword);
     void updateContact(UserDto userDto);
     void updateProfile(UserDto userDto);
}
