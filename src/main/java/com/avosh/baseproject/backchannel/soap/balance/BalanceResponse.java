/**
 * BalanceResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.balance;

import com.avosh.baseproject.backchannel.model.Message;

public class BalanceResponse extends Message {
    private long actualBalance;

    private long availableBalance;

    public BalanceResponse() {
    }

    public BalanceResponse(
            long actualBalance,
            long availableBalance) {
        this.actualBalance = actualBalance;
        this.availableBalance = availableBalance;
    }


    /**
     * Gets the actualBalance value for this BalanceResponse.
     *
     * @return actualBalance
     */
    public long getActualBalance() {
        return actualBalance;
    }


    /**
     * Sets the actualBalance value for this BalanceResponse.
     *
     * @param actualBalance
     */
    public void setActualBalance(long actualBalance) {
        this.actualBalance = actualBalance;
    }


    /**
     * Gets the availableBalance value for this BalanceResponse.
     *
     * @return availableBalance
     */
    public long getAvailableBalance() {
        return availableBalance;
    }


    /**
     * Sets the availableBalance value for this BalanceResponse.
     *
     * @param availableBalance
     */
    public void setAvailableBalance(long availableBalance) {
        this.availableBalance = availableBalance;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BalanceResponse)) return false;
        BalanceResponse other = (BalanceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = this.actualBalance == other.getActualBalance() &&
                this.availableBalance == other.getAvailableBalance();
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
        _hashCode += new Long(getActualBalance()).hashCode();
        _hashCode += new Long(getAvailableBalance()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static final org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BalanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/schema/balanceResponse", ">BalanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/schema/balanceResponse", "ActualBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/schema/balanceResponse", "AvailableBalance"));
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
