/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.QuestionDto;
import com.avosh.baseproject.entity.Question;
import com.avosh.baseproject.repository.QuestionRepository;

public interface QuestionService extends BaseService<QuestionRepository, Question, QuestionDto> {
}
