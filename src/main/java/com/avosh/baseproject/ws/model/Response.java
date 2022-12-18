/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private String resultCode;
    private String resultDescription;
    private ExceptionDetail exceptionDetail;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    public ExceptionDetail getExceptionDetail() {
        return exceptionDetail;
    }

    public void setExceptionDetail(ExceptionDetail exceptionDetail) {
        this.exceptionDetail = exceptionDetail;
    }
}
