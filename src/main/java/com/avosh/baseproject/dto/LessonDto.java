/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.dto;

public class LessonDto extends BaseDto{

    private String title;

    public LessonDto() {
    }

    public LessonDto(Long id, String title) {
        this.id = id;
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
