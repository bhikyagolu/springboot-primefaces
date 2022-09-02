/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.dto.NewsDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.News;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.repository.NewsRepository;
import com.avosh.baseproject.services.NewsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    private static final Logger log = Logger.getLogger(NewsServiceImpl.class);

    @Autowired
    NewsRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(NewsDto dto) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        News news = new News();
        news.setNews(((NewsDto)dto).getNews());
        news.setSecUserId(new SecUser(auth.getSecUser().getId()));
        news.setBrif(((NewsDto)dto).getBrief());
        news.setTitle(((NewsDto)dto).getTitle());
        news.setCreateDate(((NewsDto)dto).getCreateDateTime());
        repository.save(news);
    }

    @Override
    public List<NewsDto> retrieveAll() {
        List<NewsDto> newsDtoList = new ArrayList<>();
        Iterable<News> itr = repository.findAll();
        for (News news : itr) {
            UserDto userDto = new UserDto();
            userDto.setId(news.getSecUserId().getId());
            userDto.setFamily(news.getSecUserId().getFamily());
            userDto.setName(news.getSecUserId().getName());
            NewsDto newsDto = new NewsDto(news.getId(), news.getBrif(),
                    news.getNews(), news.getTitle(), news.getCreateDate(), userDto);
            newsDtoList.add(newsDto);

        }
        return newsDtoList;
    }


}
