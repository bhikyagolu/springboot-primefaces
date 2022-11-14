/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.SchedulerDto;
import com.avosh.baseproject.entity.Scheduler;
import com.avosh.baseproject.repository.SchedulerRepository;

public interface SchedulerService extends BaseService<SchedulerRepository, Scheduler, SchedulerDto> {
}
