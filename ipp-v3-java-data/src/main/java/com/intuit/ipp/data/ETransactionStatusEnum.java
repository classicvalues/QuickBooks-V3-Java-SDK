//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.02 at 10:13:31 AM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ETransactionStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ETransactionStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sent"/&gt;
 *     &lt;enumeration value="Viewed"/&gt;
 *     &lt;enumeration value="Paid"/&gt;
 *     &lt;enumeration value="Delivery Error"/&gt;
 *     &lt;enumeration value="Updated"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Accepted"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="Sent With ICN Error"/&gt;
 *     &lt;enumeration value="Delivered"/&gt;
 *     &lt;enumeration value="Disputed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ETransactionStatusEnum")
@XmlEnum
public enum ETransactionStatusEnum {

    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("Viewed")
    VIEWED("Viewed"),
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Delivery Error")
    DELIVERY_ERROR("Delivery Error"),
    @XmlEnumValue("Updated")
    UPDATED("Updated"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Sent With ICN Error")
    SENT_WITH_ICN_ERROR("Sent With ICN Error"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Disputed")
    DISPUTED("Disputed");
    private final String value;

    ETransactionStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ETransactionStatusEnum fromValue(String v) {
        for (ETransactionStatusEnum c: ETransactionStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
