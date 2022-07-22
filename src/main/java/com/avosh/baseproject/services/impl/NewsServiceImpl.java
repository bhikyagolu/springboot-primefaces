/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.dto.BaseDto;
import com.avosh.baseproject.dto.NewsDto;
import com.avosh.baseproject.entity.News;

import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.repository.NewsRepository;
import com.avosh.baseproject.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsRepository newRepository;
    @Autowired
    private org.springframework.core.env.Environment environment;

    @Override
    public void deleteById(Long id) {
        newRepository.deleteById(id);
    }

    @Override
    public Iterable<News> retrieveAll() {
        return newRepository.findAll();
    }

    @Transactional
    @Override
    public void save(BaseDto dto) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        News news = new News();
        news.setNews(((NewsDto)dto).getNews());
        news.setSecUser(new SecUser(auth.getSecUser().getId()));
        news.setBrif(((NewsDto)dto).getBrief());
        news.setTitle(((NewsDto)dto).getTitle());
        news.setCreateDate(((NewsDto)dto).getCreateDateTime());
        newRepository.save(news);
    }
}
