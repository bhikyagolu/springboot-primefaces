/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.dto;

import java.util.Date;

public class QuestionDto extends BaseDto{

    private String question;
    private Boolean hasVoice;
    private Boolean hasVideo;
    private String picture;
    private Date createDate;
    private SubLessonDto subLesson;

    public QuestionDto() {
    }

    public QuestionDto(Long id, String question, Boolean hasVoice, Boolean hasVideo, String picture, Date createDate, SubLessonDto subLesson) {
        this.id = id;
        this.question = question;
        this.hasVoice = hasVoice;
        this.hasVideo = hasVideo;
        this.picture = picture;
        this.createDate = createDate;
        this.subLesson = subLesson;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Boolean getHasVoice() {
        return hasVoice;
    }

    public void setHasVoice(Boolean hasVoice) {
        this.hasVoice = hasVoice;
    }

    public Boolean getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(Boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public SubLessonDto getSubLesson() {
        return subLesson;
    }

    public void setSubLesson(SubLessonDto subLesson) {
        this.subLesson = subLesson;
    }
}
