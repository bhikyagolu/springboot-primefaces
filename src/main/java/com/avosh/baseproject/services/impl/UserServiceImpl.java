/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.repository.UserRepository;
import com.avosh.baseproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;



    @Override
    public void save(UserDto dto) {
        SecUser user = new SecUser();
        userRepository.save(user);
    }

    @Override
    public List<UserDto> retrieveAll() {
//        return userRepository.findAll();
        return null;
    }
}
