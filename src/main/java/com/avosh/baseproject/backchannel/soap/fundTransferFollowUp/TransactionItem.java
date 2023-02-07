/**
 * TransactionItem.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.fundTransferFollowUp;

public class TransactionItem implements java.io.Serializable {
    private java.lang.String rowId;

    public TransactionItem() {
    }

    public TransactionItem(
            java.lang.String rowId) {
        this.rowId = rowId;
    }


    /**
     * Gets the rowId value for this TransactionItem.
     *
     * @return rowId
     */
    public java.lang.String getRowId() {
        return rowId;
    }


    /**
     * Sets the rowId value for this TransactionItem.
     *
     * @param rowId
     */
    public void setRowId(java.lang.String rowId) {
        this.rowId = rowId;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionItem)) return false;
        TransactionItem other = (TransactionItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = ((this.rowId == null && other.getRowId() == null) ||
                (this.rowId != null &&
                        this.rowId.equals(other.getRowId())));
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
        if (getRowId() != null) {
            _hashCode += getRowId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(TransactionItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "transactionItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowId"));
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
