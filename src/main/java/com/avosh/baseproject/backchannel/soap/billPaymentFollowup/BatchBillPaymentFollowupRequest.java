/**
 * BatchBillPaymentFollowupRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.billPaymentFollowup;

import com.avosh.baseproject.backchannel.model.Message;

public class BatchBillPaymentFollowupRequest extends Message {
    private com.avosh.baseproject.backchannel.soap.billPaymentFollowup.Credential credential;

    private long followupCode;

    private long sourceAccount;

    public BatchBillPaymentFollowupRequest() {
    }

    public BatchBillPaymentFollowupRequest(
            com.avosh.baseproject.backchannel.soap.billPaymentFollowup.Credential credential,
            long followupCode,
            long sourceAccount) {
        this.credential = credential;
        this.followupCode = followupCode;
        this.sourceAccount = sourceAccount;
    }


    /**
     * Gets the credential value for this BatchBillPaymentFollowupRequest.
     *
     * @return credential
     */
    public com.avosh.baseproject.backchannel.soap.billPaymentFollowup.Credential getCredential() {
        return credential;
    }


    /**
     * Sets the credential value for this BatchBillPaymentFollowupRequest.
     *
     * @param credential
     */
    public void setCredential(com.avosh.baseproject.backchannel.soap.billPaymentFollowup.Credential credential) {
        this.credential = credential;
    }


    /**
     * Gets the followupCode value for this BatchBillPaymentFollowupRequest.
     *
     * @return followupCode
     */
    public long getFollowupCode() {
        return followupCode;
    }


    /**
     * Sets the followupCode value for this BatchBillPaymentFollowupRequest.
     *
     * @param followupCode
     */
    public void setFollowupCode(long followupCode) {
        this.followupCode = followupCode;
    }


    /**
     * Gets the sourceAccount value for this BatchBillPaymentFollowupRequest.
     *
     * @return sourceAccount
     */
    public long getSourceAccount() {
        return sourceAccount;
    }


    /**
     * Sets the sourceAccount value for this BatchBillPaymentFollowupRequest.
     *
     * @param sourceAccount
     */
    public void setSourceAccount(long sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchBillPaymentFollowupRequest)) return false;
        BatchBillPaymentFollowupRequest other = (BatchBillPaymentFollowupRequest) obj;
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
                this.followupCode == other.getFollowupCode() &&
                this.sourceAccount == other.getSourceAccount();
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
        _hashCode += new Long(getFollowupCode()).hashCode();
        _hashCode += new Long(getSourceAccount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BatchBillPaymentFollowupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", ">BatchBillPaymentFollowupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credential");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Credential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "Credential"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FollowupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SourceAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
