/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.dto;

import java.util.Date;

public class MessageDto extends BaseDto{
    private Long id;
    private String title;
    private String message;
    private Date createDateTime;
    private Boolean isRead;
    private UserDto sender;
    private UserDto receiver;
    private Integer messageType;

    public MessageDto() {
    }

    public MessageDto(Long id, String title, String message, Date createDateTime, Boolean isRead, UserDto sender, UserDto receiver, Integer messageType) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.createDateTime = createDateTime;
        this.isRead = isRead;
        this.sender = sender;
        this.receiver = receiver;
        this.messageType = messageType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }

    public UserDto getSender() {
        return sender;
    }

    public void setSender(UserDto sender) {
        this.sender = sender;
    }

    public UserDto getReceiver() {
        return receiver;
    }

    public void setReceiver(UserDto receiver) {
        this.receiver = receiver;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

}
