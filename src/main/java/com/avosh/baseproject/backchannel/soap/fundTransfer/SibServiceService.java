/**
 * SibServiceService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.fundTransfer;

public interface SibServiceService extends javax.xml.rpc.Service {
    java.lang.String getSibServiceSoap11Address();

    com.avosh.baseproject.backchannel.soap.fundTransfer.SibService getSibServiceSoap11() throws javax.xml.rpc.ServiceException;

    com.avosh.baseproject.backchannel.soap.fundTransfer.SibService getSibServiceSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
