/**
 * BillPaymentItem.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.billPayment;

public class BillPaymentItem implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger rowNumber;

    private java.lang.String billID;

    private java.lang.String paymentID;

    private long amount;

    public BillPaymentItem() {
    }

    public BillPaymentItem(
            org.apache.axis.types.NonNegativeInteger rowNumber,
            java.lang.String billID,
            java.lang.String paymentID,
            long amount) {
        this.rowNumber = rowNumber;
        this.billID = billID;
        this.paymentID = paymentID;
        this.amount = amount;
    }


    /**
     * Gets the rowNumber value for this BillPaymentItem.
     *
     * @return rowNumber
     */
    public org.apache.axis.types.NonNegativeInteger getRowNumber() {
        return rowNumber;
    }


    /**
     * Sets the rowNumber value for this BillPaymentItem.
     *
     * @param rowNumber
     */
    public void setRowNumber(org.apache.axis.types.NonNegativeInteger rowNumber) {
        this.rowNumber = rowNumber;
    }


    /**
     * Gets the billID value for this BillPaymentItem.
     *
     * @return billID
     */
    public java.lang.String getBillID() {
        return billID;
    }


    /**
     * Sets the billID value for this BillPaymentItem.
     *
     * @param billID
     */
    public void setBillID(java.lang.String billID) {
        this.billID = billID;
    }


    /**
     * Gets the paymentID value for this BillPaymentItem.
     *
     * @return paymentID
     */
    public java.lang.String getPaymentID() {
        return paymentID;
    }


    /**
     * Sets the paymentID value for this BillPaymentItem.
     *
     * @param paymentID
     */
    public void setPaymentID(java.lang.String paymentID) {
        this.paymentID = paymentID;
    }


    /**
     * Gets the amount value for this BillPaymentItem.
     *
     * @return amount
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BillPaymentItem.
     *
     * @param amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentItem)) return false;
        BillPaymentItem other = (BillPaymentItem) obj;
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
                ((this.billID == null && other.getBillID() == null) ||
                        (this.billID != null &&
                                this.billID.equals(other.getBillID()))) &&
                ((this.paymentID == null && other.getPaymentID() == null) ||
                        (this.paymentID != null &&
                                this.paymentID.equals(other.getPaymentID()))) &&
                this.amount == other.getAmount();
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
        if (getBillID() != null) {
            _hashCode += getBillID().hashCode();
        }
        if (getPaymentID() != null) {
            _hashCode += getPaymentID().hashCode();
        }
        _hashCode += new Long(getAmount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BillPaymentItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "billPaymentItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
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

}
