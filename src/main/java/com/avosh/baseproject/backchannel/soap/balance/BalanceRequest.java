/**
 * BalanceRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.balance;

import com.avosh.baseproject.backchannel.model.Message;

public class BalanceRequest extends Message {
    private com.avosh.baseproject.backchannel.soap.balance.Credential credential;

    private java.lang.String accountNumber;

    public BalanceRequest() {
    }

    public BalanceRequest(
            com.avosh.baseproject.backchannel.soap.balance.Credential credential,
            java.lang.String accountNumber) {
        this.credential = credential;
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the credential value for this BalanceRequest.
     *
     * @return credential
     */
    public com.avosh.baseproject.backchannel.soap.balance.Credential getCredential() {
        return credential;
    }


    /**
     * Sets the credential value for this BalanceRequest.
     *
     * @param credential
     */
    public void setCredential(com.avosh.baseproject.backchannel.soap.balance.Credential credential) {
        this.credential = credential;
    }


    /**
     * Gets the accountNumber value for this BalanceRequest.
     *
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this BalanceRequest.
     *
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceRequest)) return false;
        BalanceRequest other = (BalanceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = ((this.credential == null && other.getCredential() == null) ||
                (this.credential != null &&
                        this.credential.equals(other.getCredential()))) &&
                ((this.accountNumber == null && other.getAccountNumber() == null) ||
                        (this.accountNumber != null &&
                                this.accountNumber.equals(other.getAccountNumber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCredential() != null) {
            _hashCode += getCredential().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BalanceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/schema/balanceRequest", ">BalanceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credential");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/schema/balanceRequest", "Credential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/schema/balanceRequest", ">Credential"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/schema/balanceRequest", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public void setMessage(String message) {

    }
}
