/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.FinanceDto;
import com.avosh.baseproject.dto.LessonDto;
import com.avosh.baseproject.dto.RedeemDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.Finance;
import com.avosh.baseproject.entity.Lesson;
import com.avosh.baseproject.repository.FinanceRepository;
import com.avosh.baseproject.services.FinanceService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FinanceServiceImpl implements FinanceService {
    private static final Logger log = Logger.getLogger(FinanceServiceImpl.class);
    @Autowired
    FinanceRepository repository;

    @Override
    public void save(FinanceDto dto) {

    }

    @Override
    public List<FinanceDto> retrieveAll() {
        List<FinanceDto> list = new ArrayList<>();
        Iterable<Finance> itr = repository.findAll();
        for (Finance finance : itr) {
            UserDto userDto = new UserDto();
            userDto.setName(finance.getSecUserId().getName());
            userDto.setFamily(finance.getSecUserId().getFamily());
            userDto.setId(finance.getSecUserId().getId());

            RedeemDto redeemDto = new RedeemDto();
            redeemDto.setCode(finance.getRedeemUserId().getRedeemId().getCode());
            redeemDto.setDesc(finance.getRedeemUserId().getRedeemId().getDesc());
            redeemDto.setId(finance.getRedeemUserId().getRedeemId().getId());

            FinanceDto financeDto = new FinanceDto(finance.getId(),finance.getDesc(),finance.getAmount(),
                    finance.getCreateDatetime(),userDto,redeemDto);
            list.add(financeDto);

        }
        return list;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
