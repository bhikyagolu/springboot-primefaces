/*******************************************************************************
* Created by Alireza Amirkhani 2022
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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("session")
public class PostBean extends BaseBean<PostService, PostDto> {
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
       setDto(new PostDto());
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

    public void doSave()  {
        super.save();
        init();
    }



    public void deleteRecord()  {
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
        try {
            UploadedFile file = event.getFile();
            if (file != null) {
                FacesMessage message = new FacesMessage("Successful", file.getFileName() + " is uploaded.");
                FacesContext.getCurrentInstance().addMessage(null, message);
            }
            InputStream inputStream = file.getInputStream();
            postDto.setPhoto(inputStream);
            super.save();
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
