/**
 * SIBServiceServiceLocator.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.billPaymentFollowup;

public class SIBServiceServiceLocator extends org.apache.axis.client.Service implements com.avosh.baseproject.backchannel.soap.billPaymentFollowup.SIBServiceService {

    public SIBServiceServiceLocator() {
    }


    public SIBServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SIBServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SIBServiceSoap11
    private java.lang.String SIBServiceSoap11_address = "https://cb.tejaratbank.ir:443/service/batchBillPaymentFollowupService";

    public java.lang.String getSIBServiceSoap11Address() {
        return SIBServiceSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SIBServiceSoap11WSDDServiceName = "SIBServiceSoap11";

    public java.lang.String getSIBServiceSoap11WSDDServiceName() {
        return SIBServiceSoap11WSDDServiceName;
    }

    public void setSIBServiceSoap11WSDDServiceName(java.lang.String name) {
        SIBServiceSoap11WSDDServiceName = name;
    }

    public com.avosh.baseproject.backchannel.soap.billPaymentFollowup.SIBService getSIBServiceSoap11() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SIBServiceSoap11_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSIBServiceSoap11(endpoint);
    }

    public com.avosh.baseproject.backchannel.soap.billPaymentFollowup.SIBService getSIBServiceSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.avosh.baseproject.backchannel.soap.billPaymentFollowup.SIBServiceSoap11Stub _stub = new com.avosh.baseproject.backchannel.soap.billPaymentFollowup.SIBServiceSoap11Stub(portAddress, this);
            _stub.setPortName(getSIBServiceSoap11WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSIBServiceSoap11EndpointAddress(java.lang.String address) {
        SIBServiceSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.avosh.baseproject.backchannel.soap.billPaymentFollowup.SIBService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.avosh.baseproject.backchannel.soap.billPaymentFollowup.SIBServiceSoap11Stub _stub = new com.avosh.baseproject.backchannel.soap.billPaymentFollowup.SIBServiceSoap11Stub(new java.net.URL(SIBServiceSoap11_address), this);
                _stub.setPortName(getSIBServiceSoap11WSDDServiceName());
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
        if ("SIBServiceSoap11".equals(inputPortName)) {
            return getSIBServiceSoap11();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "SIBServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "SIBServiceSoap11"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("SIBServiceSoap11".equals(portName)) {
            setSIBServiceSoap11EndpointAddress(address);
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
