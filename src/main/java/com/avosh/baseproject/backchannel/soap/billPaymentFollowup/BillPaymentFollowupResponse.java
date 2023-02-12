/**
 * BillPaymentFollowupResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.billPaymentFollowup;

public class BillPaymentFollowupResponse implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger rowNumber;

    private java.lang.String resultCode;

    private java.lang.String resultDescription;

    private java.lang.String transactionNumber;

    public BillPaymentFollowupResponse() {
    }

    public BillPaymentFollowupResponse(
            org.apache.axis.types.NonNegativeInteger rowNumber,
            java.lang.String resultCode,
            java.lang.String resultDescription,
            java.lang.String transactionNumber) {
        this.rowNumber = rowNumber;
        this.resultCode = resultCode;
        this.resultDescription = resultDescription;
        this.transactionNumber = transactionNumber;
    }


    /**
     * Gets the rowNumber value for this BillPaymentFollowupResponse.
     *
     * @return rowNumber
     */
    public org.apache.axis.types.NonNegativeInteger getRowNumber() {
        return rowNumber;
    }


    /**
     * Sets the rowNumber value for this BillPaymentFollowupResponse.
     *
     * @param rowNumber
     */
    public void setRowNumber(org.apache.axis.types.NonNegativeInteger rowNumber) {
        this.rowNumber = rowNumber;
    }


    /**
     * Gets the resultCode value for this BillPaymentFollowupResponse.
     *
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this BillPaymentFollowupResponse.
     *
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultDescription value for this BillPaymentFollowupResponse.
     *
     * @return resultDescription
     */
    public java.lang.String getResultDescription() {
        return resultDescription;
    }


    /**
     * Sets the resultDescription value for this BillPaymentFollowupResponse.
     *
     * @param resultDescription
     */
    public void setResultDescription(java.lang.String resultDescription) {
        this.resultDescription = resultDescription;
    }


    /**
     * Gets the transactionNumber value for this BillPaymentFollowupResponse.
     *
     * @return transactionNumber
     */
    public java.lang.String getTransactionNumber() {
        return transactionNumber;
    }


    /**
     * Sets the transactionNumber value for this BillPaymentFollowupResponse.
     *
     * @param transactionNumber
     */
    public void setTransactionNumber(java.lang.String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentFollowupResponse)) return false;
        BillPaymentFollowupResponse other = (BillPaymentFollowupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = ((this.rowNumber == null && other.getRowNumber() == null) ||
                (this.rowNumber != null &&
                        this.rowNumber.equals(other.getRowNumber()))) &&
                ((this.resultCode == null && other.getResultCode() == null) ||
                        (this.resultCode != null &&
                                this.resultCode.equals(other.getResultCode()))) &&
                ((this.resultDescription == null && other.getResultDescription() == null) ||
                        (this.resultDescription != null &&
                                this.resultDescription.equals(other.getResultDescription()))) &&
                ((this.transactionNumber == null && other.getTransactionNumber() == null) ||
                        (this.transactionNumber != null &&
                                this.transactionNumber.equals(other.getTransactionNumber())));
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
        if (getRowNumber() != null) {
            _hashCode += getRowNumber().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BillPaymentFollowupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "BillPaymentFollowupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RowNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionNumber"));
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
