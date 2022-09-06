/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.FinanceDto;
import com.avosh.baseproject.dto.NewsDto;
import com.avosh.baseproject.services.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("session")
public class FinanceBean extends BaseBean<FinanceService, FinanceDto> {
    private FinanceDto financeDto;
    private List<FinanceDto> dtoList;
    private boolean isEditMode;

    @Autowired
    public void setService(FinanceService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        isEditMode = false;
        setDto(new FinanceDto());
        financeDto = new FinanceDto();
        dtoList = new ArrayList<>();
        dtoList = service.retrieveAll();

    }

    @Override
    public void save() {

    }


    public void deleteRecord() {

    }

    public FinanceDto getFinanceDto() {
        return financeDto;
    }

    public void setFinanceDto(FinanceDto financeDto) {
        this.financeDto = financeDto;
        setDto(financeDto);
    }

    public List<FinanceDto> getDtoList() {
        return dtoList;
    }

    public boolean isEditMode() {
        return isEditMode;
    }
}
