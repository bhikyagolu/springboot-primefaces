/**
 * BatchFundTransferFollowUpRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.fundTransferFollowUp;

import com.avosh.baseproject.backchannel.model.Message;

public class BatchFundTransferFollowUpRequest extends Message {
    private com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.Credential credential;

    private java.lang.String followUpCode;

    private com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.TransactionItem[] rowItems;

    public BatchFundTransferFollowUpRequest() {
    }

    public BatchFundTransferFollowUpRequest(
            com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.Credential credential,
            java.lang.String followUpCode,
            com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.TransactionItem[] rowItems) {
        this.credential = credential;
        this.followUpCode = followUpCode;
        this.rowItems = rowItems;
    }


    /**
     * Gets the credential value for this BatchFundTransferFollowUpRequest.
     *
     * @return credential
     */
    public com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.Credential getCredential() {
        return credential;
    }


    /**
     * Sets the credential value for this BatchFundTransferFollowUpRequest.
     *
     * @param credential
     */
    public void setCredential(com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.Credential credential) {
        this.credential = credential;
    }


    /**
     * Gets the followUpCode value for this BatchFundTransferFollowUpRequest.
     *
     * @return followUpCode
     */
    public java.lang.String getFollowUpCode() {
        return followUpCode;
    }


    /**
     * Sets the followUpCode value for this BatchFundTransferFollowUpRequest.
     *
     * @param followUpCode
     */
    public void setFollowUpCode(java.lang.String followUpCode) {
        this.followUpCode = followUpCode;
    }


    /**
     * Gets the rowItems value for this BatchFundTransferFollowUpRequest.
     *
     * @return rowItems
     */
    public com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.TransactionItem[] getRowItems() {
        return rowItems;
    }


    /**
     * Sets the rowItems value for this BatchFundTransferFollowUpRequest.
     *
     * @param rowItems
     */
    public void setRowItems(com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.TransactionItem[] rowItems) {
        this.rowItems = rowItems;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchFundTransferFollowUpRequest)) return false;
        BatchFundTransferFollowUpRequest other = (BatchFundTransferFollowUpRequest) obj;
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
                ((this.followUpCode == null && other.getFollowUpCode() == null) ||
                        (this.followUpCode != null &&
                                this.followUpCode.equals(other.getFollowUpCode()))) &&
                ((this.rowItems == null && other.getRowItems() == null) ||
                        (this.rowItems != null &&
                                java.util.Arrays.equals(this.rowItems, other.getRowItems())));
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
        if (getFollowUpCode() != null) {
            _hashCode += getFollowUpCode().hashCode();
        }
        if (getRowItems() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRowItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRowItems(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BatchFundTransferFollowUpRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", ">BatchFundTransferFollowUpRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credential");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "Credential"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followUpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "followUpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "transactionItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "transactionItem"));
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
