/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.LessonDto;
import com.avosh.baseproject.dto.QuestionDto;
import com.avosh.baseproject.dto.SubLessonDto;
import com.avosh.baseproject.entity.Lesson;
import com.avosh.baseproject.entity.Question;
import com.avosh.baseproject.repository.QuestionRepository;
import com.avosh.baseproject.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository repository;

    @Override
    public void save(QuestionDto dto) {

    }

    @Override
    public List<QuestionDto> retrieveAll() {
        List<QuestionDto> list = new ArrayList<>();
        Iterable<Question> itr = repository.findAll();
        for (Question question : itr) {

            QuestionDto questionDto = new QuestionDto(question.getId(),question.getQuestion(),question.getHasVoice(),
                    question.getHasVideo(),question.getPicture(),question.getCreateDate(),
                    new SubLessonDto(question.getSubLessonId().getId(),question.getSubLessonId().getTitle(),null,null,null,null));
            list.add(questionDto);

        }
        return list;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
