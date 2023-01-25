/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.repository;

import com.avosh.baseproject.entity.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepository extends BaseRepository<Transaction, Long> {

    @Query(value = "SELECT t from Transaction  t INNER join t.secUserId s" +
            " inner join  s.deviceList d where d.token = :token")
    List<Transaction> findTransactionByToken(@Param("token") String token, Pageable pageable);
}
