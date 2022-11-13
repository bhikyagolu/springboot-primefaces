/*******************************************************************************
 * Created by Alireza Amirkhani 2022
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

    public List<MessageDto> retrieveAllByType(Integer type) {
        List<MessageDto> dtoList = new ArrayList<>();
        Iterable<Message> itr = repository.findAllByType(type);
        for (Message message : itr) {
            UserDto senderUser = new UserDto();
            senderUser.setId(message.getSecUserId().getId());
            senderUser.setFamily(message.getSecUserId().getFamily());
            senderUser.setName(message.getSecUserId().getName());

            UserDto ReceiverUser = new UserDto();
            ReceiverUser.setId(message.getSecUserId1().getId());
            ReceiverUser.setFamily(message.getSecUserId1().getFamily());
            ReceiverUser.setName(message.getSecUserId1().getName());
            ReceiverUser.setCellphone(message.getSecUserId1().getCellphone());

            MessageDto messageDto = new MessageDto(message.getId(), message.getTitle(), message.getMessage(),
                    message.getCreateDate(), message.getRead(), senderUser, ReceiverUser, message.getType());
            dtoList.add(messageDto);

        }
        return dtoList;
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
            ReceiverUser.setCellphone(message.getSecUserId1().getCellphone());

            MessageDto messageDto = new MessageDto(message.getId(), message.getTitle(), message.getMessage(),
                    message.getCreateDate(), message.getRead(), senderUser, ReceiverUser, message.getType());
            dtoList.add(messageDto);

        }
        return dtoList;
    }

    @Override
    public MessageDto retrieveById(Long id) {
        return null;
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
