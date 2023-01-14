/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.beans;

import com.avosh.baseproject.dto.BaseDto;
import com.avosh.baseproject.services.BaseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.i18n.LocaleContextHolder;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;

@Scope("session")
public abstract class BaseBean<SRV extends BaseService, D extends BaseDto> implements Serializable {
    private static final Logger log = Logger.getLogger(BaseBean.class);
    @Autowired
    private MessageSource messageSource;

    protected SRV service;
    protected List<D> list;
    private boolean isEditMode;
    private D dto;

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

    public abstract void init();

    public void findById() {

    }

    public void save() {
        try {
            service.save(getDto());
            showMessage("message.save.done");
        } catch (Exception e) {
            log.error(e);
            showExceptionMessage(e);
        } finally {

        }
    }


    public void delete() {
        try {
            service.deleteById(dto.getId());
            showMessage("message.delete.done");
        } catch (Exception e) {
            log.error(e);
            showExceptionMessage(e);
        }
    }


    protected void showMessage(String title, String detail) {
        FacesMessage msg = new FacesMessage(title, detail);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    protected void showExceptionMessage(Exception exception) {
        String message = messageSource.getMessage(
                exception.getClass().getName(), null, setLocale());
        FacesMessage msg = new FacesMessage(message);
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    protected void showMessage(String detail) {
        String message = messageSource.getMessage(detail, null, setLocale());
        FacesMessage msg = new FacesMessage(message);
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    protected void showErrorMessage(String detail) {
        String message = messageSource.getMessage(detail, null, setLocale());
        FacesMessage msg = new FacesMessage(message);
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    protected void showWarnMessage(String detail) {
        String message = messageSource.getMessage(detail, null, setLocale());
        FacesMessage msg = new FacesMessage(message);
        msg.setSeverity(FacesMessage.SEVERITY_WARN);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    private Locale setLocale() {
        try {
            String locale =  LocaleContextHolder.getLocale().getLanguage();
            return new Locale(locale);
        } catch (Exception e) {
            return LocaleContextHolder.getLocale();
        }
    }
}
