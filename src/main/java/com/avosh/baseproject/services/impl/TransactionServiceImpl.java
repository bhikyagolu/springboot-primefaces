/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.RedeemDto;
import com.avosh.baseproject.dto.TransactionDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.Transaction;
import com.avosh.baseproject.repository.TransactionRepository;
import com.avosh.baseproject.services.TransactionService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@PreAuthorize("hasRole('ROLE_ADMIN')")
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

    @Override
    public List<TransactionDto> retrieveTransactionsByUserToken(Pageable paging,String token) {
        List<Transaction> res = repository.findTransactionByToken(token,paging);
        List<TransactionDto> list = new ArrayList<>();
        for (Transaction transaction:res) {
            TransactionDto dto = new TransactionDto();
            dto.setStatus(transaction.getStatus());
            dto.setDesc(transaction.getDesc());
            dto.setAmount(transaction.getAmount());
            dto.setCreateDateTime(transaction.getCreateDatetime());
            dto.setId(transaction.getId());
            list.add(dto);
        }
        return list;
    }
}
