/**
 * SibServiceServiceLocator.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.fundTransferFollowUp;

public class SibServiceServiceLocator extends org.apache.axis.client.Service implements com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.SibServiceService {

    public SibServiceServiceLocator() {
    }


    public SibServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SibServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SibServiceSoap11
    private java.lang.String SibServiceSoap11_address = "https://cb.tejaratbank.ir:443/service/batchFundTransferFollowUpService";

    public java.lang.String getSibServiceSoap11Address() {
        return SibServiceSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SibServiceSoap11WSDDServiceName = "SibServiceSoap11";

    public java.lang.String getSibServiceSoap11WSDDServiceName() {
        return SibServiceSoap11WSDDServiceName;
    }

    public void setSibServiceSoap11WSDDServiceName(java.lang.String name) {
        SibServiceSoap11WSDDServiceName = name;
    }

    public com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.SibService getSibServiceSoap11() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SibServiceSoap11_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSibServiceSoap11(endpoint);
    }

    public com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.SibService getSibServiceSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.SibServiceSoap11Stub _stub = new com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.SibServiceSoap11Stub(portAddress, this);
            _stub.setPortName(getSibServiceSoap11WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSibServiceSoap11EndpointAddress(java.lang.String address) {
        SibServiceSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.SibService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.SibServiceSoap11Stub _stub = new com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.SibServiceSoap11Stub(new java.net.URL(SibServiceSoap11_address), this);
                _stub.setPortName(getSibServiceSoap11WSDDServiceName());
                return _stub;
            }
        } catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SibServiceSoap11".equals(inputPortName)) {
            return getSibServiceSoap11();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "SibServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "SibServiceSoap11"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("SibServiceSoap11".equals(portName)) {
            setSibServiceSoap11EndpointAddress(address);
        } else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
