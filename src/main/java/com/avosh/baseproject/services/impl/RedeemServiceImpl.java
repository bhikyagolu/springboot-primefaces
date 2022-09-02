/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.RedeemDto;
import com.avosh.baseproject.repository.RedeemRepository;
import com.avosh.baseproject.services.RedeemService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedeemServiceImpl implements RedeemService {
    private static final Logger log = Logger.getLogger(RedeemServiceImpl.class);

    @Autowired
    private RedeemRepository repository;

    @Override
    public void save(RedeemDto dto) {

    }

    @Override
    public List<RedeemDto> retrieveAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
