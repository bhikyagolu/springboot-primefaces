/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.dto;

import java.util.Date;

public class SubLessonDto extends BaseDto {

    private String title;
    private String desc;
    private Integer level;
    private Date createDateTime;
    private LessonDto lesson;

    public SubLessonDto() {
    }

    public SubLessonDto(Long id) {
        this.id = id;
    }


    public SubLessonDto(Long id, String title, String desc, Integer level, Date createDateTime, LessonDto lesson) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.level = level;
        this.createDateTime = createDateTime;
        this.lesson = lesson;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public LessonDto getLesson() {
        return lesson;
    }

    public void setLesson(LessonDto lesson) {
        this.lesson = lesson;
    }
}
