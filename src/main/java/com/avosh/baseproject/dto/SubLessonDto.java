/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.dto;

import java.util.Date;

public class SubLessonDto extends BaseDto{

    private String title;
    private String desc;
    private Integer level;
    private Date createDateTime;
    private LessonDto lesson;

    public SubLessonDto() {
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
