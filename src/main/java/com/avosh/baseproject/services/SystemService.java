/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.SystemDto;
import com.avosh.baseproject.entity.System;
import com.avosh.baseproject.repository.SystemRepository;

public interface SystemService extends BaseService<SystemRepository, System, SystemDto> {
}
