/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.LessonDto;
import com.avosh.baseproject.entity.Lesson;
import com.avosh.baseproject.repository.LessonRepository;
import com.avosh.baseproject.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    LessonRepository repository;

    @Override
    public void save(LessonDto dto) {

    }

    @Override
    public List<LessonDto> retrieveAll() {
        List<LessonDto> list = new ArrayList<>();
        Iterable<Lesson> itr = repository.findAll();
        for (Lesson lesson : itr) {

            LessonDto lessonDto = new LessonDto(lesson.getId(),lesson.getTitle());
            list.add(lessonDto);

        }
        return list;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
