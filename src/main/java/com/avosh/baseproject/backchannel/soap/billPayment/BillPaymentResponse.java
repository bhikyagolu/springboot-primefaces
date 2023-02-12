/**
 * BillPaymentResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.billPayment;

public class BillPaymentResponse implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger rowNumberResponse;

    private java.lang.String resultCode;

    private java.lang.String resultDescription;

    private java.lang.String transactionNumber;

    private java.lang.String billID;

    private java.lang.String billType;

    private java.lang.String paymentID;

    public BillPaymentResponse() {
    }

    public BillPaymentResponse(
            org.apache.axis.types.NonNegativeInteger rowNumberResponse,
            java.lang.String resultCode,
            java.lang.String resultDescription,
            java.lang.String transactionNumber,
            java.lang.String billID,
            java.lang.String billType,
            java.lang.String paymentID) {
        this.rowNumberResponse = rowNumberResponse;
        this.resultCode = resultCode;
        this.resultDescription = resultDescription;
        this.transactionNumber = transactionNumber;
        this.billID = billID;
        this.billType = billType;
        this.paymentID = paymentID;
    }


    /**
     * Gets the rowNumberResponse value for this BillPaymentResponse.
     *
     * @return rowNumberResponse
     */
    public org.apache.axis.types.NonNegativeInteger getRowNumberResponse() {
        return rowNumberResponse;
    }


    /**
     * Sets the rowNumberResponse value for this BillPaymentResponse.
     *
     * @param rowNumberResponse
     */
    public void setRowNumberResponse(org.apache.axis.types.NonNegativeInteger rowNumberResponse) {
        this.rowNumberResponse = rowNumberResponse;
    }


    /**
     * Gets the resultCode value for this BillPaymentResponse.
     *
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this BillPaymentResponse.
     *
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultDescription value for this BillPaymentResponse.
     *
     * @return resultDescription
     */
    public java.lang.String getResultDescription() {
        return resultDescription;
    }


    /**
     * Sets the resultDescription value for this BillPaymentResponse.
     *
     * @param resultDescription
     */
    public void setResultDescription(java.lang.String resultDescription) {
        this.resultDescription = resultDescription;
    }


    /**
     * Gets the transactionNumber value for this BillPaymentResponse.
     *
     * @return transactionNumber
     */
    public java.lang.String getTransactionNumber() {
        return transactionNumber;
    }


    /**
     * Sets the transactionNumber value for this BillPaymentResponse.
     *
     * @param transactionNumber
     */
    public void setTransactionNumber(java.lang.String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }


    /**
     * Gets the billID value for this BillPaymentResponse.
     *
     * @return billID
     */
    public java.lang.String getBillID() {
        return billID;
    }


    /**
     * Sets the billID value for this BillPaymentResponse.
     *
     * @param billID
     */
    public void setBillID(java.lang.String billID) {
        this.billID = billID;
    }


    /**
     * Gets the billType value for this BillPaymentResponse.
     *
     * @return billType
     */
    public java.lang.String getBillType() {
        return billType;
    }


    /**
     * Sets the billType value for this BillPaymentResponse.
     *
     * @param billType
     */
    public void setBillType(java.lang.String billType) {
        this.billType = billType;
    }


    /**
     * Gets the paymentID value for this BillPaymentResponse.
     *
     * @return paymentID
     */
    public java.lang.String getPaymentID() {
        return paymentID;
    }


    /**
     * Sets the paymentID value for this BillPaymentResponse.
     *
     * @param paymentID
     */
    public void setPaymentID(java.lang.String paymentID) {
        this.paymentID = paymentID;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentResponse)) return false;
        BillPaymentResponse other = (BillPaymentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = ((this.rowNumberResponse == null && other.getRowNumberResponse() == null) ||
                (this.rowNumberResponse != null &&
                        this.rowNumberResponse.equals(other.getRowNumberResponse()))) &&
                ((this.resultCode == null && other.getResultCode() == null) ||
                        (this.resultCode != null &&
                                this.resultCode.equals(other.getResultCode()))) &&
                ((this.resultDescription == null && other.getResultDescription() == null) ||
                        (this.resultDescription != null &&
                                this.resultDescription.equals(other.getResultDescription()))) &&
                ((this.transactionNumber == null && other.getTransactionNumber() == null) ||
                        (this.transactionNumber != null &&
                                this.transactionNumber.equals(other.getTransactionNumber()))) &&
                ((this.billID == null && other.getBillID() == null) ||
                        (this.billID != null &&
                                this.billID.equals(other.getBillID()))) &&
                ((this.billType == null && other.getBillType() == null) ||
                        (this.billType != null &&
                                this.billType.equals(other.getBillType()))) &&
                ((this.paymentID == null && other.getPaymentID() == null) ||
                        (this.paymentID != null &&
                                this.paymentID.equals(other.getPaymentID())));
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
        if (getRowNumberResponse() != null) {
            _hashCode += getRowNumberResponse().hashCode();
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getResultDescription() != null) {
            _hashCode += getResultDescription().hashCode();
        }
        if (getTransactionNumber() != null) {
            _hashCode += getTransactionNumber().hashCode();
        }
        if (getBillID() != null) {
            _hashCode += getBillID().hashCode();
        }
        if (getBillType() != null) {
            _hashCode += getBillType().hashCode();
        }
        if (getPaymentID() != null) {
            _hashCode += getPaymentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BillPaymentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "billPaymentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowNumberResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "rowNumberResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "resultDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "transactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "billID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "billType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "paymentID"));
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

}
