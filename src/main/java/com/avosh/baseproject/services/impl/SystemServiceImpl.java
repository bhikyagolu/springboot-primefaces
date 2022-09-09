/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.dto.RedeemDto;
import com.avosh.baseproject.dto.SystemDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.Redeem;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.entity.System;
import com.avosh.baseproject.repository.SystemRepository;
import com.avosh.baseproject.services.SystemService;
import com.avosh.baseproject.util.Empty;
import com.fasterxml.jackson.databind.DatabindException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class SystemServiceImpl implements SystemService {
    private static final Logger log = Logger.getLogger(SystemServiceImpl.class);

    @Autowired
    SystemRepository repository;

    @Override
    public void save(SystemDto dto) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System system = new System();
        system.setDescription(dto.getDescription());
        if (Empty.isEmpty(dto.getId())) {
            system.setCreateDatetime(new Date());
        }
        short enableStatus = (short) ((dto.getEnable()) ? 1 : 0);
        system.setEnable(enableStatus);
        system.setId(dto.getId());
        system.setVersion(dto.getVersion());
        system.setMinVersion(dto.getMinVersion());
        system.setSecUserId(new SecUser(auth.getSecUser().getId()) );
        repository.save(system);
    }

    @Override
    public List<SystemDto> retrieveAll() {
        List<SystemDto> list = new ArrayList<>();
        Iterable<System> itr = repository.findAll();
        for (System system : itr) {
            UserDto userDto = new UserDto();
            userDto.setId(system.getSecUserId().getId());
            userDto.setName(system.getSecUserId().getName());
            userDto.setFamily(system.getSecUserId().getFamily());

            SystemDto systemDto = new SystemDto(system.getId(),system.getDescription(),system.getMinVersion(),
                    system.getVersion(),system.getMinVersion(),system.getCreateDatetime(),userDto);
            list.add(systemDto);
        }
        return list;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
