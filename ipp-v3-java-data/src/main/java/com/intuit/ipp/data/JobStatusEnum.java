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
 * <p>Java class for JobStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JobStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Awarded"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *     &lt;enumeration value="InProgress"/&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="NotAwarded"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "JobStatusEnum")
@XmlEnum
public enum JobStatusEnum {

    @XmlEnumValue("Awarded")
    AWARDED("Awarded"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("NotAwarded")
    NOT_AWARDED("NotAwarded"),
    @XmlEnumValue("Pending")
    PENDING("Pending");
    private final String value;

    JobStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobStatusEnum fromValue(String v) {
        for (JobStatusEnum c: JobStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
