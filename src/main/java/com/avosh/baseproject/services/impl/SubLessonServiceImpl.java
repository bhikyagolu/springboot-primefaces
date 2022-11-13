/*******************************************************************************
 * Created by Alireza Amirkhani 2022
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
            SubLessonDto subLessonDto = new SubLessonDto(subLesson.getId(), subLesson.getTitle(),
                    subLesson.getDesc(), subLesson.getLevel(), subLesson.getCreateDateTime(),
                    new LessonDto(subLesson.getLessonId().getId(), subLesson.getLessonId().getTitle()));
            list.add(subLessonDto);

        }
        return list;
    }

    @Override
    public SubLessonDto retrieveById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
