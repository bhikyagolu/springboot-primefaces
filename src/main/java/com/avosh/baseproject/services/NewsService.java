/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.NewsDto;
import com.avosh.baseproject.entity.News;
import com.avosh.baseproject.repository.NewsRepository;

public interface NewsService extends BaseService<NewsRepository, News, NewsDto> {
    void deleteById(Long id);
//    Iterable<News> retrieveAll();

}
