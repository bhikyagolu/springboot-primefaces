/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.QuestionDto;
import com.avosh.baseproject.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Scope("session")
public class QuestionBean extends BaseBean<QuestionService, QuestionDto> {
    private boolean isEditMode;
    private List<QuestionDto> list;
    private QuestionDto questionDto;

    @Autowired
    public void setService(QuestionService service) {
        this.service = service;
    }

    @PostConstruct
    private void init(){
        list = service.retrieveAll();
        questionDto = new QuestionDto();
        setDto(new QuestionDto());
    }

    public boolean isEditMode() {
        return isEditMode;
    }

    public List<QuestionDto> getList() {
        return list;
    }


    public QuestionDto getDto() {
        return questionDto;
    }


    public void setDto(QuestionDto dto) {
        this.questionDto = dto;
    }

    public void deleteRecord()  {
        super.delete();
        init();

    }
}
