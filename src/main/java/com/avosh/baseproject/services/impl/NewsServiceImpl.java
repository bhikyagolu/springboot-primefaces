/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.dto.NewsDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.News;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.repository.NewsRepository;
import com.avosh.baseproject.services.NewsService;
import com.avosh.baseproject.util.Empty;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class NewsServiceImpl implements NewsService {
    private static final Logger log = Logger.getLogger(NewsServiceImpl.class);

    @Autowired
    NewsRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<NewsDto> retrieveAll(Pageable page) {
        List<News> res = repository.findAll(page);
        List<NewsDto>  newsDtoList =  new ArrayList<>();
        for (News news:res) {
            NewsDto dto = new NewsDto();
            UserDto userDto = new UserDto();
            userDto.setId(news.getSecUserId().getId());
            userDto.setFamily(news.getSecUserId().getFamily());
            userDto.setName(news.getSecUserId().getName());
            dto.setNews(news.getNews());
            dto.setBrief(news.getBrif());
            dto.setTitle(news.getTitle());
            dto.setUser(userDto);
            dto.setCreateDateTime(news.getCreateDate());
            newsDtoList.add(dto);
        }
        return newsDtoList;
    }

    @Override
    public void save(NewsDto dto) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        News news = new News();
        news.setNews(dto.getNews());
        news.setSecUserId(new SecUser(auth.getSecUser().getId()));
        news.setBrif(dto.getBrief());
        news.setTitle(dto.getTitle());
        news.setCreateDate(dto.getCreateDateTime());
        if (Empty.isNotEmpty(dto.getId())) {
            news.setId(dto.getId());
        }
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

    @Override
    public NewsDto retrieveById(Long id) {
        return null;
    }


}
