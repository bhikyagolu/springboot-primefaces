/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.dto;

public class LibraryDto extends BaseDto {

    private Integer type;
    private String name;
    private SubLessonDto lessonDto;

    public LibraryDto() {
    }

    public LibraryDto(Long id, Integer type, String name, SubLessonDto lessonDto) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.lessonDto = lessonDto;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubLessonDto getLessonDto() {
        return lessonDto;
    }

    public void setLessonDto(SubLessonDto lessonDto) {
        this.lessonDto = lessonDto;
    }
}
