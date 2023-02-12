/**
 * BatchBillPaymentResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.avosh.baseproject.backchannel.soap.billPayment;

import com.avosh.baseproject.backchannel.model.Message;

public class BatchBillPaymentResponse extends Message {
    private java.lang.String resultCodeTotal;

    private java.lang.String resultDescriptionTotal;

    private long followupCode;

    private java.lang.String transactionNumberTotal;

    private com.avosh.baseproject.backchannel.soap.billPayment.BillPaymentResponse[] billPaymentResponses;

    public BatchBillPaymentResponse() {
    }

    public BatchBillPaymentResponse(
            java.lang.String resultCodeTotal,
            java.lang.String resultDescriptionTotal,
            long followupCode,
            java.lang.String transactionNumberTotal,
            com.avosh.baseproject.backchannel.soap.billPayment.BillPaymentResponse[] billPaymentResponses) {
        this.resultCodeTotal = resultCodeTotal;
        this.resultDescriptionTotal = resultDescriptionTotal;
        this.followupCode = followupCode;
        this.transactionNumberTotal = transactionNumberTotal;
        this.billPaymentResponses = billPaymentResponses;
    }


    /**
     * Gets the resultCodeTotal value for this BatchBillPaymentResponse.
     *
     * @return resultCodeTotal
     */
    public java.lang.String getResultCodeTotal() {
        return resultCodeTotal;
    }


    /**
     * Sets the resultCodeTotal value for this BatchBillPaymentResponse.
     *
     * @param resultCodeTotal
     */
    public void setResultCodeTotal(java.lang.String resultCodeTotal) {
        this.resultCodeTotal = resultCodeTotal;
    }


    /**
     * Gets the resultDescriptionTotal value for this BatchBillPaymentResponse.
     *
     * @return resultDescriptionTotal
     */
    public java.lang.String getResultDescriptionTotal() {
        return resultDescriptionTotal;
    }


    /**
     * Sets the resultDescriptionTotal value for this BatchBillPaymentResponse.
     *
     * @param resultDescriptionTotal
     */
    public void setResultDescriptionTotal(java.lang.String resultDescriptionTotal) {
        this.resultDescriptionTotal = resultDescriptionTotal;
    }


    /**
     * Gets the followupCode value for this BatchBillPaymentResponse.
     *
     * @return followupCode
     */
    public long getFollowupCode() {
        return followupCode;
    }


    /**
     * Sets the followupCode value for this BatchBillPaymentResponse.
     *
     * @param followupCode
     */
    public void setFollowupCode(long followupCode) {
        this.followupCode = followupCode;
    }


    /**
     * Gets the transactionNumberTotal value for this BatchBillPaymentResponse.
     *
     * @return transactionNumberTotal
     */
    public java.lang.String getTransactionNumberTotal() {
        return transactionNumberTotal;
    }


    /**
     * Sets the transactionNumberTotal value for this BatchBillPaymentResponse.
     *
     * @param transactionNumberTotal
     */
    public void setTransactionNumberTotal(java.lang.String transactionNumberTotal) {
        this.transactionNumberTotal = transactionNumberTotal;
    }


    /**
     * Gets the billPaymentResponses value for this BatchBillPaymentResponse.
     *
     * @return billPaymentResponses
     */
    public com.avosh.baseproject.backchannel.soap.billPayment.BillPaymentResponse[] getBillPaymentResponses() {
        return billPaymentResponses;
    }


    /**
     * Sets the billPaymentResponses value for this BatchBillPaymentResponse.
     *
     * @param billPaymentResponses
     */
    public void setBillPaymentResponses(com.avosh.baseproject.backchannel.soap.billPayment.BillPaymentResponse[] billPaymentResponses) {
        this.billPaymentResponses = billPaymentResponses;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchBillPaymentResponse)) return false;
        BatchBillPaymentResponse other = (BatchBillPaymentResponse) obj;
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
                this.followupCode == other.getFollowupCode() &&
                ((this.transactionNumberTotal == null && other.getTransactionNumberTotal() == null) ||
                        (this.transactionNumberTotal != null &&
                                this.transactionNumberTotal.equals(other.getTransactionNumberTotal()))) &&
                ((this.billPaymentResponses == null && other.getBillPaymentResponses() == null) ||
                        (this.billPaymentResponses != null &&
                                java.util.Arrays.equals(this.billPaymentResponses, other.getBillPaymentResponses())));
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
        _hashCode += new Long(getFollowupCode()).hashCode();
        if (getTransactionNumberTotal() != null) {
            _hashCode += getTransactionNumberTotal().hashCode();
        }
        if (getBillPaymentResponses() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBillPaymentResponses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillPaymentResponses(), i);
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
            new org.apache.axis.description.TypeDesc(BatchBillPaymentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", ">BatchBillPaymentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCodeTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "resultCodeTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDescriptionTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "resultDescriptionTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("followupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "followupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionNumberTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "transactionNumberTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPaymentResponses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "billPaymentResponses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "billPaymentResponse"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://sabapardazesh.com/ws/definitions", "billPaymentResponse"));
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
