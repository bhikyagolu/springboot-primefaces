/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.dto;

import java.util.Date;

public class RedeemDto extends BaseDto{

    private String title;
    private String desc;
    private String code;
    private Date expireDate;
    private Date startDate;
    private Boolean multiple;
    private Integer count;
    private Date createDate;
    private UserDto userDto;

    public RedeemDto() {
    }

    public RedeemDto(Long id, String title, String desc, String code, Date expireDate, Date startDate, Boolean multiple, Integer count, Date createDate, UserDto userDto) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.code = code;
        this.expireDate = expireDate;
        this.startDate = startDate;
        this.multiple = multiple;
        this.count = count;
        this.createDate = createDate;
        this.userDto = userDto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
