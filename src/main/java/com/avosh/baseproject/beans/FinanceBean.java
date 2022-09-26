/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.FinanceDto;
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
