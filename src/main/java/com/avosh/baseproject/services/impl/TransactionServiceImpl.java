/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.TransactionDto;
import com.avosh.baseproject.dto.RedeemDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.Transaction;
import com.avosh.baseproject.repository.TransactionRepository;
import com.avosh.baseproject.services.TransactionService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    private static final Logger log = Logger.getLogger(TransactionServiceImpl.class);
    @Autowired
    TransactionRepository repository;

    @Override
    public void save(TransactionDto dto) {

    }

    @Override
    public List<TransactionDto> retrieveAll() {
        List<TransactionDto> list = new ArrayList<>();
        Iterable<Transaction> itr = repository.findAll();
        for (Transaction transaction : itr) {
            UserDto userDto = new UserDto();
            userDto.setName(transaction.getSecUserId().getName());
            userDto.setFamily(transaction.getSecUserId().getFamily());
            userDto.setId(transaction.getSecUserId().getId());

            RedeemDto redeemDto = new RedeemDto();
            redeemDto.setCode(transaction.getRedeemUserId().getRedeemId().getCode());
            redeemDto.setDesc(transaction.getRedeemUserId().getRedeemId().getDesc());
            redeemDto.setId(transaction.getRedeemUserId().getRedeemId().getId());

            TransactionDto transactionDto = new TransactionDto(transaction.getId(), transaction.getDesc(), transaction.getAmount(),
                    transaction.getCreateDatetime(), userDto, redeemDto);
            list.add(transactionDto);

        }
        return list;
    }

    @Override
    public TransactionDto retrieveById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
