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
 * <p>Java class for TaxTypeApplicablityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxTypeApplicablityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TaxOnAmount"/&gt;
 *     &lt;enumeration value="TaxOnAmountPlusTax"/&gt;
 *     &lt;enumeration value="TaxOnTax"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxTypeApplicablityEnum")
@XmlEnum
public enum TaxTypeApplicablityEnum {

    @XmlEnumValue("TaxOnAmount")
    TAX_ON_AMOUNT("TaxOnAmount"),
    @XmlEnumValue("TaxOnAmountPlusTax")
    TAX_ON_AMOUNT_PLUS_TAX("TaxOnAmountPlusTax"),
    @XmlEnumValue("TaxOnTax")
    TAX_ON_TAX("TaxOnTax");
    private final String value;

    TaxTypeApplicablityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxTypeApplicablityEnum fromValue(String v) {
        for (TaxTypeApplicablityEnum c: TaxTypeApplicablityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
