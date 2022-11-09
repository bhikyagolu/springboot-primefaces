/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.SubLessonDto;
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
    public void init() {
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

    public void deleteRecord() {
        super.deleteById();
        init();

    }
}
