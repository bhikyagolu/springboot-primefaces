/**
 * BatchBillPaymentFollowupResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.billPaymentFollowup;

import com.avosh.baseproject.backchannel.model.Message;

public class BatchBillPaymentFollowupResponse extends Message {
    private java.lang.String resultCodeTotal;

    private java.lang.String resultDescriptionTotal;

    private long followupCodeResponse;

    private java.lang.String transactionNumberTotal;

    private long sourceAccountResponse;

    private com.avosh.baseproject.backchannel.soap.billPaymentFollowup.BillPaymentFollowupResponse[] billPaymentFollowupResponses;

    public BatchBillPaymentFollowupResponse() {
    }

    public BatchBillPaymentFollowupResponse(
            java.lang.String resultCodeTotal,
            java.lang.String resultDescriptionTotal,
            long followupCodeResponse,
            java.lang.String transactionNumberTotal,
            long sourceAccountResponse,
            com.avosh.baseproject.backchannel.soap.billPaymentFollowup.BillPaymentFollowupResponse[] billPaymentFollowupResponses) {
        this.resultCodeTotal = resultCodeTotal;
        this.resultDescriptionTotal = resultDescriptionTotal;
        this.followupCodeResponse = followupCodeResponse;
        this.transactionNumberTotal = transactionNumberTotal;
        this.sourceAccountResponse = sourceAccountResponse;
        this.billPaymentFollowupResponses = billPaymentFollowupResponses;
    }


    /**
     * Gets the resultCodeTotal value for this BatchBillPaymentFollowupResponse.
     *
     * @return resultCodeTotal
     */
    public java.lang.String getResultCodeTotal() {
        return resultCodeTotal;
    }


    /**
     * Sets the resultCodeTotal value for this BatchBillPaymentFollowupResponse.
     *
     * @param resultCodeTotal
     */
    public void setResultCodeTotal(java.lang.String resultCodeTotal) {
        this.resultCodeTotal = resultCodeTotal;
    }


    /**
     * Gets the resultDescriptionTotal value for this BatchBillPaymentFollowupResponse.
     *
     * @return resultDescriptionTotal
     */
    public java.lang.String getResultDescriptionTotal() {
        return resultDescriptionTotal;
    }


    /**
     * Sets the resultDescriptionTotal value for this BatchBillPaymentFollowupResponse.
     *
     * @param resultDescriptionTotal
     */
    public void setResultDescriptionTotal(java.lang.String resultDescriptionTotal) {
        this.resultDescriptionTotal = resultDescriptionTotal;
    }


    /**
     * Gets the followupCodeResponse value for this BatchBillPaymentFollowupResponse.
     *
     * @return followupCodeResponse
     */
    public long getFollowupCodeResponse() {
        return followupCodeResponse;
    }


    /**
     * Sets the followupCodeResponse value for this BatchBillPaymentFollowupResponse.
     *
     * @param followupCodeResponse
     */
    public void setFollowupCodeResponse(long followupCodeResponse) {
        this.followupCodeResponse = followupCodeResponse;
    }


    /**
     * Gets the transactionNumberTotal value for this BatchBillPaymentFollowupResponse.
     *
     * @return transactionNumberTotal
     */
    public java.lang.String getTransactionNumberTotal() {
        return transactionNumberTotal;
    }


    /**
     * Sets the transactionNumberTotal value for this BatchBillPaymentFollowupResponse.
     *
     * @param transactionNumberTotal
     */
    public void setTransactionNumberTotal(java.lang.String transactionNumberTotal) {
        this.transactionNumberTotal = transactionNumberTotal;
    }


    /**
     * Gets the sourceAccountResponse value for this BatchBillPaymentFollowupResponse.
     *
     * @return sourceAccountResponse
     */
    public long getSourceAccountResponse() {
        return sourceAccountResponse;
    }


    /**
     * Sets the sourceAccountResponse value for this BatchBillPaymentFollowupResponse.
     *
     * @param sourceAccountResponse
     */
    public void setSourceAccountResponse(long sourceAccountResponse) {
        this.sourceAccountResponse = sourceAccountResponse;
    }


    /**
     * Gets the billPaymentFollowupResponses value for this BatchBillPaymentFollowupResponse.
     *
     * @return billPaymentFollowupResponses
     */
    public com.avosh.baseproject.backchannel.soap.billPaymentFollowup.BillPaymentFollowupResponse[] getBillPaymentFollowupResponses() {
        return billPaymentFollowupResponses;
    }


    /**
     * Sets the billPaymentFollowupResponses value for this BatchBillPaymentFollowupResponse.
     *
     * @param billPaymentFollowupResponses
     */
    public void setBillPaymentFollowupResponses(com.avosh.baseproject.backchannel.soap.billPaymentFollowup.BillPaymentFollowupResponse[] billPaymentFollowupResponses) {
        this.billPaymentFollowupResponses = billPaymentFollowupResponses;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchBillPaymentFollowupResponse)) return false;
        BatchBillPaymentFollowupResponse other = (BatchBillPaymentFollowupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = ((this.resultCodeTotal == null && other.getResultCodeTotal() == null) ||
                (this.resultCodeTotal != null &&
                        this.resultCodeTotal.equals(other.getResultCodeTotal()))) &&
                ((this.resultDescriptionTotal == null && other.getResultDescriptionTotal() == null) ||
                        (this.resultDescriptionTotal != null &&
                                this.resultDescriptionTotal.equals(other.getResultDescriptionTotal()))) &&
                this.followupCodeResponse == other.getFollowupCodeResponse() &&
                ((this.transactionNumberTotal == null && other.getTransactionNumberTotal() == null) ||
                        (this.transactionNumberTotal != null &&
                                this.transactionNumberTotal.equals(other.getTransactionNumberTotal()))) &&
                this.sourceAccountResponse == other.getSourceAccountResponse() &&
                ((this.billPaymentFollowupResponses == null && other.getBillPaymentFollowupResponses() == null) ||
                        (this.billPaymentFollowupResponses != null &&
                                java.util.Arrays.equals(this.billPaymentFollowupResponses, other.getBillPaymentFollowupResponses())));
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
        if (getResultCodeTotal() != null) {
            _hashCode += getResultCodeTotal().hashCode();
        }
        if (getResultDescriptionTotal() != null) {
            _hashCode += getResultDescriptionTotal().hashCode();
        }
        _hashCode += new Long(getFollowupCodeResponse()).hashCode();
        if (getTransactionNumberTotal() != null) {
            _hashCode += getTransactionNumberTotal().hashCode();
        }
        _hashCode += new Long(getSourceAccountResponse()).hashCode();
        if (getBillPaymentFollowupResponses() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBillPaymentFollowupResponses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillPaymentFollowupResponses(), i);
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
            new org.apache.axis.description.TypeDesc(BatchBillPaymentFollowupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", ">BatchBillPaymentFollowupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCodeTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultCodeTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDescriptionTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultDescriptionTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followupCodeResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FollowupCodeResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionNumberTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionNumberTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAccountResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SourceAccountResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPaymentFollowupResponses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BillPaymentFollowupResponses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "BillPaymentFollowupResponse"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "BillPaymentFollowupResponse"));
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
