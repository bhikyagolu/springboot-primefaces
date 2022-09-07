/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.LessonDto;
import com.avosh.baseproject.dto.SubLessonDto;
import com.avosh.baseproject.entity.SubLesson;
import com.avosh.baseproject.repository.SubLessonRepository;
import com.avosh.baseproject.services.SubLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubLessonServiceImpl implements SubLessonService {

    @Autowired
    SubLessonRepository repository;

    @Override
    public void save(SubLessonDto dto) {

    }

    @Override
    public List<SubLessonDto> retrieveAll() {
        List<SubLessonDto> list = new ArrayList<>();
        Iterable<SubLesson> itr = repository.findAll();
        for (SubLesson subLesson : itr) {
            SubLessonDto subLessonDto = new SubLessonDto(subLesson.getId(),subLesson.getTitle(),
                    subLesson.getDesc(),subLesson.getLevel(),subLesson.getCreateDateTime(),
                    new LessonDto( subLesson.getLessonId().getId(), subLesson.getLessonId().getTitle()));
            list.add(subLessonDto);

        }
        return list;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
