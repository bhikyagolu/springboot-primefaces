/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.BaseDto;
import com.avosh.baseproject.excptions.BaseException;
import com.avosh.baseproject.services.BaseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;


public abstract class BaseBean<SRV extends BaseService, D extends BaseDto>  implements Serializable {
    @Autowired
    private MessageSource messageSource;
    private static final Logger log = Logger.getLogger(BaseBean.class);
    private boolean isEditMode;
    protected SRV service;
    private D dto;
    protected List<D> list;

    public boolean isEditMode() {
        return isEditMode;
    }

    public void setEditMode(boolean editMode) {
        isEditMode = editMode;
    }

    public D getDto() {
        return dto;
    }

    public void setDto(D dto) {
        this.dto = dto;
    }


    public SRV getService() {
        return service;
    }

    public List<D> getList() {
        return list;
    }

    public void setList(List<D> list) {
        this.list = list;
    }

    public void doFind(){

    }
    public  void save(){
        try {
            service.save(getDto());
            messageSource.getMessage("app.header", null, Locale.ENGLISH);
            showMessage("Done!");
        } catch (Exception e) {
            log.error(e);
            showMessage("Error!");
        }finally {

        }
    }
    public abstract void init();


    public  void delete(){
        try {
            service.deleteById(dto.getId());
            showMessage("Done!");
        } catch (Exception e) {
            log.error(e);
            showMessage("Error!");
        }
    }


    protected void saveError(String clientId, String errorKey) {
        FacesMessage message = new FacesMessage(errorKey);
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(clientId,message);

    }

    protected void saveInfo(String clientId, String errorKey) {
        FacesMessage message = new FacesMessage(errorKey);
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(clientId,message);

    }

    protected void saveWarning(String clientId, String errorKey) {
        FacesMessage message = new FacesMessage(errorKey);
        message.setSeverity(FacesMessage.SEVERITY_WARN);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(clientId,message);
    }

    protected void saveError(BaseException e) {
        saveError("messagesPanel", e.getClass().getName());
    }

    protected void saveWarning(BaseException e) {
        saveWarning("messagesPanel", e.getClass().getName());
    }

    protected void saveInfo(BaseException e) {
        saveInfo("messagesPanel", e.getClass().getName());
    }
    protected void showMessage(String title,String detail){
        FacesMessage msg = new FacesMessage(title, detail);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    protected void showMessage(String detail){
        FacesMessage msg = new FacesMessage( detail);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
