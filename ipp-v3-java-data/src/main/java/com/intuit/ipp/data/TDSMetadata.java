//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.02 at 10:13:31 AM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: QBO
 * 				Description: Describes metadata
 * 				associated with TDS entity.
 * 			
 * 
 * <p>Java class for TDSMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDSMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TDSEntityTypes" type="{http://schema.intuit.com/finance/v3}NameValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TDSSectionTypes" type="{http://schema.intuit.com/finance/v3}NameValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDSMetadata", propOrder = {
    "tdsEntityTypes",
    "tdsSectionTypes"
})
public class TDSMetadata
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TDSEntityTypes")
    protected List<NameValue> tdsEntityTypes;
    @XmlElement(name = "TDSSectionTypes")
    protected List<NameValue> tdsSectionTypes;

    /**
     * Gets the value of the tdsEntityTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdsEntityTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDSEntityTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValue }
     * 
     * 
     */
    public List<NameValue> getTDSEntityTypes() {
        if (tdsEntityTypes == null) {
            tdsEntityTypes = new ArrayList<NameValue>();
        }
        return this.tdsEntityTypes;
    }

    /**
     * Gets the value of the tdsSectionTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdsSectionTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDSSectionTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValue }
     * 
     * 
     */
    public List<NameValue> getTDSSectionTypes() {
        if (tdsSectionTypes == null) {
            tdsSectionTypes = new ArrayList<NameValue>();
        }
        return this.tdsSectionTypes;
    }

    /**
     * Sets the value of the tdsEntityTypes property.
     * 
     * @param tdsEntityTypes
     *     allowed object is
     *     {@link NameValue }
     *     
     */
    public void setTDSEntityTypes(List<NameValue> tdsEntityTypes) {
        this.tdsEntityTypes = tdsEntityTypes;
    }

    /**
     * Sets the value of the tdsSectionTypes property.
     * 
     * @param tdsSectionTypes
     *     allowed object is
     *     {@link NameValue }
     *     
     */
    public void setTDSSectionTypes(List<NameValue> tdsSectionTypes) {
        this.tdsSectionTypes = tdsSectionTypes;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TDSMetadata that = ((TDSMetadata) object);
        {
            List<NameValue> lhsTDSEntityTypes;
            lhsTDSEntityTypes = (((this.tdsEntityTypes!= null)&&(!this.tdsEntityTypes.isEmpty()))?this.getTDSEntityTypes():null);
            List<NameValue> rhsTDSEntityTypes;
            rhsTDSEntityTypes = (((that.tdsEntityTypes!= null)&&(!that.tdsEntityTypes.isEmpty()))?that.getTDSEntityTypes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tdsEntityTypes", lhsTDSEntityTypes), LocatorUtils.property(thatLocator, "tdsEntityTypes", rhsTDSEntityTypes), lhsTDSEntityTypes, rhsTDSEntityTypes, ((this.tdsEntityTypes!= null)&&(!this.tdsEntityTypes.isEmpty())), ((that.tdsEntityTypes!= null)&&(!that.tdsEntityTypes.isEmpty())))) {
                return false;
            }
        }
        {
            List<NameValue> lhsTDSSectionTypes;
            lhsTDSSectionTypes = (((this.tdsSectionTypes!= null)&&(!this.tdsSectionTypes.isEmpty()))?this.getTDSSectionTypes():null);
            List<NameValue> rhsTDSSectionTypes;
            rhsTDSSectionTypes = (((that.tdsSectionTypes!= null)&&(!that.tdsSectionTypes.isEmpty()))?that.getTDSSectionTypes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tdsSectionTypes", lhsTDSSectionTypes), LocatorUtils.property(thatLocator, "tdsSectionTypes", rhsTDSSectionTypes), lhsTDSSectionTypes, rhsTDSSectionTypes, ((this.tdsSectionTypes!= null)&&(!this.tdsSectionTypes.isEmpty())), ((that.tdsSectionTypes!= null)&&(!that.tdsSectionTypes.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<NameValue> theTDSEntityTypes;
            theTDSEntityTypes = (((this.tdsEntityTypes!= null)&&(!this.tdsEntityTypes.isEmpty()))?this.getTDSEntityTypes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tdsEntityTypes", theTDSEntityTypes), currentHashCode, theTDSEntityTypes, ((this.tdsEntityTypes!= null)&&(!this.tdsEntityTypes.isEmpty())));
        }
        {
            List<NameValue> theTDSSectionTypes;
            theTDSSectionTypes = (((this.tdsSectionTypes!= null)&&(!this.tdsSectionTypes.isEmpty()))?this.getTDSSectionTypes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tdsSectionTypes", theTDSSectionTypes), currentHashCode, theTDSSectionTypes, ((this.tdsSectionTypes!= null)&&(!this.tdsSectionTypes.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
