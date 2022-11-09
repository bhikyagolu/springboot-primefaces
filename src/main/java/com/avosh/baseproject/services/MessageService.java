/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.MessageDto;
import com.avosh.baseproject.entity.Message;
import com.avosh.baseproject.repository.MessageRepository;

import java.util.List;

public interface MessageService extends BaseService<MessageRepository, Message, MessageDto> {
    Long countUnreadMessage();

    List<MessageDto> retrieveAllByType(Integer type);
}
