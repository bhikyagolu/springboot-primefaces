/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.MessageDto;
import com.avosh.baseproject.enums.MessageType;
import com.avosh.baseproject.services.MessageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("request")
public class MessageSentBean extends MessageBean{
    private static final Logger log = Logger.getLogger(MessageSentBean.class);

    @PostConstruct
    public void init() {
        setDto(new MessageDto());
        messageDto = new MessageDto();
        messageDtoList = new ArrayList<>();
        messageDtoList = service.retrieveAllByType(MessageType.INSTANT_MESSAGE_SENT.getType());

    }

    public void setMessageDto(MessageDto messageDto) {
        this.messageDto = messageDto;
        setDto(messageDto);
    }


    public void deleteRecord() {
        super.delete();
        init();
    }



}
