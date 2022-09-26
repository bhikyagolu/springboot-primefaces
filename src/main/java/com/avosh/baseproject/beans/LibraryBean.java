/*******************************************************************************
* Created by Alireza Amirkhani 2022
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
