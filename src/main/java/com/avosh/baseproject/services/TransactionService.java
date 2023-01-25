/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.TransactionDto;
import com.avosh.baseproject.entity.Transaction;
import com.avosh.baseproject.repository.TransactionRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TransactionService extends BaseService<TransactionRepository, Transaction, TransactionDto> {
    List<TransactionDto> retrieveTransactionsByUserToken(Pageable paging,String token);
}
