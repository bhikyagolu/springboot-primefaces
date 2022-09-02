/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.BaseDto;
import com.avosh.baseproject.excptions.BaseException;
import com.avosh.baseproject.services.BaseService;
import org.apache.log4j.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.Serializable;


public abstract class BaseBean<SRV extends BaseService, D extends BaseDto>  implements Serializable {
    private static final Logger log = Logger.getLogger(BaseBean.class);
    protected SRV service;
    protected D dto;

    public D getDto() {
        return dto;
    }

    public void setDto(D dto) {
        this.dto = dto;
    }


    public SRV getService() {
        return service;
    }

    public void doFind(){

    }
    public  void save(){
        try {
            service.save(getDto());
            showMessage("Done!");
        } catch (Exception e) {
            log.error(e);
            showMessage("Error!");
        }
    }


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
