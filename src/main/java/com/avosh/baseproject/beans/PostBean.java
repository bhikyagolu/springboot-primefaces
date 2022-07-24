/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.PostDto;
import com.avosh.baseproject.services.PostService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("request")
public class PostBean extends BaseBean<PostService, PostDto>{
    private static final Logger log = Logger.getLogger(PostBean.class);
    private PostDto postDto;
    private List<PostDto> postDtoList;
    private boolean isEditMode;

    @Autowired
    public void setService(PostService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        isEditMode = false;
        dto = new PostDto();
        postDtoList = new ArrayList<>();
        postDtoList = service.retrieveAll();

    }

    public PostDto getPostDto() {
        return postDto;
    }

    public void setPostDto(PostDto postDto) {
        this.postDto = postDto;
    }

    public List<PostDto> getPostDtoList() {
        return postDtoList;
    }

    public boolean isEditMode() {
        return isEditMode;
    }

    public void insertRecord() {
        service.save(getDto());
    }

    public void deleteRecord() {
        try {
           // service.deleteById(newsDto.getId());
            init();
            showMessage("Done!");
        } catch (Exception e) {
            log.error(e);
            showMessage("Error!");
        }

    }

    public void editRecord() {
        isEditMode = true;
    }
}
