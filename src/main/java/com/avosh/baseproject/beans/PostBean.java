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
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("request")
public class PostBean extends BaseBean<PostService, PostDto> {
    private static final Logger log = Logger.getLogger(PostBean.class);
    private PostDto postDto;
    private List<PostDto> postDtoList;
    private boolean isEditMode;
    private UploadedFile originalImageFile;

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
        setDto(postDto);
    }

    public List<PostDto> getPostDtoList() {
        return postDtoList;
    }

    public boolean isEditMode() {
        return isEditMode;
    }


    public void doSave() {
        super.save();
        init();
    }



    public void deleteRecord() {
        super.delete();
        init();

    }

    public void editRecord() {
        isEditMode = true;
    }

    public void status(){
        isEditMode = true;
        setDto(new PostDto());
    }

    public void viewStatus(Boolean status){
        isEditMode = status;
        setDto(new PostDto());
    }

    public void handleFileUpload(FileUploadEvent event) {
        this.originalImageFile = null;
        UploadedFile file = event.getFile();
        if (file != null && file.getContent() != null && file.getContent().length > 0 && file.getFileName() != null) {
            this.originalImageFile = file;
            FacesMessage msg = new FacesMessage("Successful", this.originalImageFile.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
}
