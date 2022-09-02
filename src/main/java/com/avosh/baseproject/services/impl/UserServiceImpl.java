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
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = Logger.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository repository;



    @Override
    public void save(UserDto dto) {
        SecUser user = new SecUser();
        repository.save(user);
    }

    @Override
    public List<UserDto> retrieveAll() {
        List<UserDto> list = new ArrayList<>();
        Iterable<SecUser> itr = repository.findAll();
        for (SecUser user : itr) {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setName(user.getName());
            userDto.setFamily(user.getFamily());
            userDto.setAddress(user.getAddress());
            userDto.setCellphone(user.getCellphone());
            userDto.setCreateDate(user.getCreateDate());
            userDto.setEmail(user.getEmail());
            userDto.setGender(user.getGender());
            userDto.setEnable(user.getIsEnable());
            userDto.setLastLogin(user.getLastLogin());
            userDto.setNationalcode(user.getNationalcode());
            userDto.setPhone(user.getPhone());
            list.add(userDto);
        }
        return list;
    }

    @Override
    public void deleteById(Long id) {

    }
}
