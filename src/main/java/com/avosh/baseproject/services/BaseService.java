/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services;


import com.avosh.baseproject.dto.BaseDto;
import com.avosh.baseproject.entity.BaseEntity;
import com.avosh.baseproject.repository.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface BaseService<R extends BaseRepository, M extends BaseEntity,D extends BaseDto> {
    public void save(D dto);
    List<D> retrieveAll();
}
