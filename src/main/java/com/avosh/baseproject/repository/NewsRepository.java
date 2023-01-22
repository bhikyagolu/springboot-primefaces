/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.repository;

import com.avosh.baseproject.entity.News;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends BaseRepository<News, Long> {
    List<News> retrieveAllByType(Pageable pageable);
}
