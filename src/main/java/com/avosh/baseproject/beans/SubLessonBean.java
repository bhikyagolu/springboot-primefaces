/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.SubLessonDto;
import com.avosh.baseproject.services.LessonService;
import com.avosh.baseproject.services.SubLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Scope("request")
public class SubLessonBean extends BaseBean<SubLessonService, SubLessonDto> {
    private boolean isEditMode;
    private List<SubLessonDto> list;
    private SubLessonDto subLessonDto;


    @Autowired
    public void setService(SubLessonService service) {
        this.service = service;
    }

    @PostConstruct
    private void init(){
        list = service.retrieveAll();
        subLessonDto = new SubLessonDto();
        setDto(new SubLessonDto());
    }

    public boolean isEditMode() {
        return isEditMode;
    }

    public List<SubLessonDto> getList() {
        return list;
    }


    public SubLessonDto getDto() {
        return subLessonDto;
    }


    public void setDto(SubLessonDto dto) {
        this.subLessonDto = dto;

    }

    public void deleteRecord()  {
        super.delete();
        init();

    }
}
