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
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.Redeem;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.repository.RedeemRepository;
import com.avosh.baseproject.services.RedeemService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RedeemServiceImpl implements RedeemService {
    private static final Logger log = Logger.getLogger(RedeemServiceImpl.class);

    @Autowired
    private RedeemRepository repository;

    @Override
    public void save(RedeemDto dto) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Redeem redeem = new Redeem();
        redeem.setCode(dto.getCode());
        redeem.setDesc(dto.getDesc());
        redeem.setAmount(dto.getAmount());
        redeem.setCount(dto.getCount());
        redeem.setCreateDate(new Date());
        redeem.setExpireDate(dto.getExpireDate());
        redeem.setMultiple(dto.getMultiple());
        redeem.setSecUserId(new SecUser(auth.getSecUser().getId()));
        redeem.setStartDate(dto.getStartDate());
        redeem.setTitle(dto.getTitle());
        repository.save(redeem);

    }

    @Override
    public List<RedeemDto> retrieveAll() {
        List<RedeemDto> list = new ArrayList<>();
        Iterable<Redeem> itr = repository.findAll();
        for (Redeem redeem : itr) {
            UserDto userDto = new UserDto();
            userDto.setId(redeem.getSecUserId().getId());

            RedeemDto redeemDto = new RedeemDto(redeem.getId(), redeem.getTitle(), redeem.getDesc(),redeem.getAmount(),
                    redeem.getCode(), redeem.getExpireDate(), redeem.getStartDate(), redeem.getMultiple(),
                    redeem.getCount(), redeem.getCreateDate(), userDto);
            list.add(redeemDto);
        }
        return list;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
