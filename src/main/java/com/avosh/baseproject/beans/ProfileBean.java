/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.services.UserProfileService;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.CroppedImage;
import org.primefaces.model.file.UploadedFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Component
@Scope("session")
public class ProfileBean extends BaseBean<UserProfileService, UserDto> {
    private UploadedFile originalImageFile;
    private CroppedImage croppedImage;

    private String oldPassword;
    private String newPassword;


    @Autowired
    public void setService(UserProfileService service) {
        this.service = service;
    }

    @PostConstruct
    private void init() {
        UserDto profile = service.retrieveById();
        setDto(profile);

    }

    public void handleFileUpload(FileUploadEvent event) {
        this.originalImageFile = null;
        this.croppedImage = null;
        UploadedFile file = event.getFile();
        if (file != null && file.getContent() != null && file.getContent().length > 0 && file.getFileName() != null) {
            this.originalImageFile = file;
            FacesMessage msg = new FacesMessage("Successful", this.originalImageFile.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public UploadedFile getOriginalImageFile() {
        return originalImageFile;
    }

    public CroppedImage getCroppedImage() {
        return croppedImage;
    }

    public void setCroppedImage(CroppedImage croppedImage) {
        this.croppedImage = croppedImage;
    }




    public void changePassword() {
        try {
            service.changePassword(newPassword,oldPassword);
            showMessage("Saved");
        } catch (Exception e) {
            e.printStackTrace();
            showMessage("Not Saved");
        }
        newPassword = oldPassword = "";
    }

    public void saveContact() {
        System.out.println("saveContact");
    }

    public void saveProfile() {
        System.out.println("saveContact");

    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
