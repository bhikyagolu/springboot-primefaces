/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.BaseDto;
import com.avosh.baseproject.dto.NewsDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.News;
import com.avosh.baseproject.excptions.BaseException;
import com.avosh.baseproject.services.NewsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Scope("request")
public class NewsBean extends BaseBean<NewsService, NewsDto> {
    private static final Logger log = Logger.getLogger(NewsBean.class);

    private NewsDto newsDto;
    private List<NewsDto> newsDtoList;
    private boolean isEditMode;


    @Autowired
    public void setService(NewsService service) {
        this.service = service;
    }

    public NewsBean() {
        NewsDto newsDto = new NewsDto();
    }


    @PostConstruct
    public void init() {
        isEditMode = false;
        newsDto = new NewsDto();
        newsDtoList = new ArrayList<>();
        Iterable<News>  itr = service.retrieveAll();
        for (News news: itr) {
            UserDto userDto = new UserDto();
            userDto.setId(news.getId());
            userDto.setFamily(news.getSecUser().getFamily());
            userDto.setName(news.getSecUser().getName());
            NewsDto newsDto = new NewsDto(news.getId(), news.getBrif(),
                    news.getNews(),news.getTitle(),news.getCreateDate(),userDto);
            newsDtoList.add(newsDto);
        }
    }

    public NewsDto getNewsDto() {
        return newsDto;
    }

    public void setNewsDto(NewsDto newsDto) {
        this.newsDto = newsDto;
    }

    public List<NewsDto> getNewsDtoList() {
        return newsDtoList;
    }

    public boolean isEditMode() {
        return isEditMode;
    }

    public void insertRecord() {
        service.save(newsDto);
    }

    public void deleteRecord() {
        try {
            service.deleteById(newsDto.getId());
            init();
            showMessage("Done!");
        } catch (Exception e) {
            log.error(e);
            showMessage("Error!");
        }

    }

    public void editRecord() {
        isEditMode = true;
    }
}
