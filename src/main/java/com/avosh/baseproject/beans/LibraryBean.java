/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.LibraryDto;
import com.avosh.baseproject.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Scope("session")
public class LibraryBean extends BaseBean<LibraryService, LibraryDto> {
    private boolean isEditMode;
    private List<LibraryDto> list;
    private LibraryDto lessonDto;

    @Autowired
    public void setService(LibraryService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        list = service.retrieveAll();
        lessonDto = new LibraryDto();
        setDto(new LibraryDto());
    }

    public boolean isEditMode() {
        return isEditMode;
    }

    public List<LibraryDto> getList() {
        return list;
    }


    public LibraryDto getDto() {
        return lessonDto;
    }


    public void setDto(LibraryDto dto) {
        this.lessonDto = dto;
        super.setDto(lessonDto);
    }

    public void deleteRecord() {
        super.delete();


    }
}
