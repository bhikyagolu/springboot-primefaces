/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.dto;

import java.math.BigInteger;
import java.util.Date;

public class PackageDto extends BaseDto{
    private String title;
    private String desc;
    private BigInteger fee;
    private Integer discount;
    private Date endDiscount;
    private String picture;
    private SubLessonDto subLesson;

    public PackageDto() {
    }

    public PackageDto(Long id) {
        this.id = id;
    }

    public PackageDto(Long id, String title, String desc, BigInteger fee, Integer discount, Date endDiscount, String picture,SubLessonDto subLesson) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.fee = fee;
        this.discount = discount;
        this.endDiscount = endDiscount;
        this.picture = picture;
        this.subLesson = subLesson;

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

    public BigInteger getFee() {
        return fee;
    }

    public void setFee(BigInteger fee) {
        this.fee = fee;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Date getEndDiscount() {
        return endDiscount;
    }

    public void setEndDiscount(Date endDiscount) {
        this.endDiscount = endDiscount;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public SubLessonDto getSubLesson() {
        return subLesson;
    }

    public void setSubLesson(SubLessonDto subLesson) {
        this.subLesson = subLesson;
    }
}
