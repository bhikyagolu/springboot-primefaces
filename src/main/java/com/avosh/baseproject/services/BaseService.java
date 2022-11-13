/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;


import com.avosh.baseproject.dto.BaseDto;
import com.avosh.baseproject.entity.BaseEntity;
import com.avosh.baseproject.repository.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface BaseService<R extends BaseRepository, M extends BaseEntity, D extends BaseDto> {
    void save(D dto);

    List<D> retrieveAll();

    D retrieveById(Long id);

    void deleteById(Long id);
}
