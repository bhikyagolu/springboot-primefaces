/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.NewsDto;
import com.avosh.baseproject.services.NewsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("session")
public class NewsBean extends BaseBean<NewsService, NewsDto> {
    private static final Logger log = Logger.getLogger(NewsBean.class);

    private NewsDto newsDto;
    private List<NewsDto> newsDtoList;
    private boolean isEditMode;


    public NewsBean() {
        newsDto = new NewsDto();
    }

    @Autowired
    public void setService(NewsService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        isEditMode = false;
        setDto(new NewsDto());
        newsDto = new NewsDto();
        newsDtoList = new ArrayList<>();
        newsDtoList = service.retrieveAll();

    }

    public void viewStatus(Boolean status) {
        isEditMode = status;
        setDto(new NewsDto());
    }

    public void newStatus() {
        isEditMode = true;
        setDto(new NewsDto());
    }

    public NewsDto getNewsDto() {
        return newsDto;
    }

    public void setNewsDto(NewsDto newsDto) {
        this.newsDto = newsDto;
        setDto(newsDto);
    }

    public List<NewsDto> getNewsDtoList() {
        return newsDtoList;
    }

    public boolean isEditMode() {
        return isEditMode;
    }


    public void doSave() {
        super.save();
        init();
    }


    public void deleteRecord() {
        super.deleteById();
        init();

    }

}
