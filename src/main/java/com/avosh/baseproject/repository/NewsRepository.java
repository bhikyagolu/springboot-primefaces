/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.repository;

import com.avosh.baseproject.entity.News;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends BaseRepository<News, Long> {
}
