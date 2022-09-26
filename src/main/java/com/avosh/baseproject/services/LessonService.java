/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.LessonDto;
import com.avosh.baseproject.entity.Lesson;
import com.avosh.baseproject.repository.LessonRepository;

public interface LessonService extends BaseService<LessonRepository, Lesson, LessonDto>{
}
