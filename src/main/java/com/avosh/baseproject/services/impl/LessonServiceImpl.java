/*******************************************************************************
 * Created by Alireza Amirkhani 2022
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

            LessonDto lessonDto = new LessonDto(lesson.getId(), lesson.getTitle());
            list.add(lessonDto);

        }
        return list;
    }

    @Override
    public LessonDto retrieveById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
