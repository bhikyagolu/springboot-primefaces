/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.TransactionDto;
import com.avosh.baseproject.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("session")
public class TransactionBean extends BaseBean<TransactionService, TransactionDto> {
    private TransactionDto transactionDto;
    private List<TransactionDto> dtoList;
    private boolean isEditMode;

    @Autowired
    public void setService(TransactionService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        isEditMode = false;
        setDto(new TransactionDto());
        transactionDto = new TransactionDto();
        dtoList = new ArrayList<>();
        dtoList = service.retrieveAll();

    }

    public void deleteRecord() {

    }

    public TransactionDto getFinanceDto() {
        return transactionDto;
    }

    public void setFinanceDto(TransactionDto transactionDto) {
        this.transactionDto = transactionDto;
        setDto(transactionDto);
    }

    public List<TransactionDto> getDtoList() {
        return dtoList;
    }

    public boolean isEditMode() {
        return isEditMode;
    }
}
