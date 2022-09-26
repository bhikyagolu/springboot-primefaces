/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.MessageDto;
import com.avosh.baseproject.services.MessageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class MessageBean extends BaseBean<MessageService,MessageDto>{
    private static final Logger log = Logger.getLogger(MessageBean.class);

    @Autowired
    public void setService(MessageService service) {
        this.service = service;
    }

    protected MessageDto messageDto;
    protected List<MessageDto> messageDtoList;



//    @PostConstruct
//    public void init() {
//        setDto(new MessageDto());
//        messageDto = new MessageDto();
//        messageDtoList = new ArrayList<>();
//        messageDtoList = service.retrieveAll();
//
//    }

    public MessageDto getMessageDto() {
        return messageDto;
    }

    public void setMessageDto(MessageDto messageDto) {
        this.messageDto = messageDto;
        setDto(messageDto);
    }

    public List<MessageDto> getMessageDtoList() {
        return messageDtoList;
    }

    public void setMessageDtoList(List<MessageDto> messageDtoList) {
        this.messageDtoList = messageDtoList;
    }

    public void setMessageType(Integer messageType) {
        messageDtoList = service.retrieveAllByType(messageType);
    }


    @Override
    public void init() {

    }
}
