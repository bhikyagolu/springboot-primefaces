/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.repository;

import com.avosh.baseproject.entity.Message;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends BaseRepository<Message, Long> {
    @Query("SELECT count(m) FROM Message m WHERE m.secUserId.id = :id and m.type = 2 and m.isRead = false ")
    Long countAllById(Long id);

    Iterable<Message> findAllByType(int type);
}
