/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.services.UserProfileService;
import com.avosh.baseproject.util.Empty;
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
    UploadedFile file;
    private UploadedFile originalImageFile;
    private CroppedImage croppedImage;
    private String oldPassword;
    private String newPassword;

    @Autowired
    public void setService(UserProfileService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        UserDto profile = service.retrieveById(null);
        setDto(profile);

    }

    public void handleFileUpload(FileUploadEvent event) {
        this.originalImageFile = null;
        this.croppedImage = null;
        file = event.getFile();
        if (file != null && file.getContent() != null && file.getContent().length > 0 && file.getFileName() != null) {
            this.originalImageFile = file;
            FacesMessage msg = new FacesMessage("Successful", this.originalImageFile.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void uploadFile() {
        if (Empty.isNotEmpty(file)) {
            showMessage("Successful", file.getFileName() + " is uploaded.");
        } else {
            showMessage("Not Successful");
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
            service.changePassword(newPassword, oldPassword);
            showMessage("Saved");
        } catch (Exception e) {
            e.printStackTrace();
            showMessage("Not Saved");
        }
        newPassword = oldPassword = "";
    }

    public void saveContact() {
        try {
            service.updateContact(getDto());
            showMessage("Saved");
        } catch (Exception e) {
            e.printStackTrace();
            showMessage("Not Saved");
        }
    }

    public void saveProfile() {
        try {
            service.updateProfile(getDto());
            showMessage("Saved");
        } catch (Exception e) {
            e.printStackTrace();
            showMessage("Not Saved");
        }

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
