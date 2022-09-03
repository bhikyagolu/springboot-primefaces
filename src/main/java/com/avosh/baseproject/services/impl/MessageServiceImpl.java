/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.dto.MessageDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.Message;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.repository.MessageRepository;
import com.avosh.baseproject.services.MessageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    private static final Logger log = Logger.getLogger(MessageServiceImpl.class);

    @Autowired
    MessageRepository repository;

    @Override
    public void save(MessageDto dto) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Message message = new Message();
        message.setMessage(dto.getMessage());
        message.setCreateDate(new Date());
        message.setRead(dto.getRead());
        message.setTitle(dto.getTitle());
        message.setSecUserId(new SecUser(auth.getSecUser().getId()));
        message.setSecUserId1(new SecUser(dto.getReceiver().getId()));
        message.setType(dto.getMessageType());
        repository.save(message);
    }

    @Override
    public List<MessageDto> retrieveAll() {
        List<MessageDto> dtoList = new ArrayList<>();
        Iterable<Message> itr = repository.findAll();
        for (Message message : itr) {
            UserDto senderUser = new UserDto();
            senderUser.setId(message.getSecUserId().getId());
            senderUser.setFamily(message.getSecUserId().getFamily());
            senderUser.setName(message.getSecUserId().getName());

            UserDto ReceiverUser = new UserDto();
            ReceiverUser.setId(message.getSecUserId1().getId());
            ReceiverUser.setFamily(message.getSecUserId1().getFamily());
            ReceiverUser.setName(message.getSecUserId1().getName());

            MessageDto messageDto = new MessageDto(message.getId(),message.getTitle(),message.getMessage(),
                    message.getCreateDate(),message.getRead(),senderUser,ReceiverUser,message.getType());
            dtoList.add(messageDto);

        }
        return dtoList;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }


    @Override
    public Long countUnreadMessage() {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

       return repository.countAllById(auth.getSecUser().getId());
    }
}
