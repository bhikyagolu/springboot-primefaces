/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.QuestionDto;
import com.avosh.baseproject.entity.Question;
import com.avosh.baseproject.repository.QuestionRepository;

public interface QuestionService extends BaseService<QuestionRepository, Question, QuestionDto>{
}
