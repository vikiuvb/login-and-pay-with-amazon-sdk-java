package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "RefundType")
@XmlEnum
public enum RefundType {

    @XmlEnumValue("AmazonA-ZRefund")
    AMAZON_A_Z_REFUND("AmazonA-ZRefund"),
    @XmlEnumValue("AmazonA-ZGuarantee")
    AMAZON_A_Z_GUARANTEE("AmazonA-ZGuarantee"),
    @XmlEnumValue("SellerInitiated")
    SELLER_INITIATED("SellerInitiated"),
    @XmlEnumValue("Chargeback")
    CHARGEBACK("Chargeback");
    private final String value;

    RefundType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return value();
    }

    public static RefundType fromValue(String v) {
        for (RefundType c: RefundType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}