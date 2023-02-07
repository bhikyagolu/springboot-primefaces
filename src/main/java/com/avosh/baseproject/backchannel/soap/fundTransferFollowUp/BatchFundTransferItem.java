/**
 * BatchFundTransferItem.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.fundTransferFollowUp;

public class BatchFundTransferItem implements java.io.Serializable {
    private long rowId;

    private java.lang.String resultCode;

    private java.lang.String resultDescription;

    private java.lang.String transactionNumber;

    public BatchFundTransferItem() {
    }

    public BatchFundTransferItem(
            long rowId,
            java.lang.String resultCode,
            java.lang.String resultDescription,
            java.lang.String transactionNumber) {
        this.rowId = rowId;
        this.resultCode = resultCode;
        this.resultDescription = resultDescription;
        this.transactionNumber = transactionNumber;
    }


    /**
     * Gets the rowId value for this BatchFundTransferItem.
     *
     * @return rowId
     */
    public long getRowId() {
        return rowId;
    }


    /**
     * Sets the rowId value for this BatchFundTransferItem.
     *
     * @param rowId
     */
    public void setRowId(long rowId) {
        this.rowId = rowId;
    }


    /**
     * Gets the resultCode value for this BatchFundTransferItem.
     *
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this BatchFundTransferItem.
     *
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultDescription value for this BatchFundTransferItem.
     *
     * @return resultDescription
     */
    public java.lang.String getResultDescription() {
        return resultDescription;
    }


    /**
     * Sets the resultDescription value for this BatchFundTransferItem.
     *
     * @param resultDescription
     */
    public void setResultDescription(java.lang.String resultDescription) {
        this.resultDescription = resultDescription;
    }


    /**
     * Gets the transactionNumber value for this BatchFundTransferItem.
     *
     * @return transactionNumber
     */
    public java.lang.String getTransactionNumber() {
        return transactionNumber;
    }


    /**
     * Sets the transactionNumber value for this BatchFundTransferItem.
     *
     * @param transactionNumber
     */
    public void setTransactionNumber(java.lang.String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchFundTransferItem)) return false;
        BatchFundTransferItem other = (BatchFundTransferItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = this.rowId == other.getRowId() &&
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
        _hashCode += new Long(getRowId()).hashCode();
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
            new org.apache.axis.description.TypeDesc(BatchFundTransferItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "batchFundTransferItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionNumber"));
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
