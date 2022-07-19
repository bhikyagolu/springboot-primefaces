/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.dto;

import java.util.Date;

public class NewsDto extends BaseDto{
    private Long id;
    private String title;
    private String brief;
    private String news;
    private Date createDateTime;
    private UserDto user;
    private boolean hasSchedulerTile;

    public NewsDto() {
    }

    public NewsDto(Long id, String brief, String news, String title, Date createDateTime, UserDto user) {
        this.id = id;
        this.brief = brief;
        this.news = news;
        this.title = title;
        this.createDateTime = createDateTime;
        this.user = user;
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

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public boolean isHasSchedulerTile() {
        return hasSchedulerTile;
    }

    public void setHasSchedulerTile(boolean hasSchedulerTile) {
        this.hasSchedulerTile = hasSchedulerTile;
    }
}
