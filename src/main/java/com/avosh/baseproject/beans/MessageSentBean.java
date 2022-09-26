/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.MessageDto;
import com.avosh.baseproject.enums.MessageTypeEnum;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Component
@Scope("request")
public class MessageSentBean extends MessageBean{
    private static final Logger log = Logger.getLogger(MessageSentBean.class);

    @PostConstruct
    public void init() {
        setDto(new MessageDto());
        messageDto = new MessageDto();
        messageDtoList = new ArrayList<>();
        messageDtoList = service.retrieveAllByType(MessageTypeEnum.INSTANT_MESSAGE_SENT.getType());

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
