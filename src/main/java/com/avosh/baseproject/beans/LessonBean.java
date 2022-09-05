/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.LessonDto;
import com.avosh.baseproject.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Scope("request")
public class LessonBean extends BaseBean<LessonService, LessonDto> {
    private boolean isEditMode;
    private List<LessonDto> list;
    private LessonDto lessonDto;

    @Autowired
    public void setService(LessonService service) {
        this.service = service;
    }

    @PostConstruct
    private void init(){
        list = service.retrieveAll();
        lessonDto = new LessonDto();
        setDto(new LessonDto());
    }

    public boolean isEditMode() {
        return isEditMode;
    }

    public List<LessonDto> getList() {
        return list;
    }


    public LessonDto getDto() {
        return lessonDto;
    }


    public void setDto(LessonDto dto) {
        this.lessonDto = dto;

    }

    public void deleteRecord()  {
        super.delete();
        init();

    }
}
