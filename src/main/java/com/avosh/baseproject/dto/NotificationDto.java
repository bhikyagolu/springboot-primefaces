package com.avosh.baseproject.dto;

import java.util.Date;

public class NotificationDto extends BaseDto {

    private UserDto userDto;
    private String title;
    private String description;
    private Date createDate;
    private Date updateDate;
    private Date startDate;
    private Date endDate;

    public NotificationDto() {
    }

    public NotificationDto(long id, UserDto userDto, String title, String description, Date createDate, Date updateDate, Date startDate, Date endDate) {
        this.id = id;
        this.userDto = userDto;
        this.title = title;
        this.description = description;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
