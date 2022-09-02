/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.SystemDto;
import com.avosh.baseproject.services.SystemService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SystemServiceImpl implements SystemService {
    private static final Logger log = Logger.getLogger(SystemServiceImpl.class);

    @Override
    public void save(SystemDto dto) {

    }

    @Override
    public List<SystemDto> retrieveAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
