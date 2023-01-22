/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.MessageDto;
import com.avosh.baseproject.dto.NewsDto;
import com.avosh.baseproject.entity.News;
import com.avosh.baseproject.repository.NewsRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NewsService extends BaseService<NewsRepository, News, NewsDto> {
    void deleteById(Long id);
    List<NewsDto> retrieveAll(Pageable paging);

}
