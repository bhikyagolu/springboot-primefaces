/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.dto;

import java.util.Date;

public class NewsDto {
    private Long id;
    private String brif;
    private String news;
    private Date createDateTime;
    private String authour;
    private Long authourID;

    public NewsDto(Long id, String brif, String news, Date createDateTime, String authour, Long authourID) {
        this.id = id;

        this.brif = brif;
        this.news = news;
        this.createDateTime = createDateTime;
        this.authour = authour;
        this.authourID = authourID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getBrif() {
        return brif;
    }

    public void setBrif(String brif) {
        this.brif = brif;
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

    public String getAuthour() {
        return authour;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }

    public Long getAuthourID() {
        return authourID;
    }

    public void setAuthourID(Long authourID) {
        this.authourID = authourID;
    }
}
