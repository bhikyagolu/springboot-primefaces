/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.MessageDto;
import com.avosh.baseproject.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("request")
public class MessageBean extends BaseBean{
    @Autowired
    MessageService messageService;

    private MessageDto messageDto;
    private List<MessageDto> messageDtoList;

    public MessageDto getMessageDto() {
        return messageDto;
    }

    public void setMessageDto(MessageDto messageDto) {
        this.messageDto = messageDto;
    }

    public List<MessageDto> getMessageDtoList() {
        return messageDtoList;
    }

    public void setMessageDtoList(List<MessageDto> messageDtoList) {
        this.messageDtoList = messageDtoList;
    }
}
