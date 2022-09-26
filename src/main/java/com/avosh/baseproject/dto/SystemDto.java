/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.dto;

import java.util.Date;

public class SystemDto extends BaseDto{

    private String description;
    private Boolean enable ;
    private Integer version;
    private Boolean minVersion ;
    private Date createDatetime;
    private UserDto userDto;

    public SystemDto() {
    }

    public SystemDto(Long id, String description, Boolean enable, Integer version, Boolean minVersion, Date createDatetime, UserDto userDto) {
        this.id = id;
        this.description = description;
        this.enable = enable;
        this.version = version;
        this.minVersion = minVersion;
        this.createDatetime = createDatetime;
        this.userDto = userDto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getMinVersion() {
        return minVersion;
    }

    public void setMinVersion(Boolean minVersion) {
        this.minVersion = minVersion;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
