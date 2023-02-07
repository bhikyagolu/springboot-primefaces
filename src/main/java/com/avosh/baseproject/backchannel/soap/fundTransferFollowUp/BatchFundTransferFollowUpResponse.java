/**
 * BatchFundTransferFollowUpResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.fundTransferFollowUp;

import com.avosh.baseproject.backchannel.model.Message;

public class BatchFundTransferFollowUpResponse extends Message {
    private java.lang.String resultCode;

    private java.lang.String resultDescription;

    private long followUpCode;

    private java.lang.String transactionNumber;

    private com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.BatchFundTransferItem[] batchFundTransferItems;

    public BatchFundTransferFollowUpResponse() {
    }

    public BatchFundTransferFollowUpResponse(
            java.lang.String resultCode,
            java.lang.String resultDescription,
            long followUpCode,
            java.lang.String transactionNumber,
            com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.BatchFundTransferItem[] batchFundTransferItems) {
        this.resultCode = resultCode;
        this.resultDescription = resultDescription;
        this.followUpCode = followUpCode;
        this.transactionNumber = transactionNumber;
        this.batchFundTransferItems = batchFundTransferItems;
    }


    /**
     * Gets the resultCode value for this BatchFundTransferFollowUpResponse.
     *
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this BatchFundTransferFollowUpResponse.
     *
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultDescription value for this BatchFundTransferFollowUpResponse.
     *
     * @return resultDescription
     */
    public java.lang.String getResultDescription() {
        return resultDescription;
    }


    /**
     * Sets the resultDescription value for this BatchFundTransferFollowUpResponse.
     *
     * @param resultDescription
     */
    public void setResultDescription(java.lang.String resultDescription) {
        this.resultDescription = resultDescription;
    }


    /**
     * Gets the followUpCode value for this BatchFundTransferFollowUpResponse.
     *
     * @return followUpCode
     */
    public long getFollowUpCode() {
        return followUpCode;
    }


    /**
     * Sets the followUpCode value for this BatchFundTransferFollowUpResponse.
     *
     * @param followUpCode
     */
    public void setFollowUpCode(long followUpCode) {
        this.followUpCode = followUpCode;
    }


    /**
     * Gets the transactionNumber value for this BatchFundTransferFollowUpResponse.
     *
     * @return transactionNumber
     */
    public java.lang.String getTransactionNumber() {
        return transactionNumber;
    }


    /**
     * Sets the transactionNumber value for this BatchFundTransferFollowUpResponse.
     *
     * @param transactionNumber
     */
    public void setTransactionNumber(java.lang.String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }


    /**
     * Gets the batchFundTransferItems value for this BatchFundTransferFollowUpResponse.
     *
     * @return batchFundTransferItems
     */
    public com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.BatchFundTransferItem[] getBatchFundTransferItems() {
        return batchFundTransferItems;
    }


    /**
     * Sets the batchFundTransferItems value for this BatchFundTransferFollowUpResponse.
     *
     * @param batchFundTransferItems
     */
    public void setBatchFundTransferItems(com.avosh.baseproject.backchannel.soap.fundTransferFollowUp.BatchFundTransferItem[] batchFundTransferItems) {
        this.batchFundTransferItems = batchFundTransferItems;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchFundTransferFollowUpResponse)) return false;
        BatchFundTransferFollowUpResponse other = (BatchFundTransferFollowUpResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = ((this.resultCode == null && other.getResultCode() == null) ||
                (this.resultCode != null &&
                        this.resultCode.equals(other.getResultCode()))) &&
                ((this.resultDescription == null && other.getResultDescription() == null) ||
                        (this.resultDescription != null &&
                                this.resultDescription.equals(other.getResultDescription()))) &&
                this.followUpCode == other.getFollowUpCode() &&
                ((this.transactionNumber == null && other.getTransactionNumber() == null) ||
                        (this.transactionNumber != null &&
                                this.transactionNumber.equals(other.getTransactionNumber()))) &&
                ((this.batchFundTransferItems == null && other.getBatchFundTransferItems() == null) ||
                        (this.batchFundTransferItems != null &&
                                java.util.Arrays.equals(this.batchFundTransferItems, other.getBatchFundTransferItems())));
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
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getResultDescription() != null) {
            _hashCode += getResultDescription().hashCode();
        }
        _hashCode += new Long(getFollowUpCode()).hashCode();
        if (getTransactionNumber() != null) {
            _hashCode += getTransactionNumber().hashCode();
        }
        if (getBatchFundTransferItems() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBatchFundTransferItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBatchFundTransferItems(), i);
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
            new org.apache.axis.description.TypeDesc(BatchFundTransferFollowUpResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", ">BatchFundTransferFollowUpResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followUpCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "followUpCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchFundTransferItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batchFundTransferItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "batchFundTransferItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "batchFundTransferItem"));
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
