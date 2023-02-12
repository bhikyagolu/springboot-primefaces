/**
 * BatchBillPaymentRequest.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.billPayment;

import com.avosh.baseproject.backchannel.model.Message;

public class BatchBillPaymentRequest extends Message {
    private com.avosh.baseproject.backchannel.soap.billPayment.Credential credential;

    private long transactionCount;

    private long totalAmount;

    private java.lang.String sourceAccount;

    private long followupCode;

    private com.avosh.baseproject.backchannel.soap.billPayment.BillPaymentItem[] billPaymentItems;

    public BatchBillPaymentRequest() {
    }

    public BatchBillPaymentRequest(
            com.avosh.baseproject.backchannel.soap.billPayment.Credential credential,
            long transactionCount,
            long totalAmount,
            java.lang.String sourceAccount,
            long followupCode,
            com.avosh.baseproject.backchannel.soap.billPayment.BillPaymentItem[] billPaymentItems) {
        this.credential = credential;
        this.transactionCount = transactionCount;
        this.totalAmount = totalAmount;
        this.sourceAccount = sourceAccount;
        this.followupCode = followupCode;
        this.billPaymentItems = billPaymentItems;
    }


    /**
     * Gets the credential value for this BatchBillPaymentRequest.
     *
     * @return credential
     */
    public com.avosh.baseproject.backchannel.soap.billPayment.Credential getCredential() {
        return credential;
    }


    /**
     * Sets the credential value for this BatchBillPaymentRequest.
     *
     * @param credential
     */
    public void setCredential(com.avosh.baseproject.backchannel.soap.billPayment.Credential credential) {
        this.credential = credential;
    }


    /**
     * Gets the transactionCount value for this BatchBillPaymentRequest.
     *
     * @return transactionCount
     */
    public long getTransactionCount() {
        return transactionCount;
    }


    /**
     * Sets the transactionCount value for this BatchBillPaymentRequest.
     *
     * @param transactionCount
     */
    public void setTransactionCount(long transactionCount) {
        this.transactionCount = transactionCount;
    }


    /**
     * Gets the totalAmount value for this BatchBillPaymentRequest.
     *
     * @return totalAmount
     */
    public long getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this BatchBillPaymentRequest.
     *
     * @param totalAmount
     */
    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the sourceAccount value for this BatchBillPaymentRequest.
     *
     * @return sourceAccount
     */
    public java.lang.String getSourceAccount() {
        return sourceAccount;
    }


    /**
     * Sets the sourceAccount value for this BatchBillPaymentRequest.
     *
     * @param sourceAccount
     */
    public void setSourceAccount(java.lang.String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }


    /**
     * Gets the followupCode value for this BatchBillPaymentRequest.
     *
     * @return followupCode
     */
    public long getFollowupCode() {
        return followupCode;
    }


    /**
     * Sets the followupCode value for this BatchBillPaymentRequest.
     *
     * @param followupCode
     */
    public void setFollowupCode(long followupCode) {
        this.followupCode = followupCode;
    }


    /**
     * Gets the billPaymentItems value for this BatchBillPaymentRequest.
     *
     * @return billPaymentItems
     */
    public com.avosh.baseproject.backchannel.soap.billPayment.BillPaymentItem[] getBillPaymentItems() {
        return billPaymentItems;
    }


    /**
     * Sets the billPaymentItems value for this BatchBillPaymentRequest.
     *
     * @param billPaymentItems
     */
    public void setBillPaymentItems(com.avosh.baseproject.backchannel.soap.billPayment.BillPaymentItem[] billPaymentItems) {
        this.billPaymentItems = billPaymentItems;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchBillPaymentRequest)) return false;
        BatchBillPaymentRequest other = (BatchBillPaymentRequest) obj;
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
                this.transactionCount == other.getTransactionCount() &&
                this.totalAmount == other.getTotalAmount() &&
                ((this.sourceAccount == null && other.getSourceAccount() == null) ||
                        (this.sourceAccount != null &&
                                this.sourceAccount.equals(other.getSourceAccount()))) &&
                this.followupCode == other.getFollowupCode() &&
                ((this.billPaymentItems == null && other.getBillPaymentItems() == null) ||
                        (this.billPaymentItems != null &&
                                java.util.Arrays.equals(this.billPaymentItems, other.getBillPaymentItems())));
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
        _hashCode += new Long(getTransactionCount()).hashCode();
        _hashCode += new Long(getTotalAmount()).hashCode();
        if (getSourceAccount() != null) {
            _hashCode += getSourceAccount().hashCode();
        }
        _hashCode += new Long(getFollowupCode()).hashCode();
        if (getBillPaymentItems() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBillPaymentItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillPaymentItems(), i);
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
            new org.apache.axis.description.TypeDesc(BatchBillPaymentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", ">BatchBillPaymentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credential");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "Credential"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "followupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPaymentItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billPaymentItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "billPaymentItem"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "billPaymentItem"));
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
