//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.02 at 10:13:31 AM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * 				Product: ALL
 * 				Description: A sales tax rate specifies
 * 				the tax rate for the specific TaxCode.[br]See [a
 * 				href="http://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0060_Financial_Management_Services_(v3)/01100_Global_Tax_Model"]Global
 * 				Tax Model[/a].
 * 			
 * 
 * <p>Java class for TaxRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RateValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AgencyRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxReturnLineRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveTaxRate" type="{http://schema.intuit.com/finance/v3}EffectiveTaxRate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialTaxType" type="{http://schema.intuit.com/finance/v3}SpecialTaxTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="DisplayType" type="{http://schema.intuit.com/finance/v3}TaxRateDisplayTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="TaxRateEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *         &lt;element name="OriginalTaxRate" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRate", propOrder = {
    "name",
    "description",
    "active",
    "rateValue",
    "agencyRef",
    "taxReturnLineRef",
    "effectiveTaxRate",
    "specialTaxType",
    "displayType",
    "taxRateEx",
    "originalTaxRate"
})
public class TaxRate
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "RateValue")
    protected BigDecimal rateValue;
    @XmlElement(name = "AgencyRef")
    protected ReferenceType agencyRef;
    @XmlElement(name = "TaxReturnLineRef")
    protected ReferenceType taxReturnLineRef;
    @XmlElement(name = "EffectiveTaxRate")
    protected List<EffectiveTaxRate> effectiveTaxRate;
    @XmlElement(name = "SpecialTaxType")
    @XmlSchemaType(name = "string")
    protected SpecialTaxTypeEnum specialTaxType;
    @XmlElement(name = "DisplayType")
    @XmlSchemaType(name = "string")
    protected TaxRateDisplayTypeEnum displayType;
    @XmlElement(name = "TaxRateEx")
    protected IntuitAnyType taxRateEx;
    @XmlElement(name = "OriginalTaxRate")
    protected ReferenceType originalTaxRate;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the rateValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateValue() {
        return rateValue;
    }

    /**
     * Sets the value of the rateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateValue(BigDecimal value) {
        this.rateValue = value;
    }

    /**
     * Gets the value of the agencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAgencyRef() {
        return agencyRef;
    }

    /**
     * Sets the value of the agencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAgencyRef(ReferenceType value) {
        this.agencyRef = value;
    }

    /**
     * Gets the value of the taxReturnLineRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxReturnLineRef() {
        return taxReturnLineRef;
    }

    /**
     * Sets the value of the taxReturnLineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxReturnLineRef(ReferenceType value) {
        this.taxReturnLineRef = value;
    }

    /**
     * Gets the value of the effectiveTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveTaxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveTaxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectiveTaxRate }
     * 
     * 
     */
    public List<EffectiveTaxRate> getEffectiveTaxRate() {
        if (effectiveTaxRate == null) {
            effectiveTaxRate = new ArrayList<EffectiveTaxRate>();
        }
        return this.effectiveTaxRate;
    }

    /**
     * Gets the value of the specialTaxType property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialTaxTypeEnum }
     *     
     */
    public SpecialTaxTypeEnum getSpecialTaxType() {
        return specialTaxType;
    }

    /**
     * Sets the value of the specialTaxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialTaxTypeEnum }
     *     
     */
    public void setSpecialTaxType(SpecialTaxTypeEnum value) {
        this.specialTaxType = value;
    }

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxRateDisplayTypeEnum }
     *     
     */
    public TaxRateDisplayTypeEnum getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRateDisplayTypeEnum }
     *     
     */
    public void setDisplayType(TaxRateDisplayTypeEnum value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the taxRateEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getTaxRateEx() {
        return taxRateEx;
    }

    /**
     * Sets the value of the taxRateEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setTaxRateEx(IntuitAnyType value) {
        this.taxRateEx = value;
    }

    /**
     * Gets the value of the originalTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getOriginalTaxRate() {
        return originalTaxRate;
    }

    /**
     * Sets the value of the originalTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setOriginalTaxRate(ReferenceType value) {
        this.originalTaxRate = value;
    }

    /**
     * Sets the value of the effectiveTaxRate property.
     * 
     * @param effectiveTaxRate
     *     allowed object is
     *     {@link EffectiveTaxRate }
     *     
     */
    public void setEffectiveTaxRate(List<EffectiveTaxRate> effectiveTaxRate) {
        this.effectiveTaxRate = effectiveTaxRate;
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
        final TaxRate that = ((TaxRate) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive, (this.active!= null), (that.active!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsRateValue;
            lhsRateValue = this.getRateValue();
            BigDecimal rhsRateValue;
            rhsRateValue = that.getRateValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rateValue", lhsRateValue), LocatorUtils.property(thatLocator, "rateValue", rhsRateValue), lhsRateValue, rhsRateValue, (this.rateValue!= null), (that.rateValue!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsAgencyRef;
            lhsAgencyRef = this.getAgencyRef();
            ReferenceType rhsAgencyRef;
            rhsAgencyRef = that.getAgencyRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agencyRef", lhsAgencyRef), LocatorUtils.property(thatLocator, "agencyRef", rhsAgencyRef), lhsAgencyRef, rhsAgencyRef, (this.agencyRef!= null), (that.agencyRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxReturnLineRef;
            lhsTaxReturnLineRef = this.getTaxReturnLineRef();
            ReferenceType rhsTaxReturnLineRef;
            rhsTaxReturnLineRef = that.getTaxReturnLineRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxReturnLineRef", lhsTaxReturnLineRef), LocatorUtils.property(thatLocator, "taxReturnLineRef", rhsTaxReturnLineRef), lhsTaxReturnLineRef, rhsTaxReturnLineRef, (this.taxReturnLineRef!= null), (that.taxReturnLineRef!= null))) {
                return false;
            }
        }
        {
            List<EffectiveTaxRate> lhsEffectiveTaxRate;
            lhsEffectiveTaxRate = (((this.effectiveTaxRate!= null)&&(!this.effectiveTaxRate.isEmpty()))?this.getEffectiveTaxRate():null);
            List<EffectiveTaxRate> rhsEffectiveTaxRate;
            rhsEffectiveTaxRate = (((that.effectiveTaxRate!= null)&&(!that.effectiveTaxRate.isEmpty()))?that.getEffectiveTaxRate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveTaxRate", lhsEffectiveTaxRate), LocatorUtils.property(thatLocator, "effectiveTaxRate", rhsEffectiveTaxRate), lhsEffectiveTaxRate, rhsEffectiveTaxRate, ((this.effectiveTaxRate!= null)&&(!this.effectiveTaxRate.isEmpty())), ((that.effectiveTaxRate!= null)&&(!that.effectiveTaxRate.isEmpty())))) {
                return false;
            }
        }
        {
            SpecialTaxTypeEnum lhsSpecialTaxType;
            lhsSpecialTaxType = this.getSpecialTaxType();
            SpecialTaxTypeEnum rhsSpecialTaxType;
            rhsSpecialTaxType = that.getSpecialTaxType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialTaxType", lhsSpecialTaxType), LocatorUtils.property(thatLocator, "specialTaxType", rhsSpecialTaxType), lhsSpecialTaxType, rhsSpecialTaxType, (this.specialTaxType!= null), (that.specialTaxType!= null))) {
                return false;
            }
        }
        {
            TaxRateDisplayTypeEnum lhsDisplayType;
            lhsDisplayType = this.getDisplayType();
            TaxRateDisplayTypeEnum rhsDisplayType;
            rhsDisplayType = that.getDisplayType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "displayType", lhsDisplayType), LocatorUtils.property(thatLocator, "displayType", rhsDisplayType), lhsDisplayType, rhsDisplayType, (this.displayType!= null), (that.displayType!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsTaxRateEx;
            lhsTaxRateEx = this.getTaxRateEx();
            IntuitAnyType rhsTaxRateEx;
            rhsTaxRateEx = that.getTaxRateEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxRateEx", lhsTaxRateEx), LocatorUtils.property(thatLocator, "taxRateEx", rhsTaxRateEx), lhsTaxRateEx, rhsTaxRateEx, (this.taxRateEx!= null), (that.taxRateEx!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsOriginalTaxRate;
            lhsOriginalTaxRate = this.getOriginalTaxRate();
            ReferenceType rhsOriginalTaxRate;
            rhsOriginalTaxRate = that.getOriginalTaxRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalTaxRate", lhsOriginalTaxRate), LocatorUtils.property(thatLocator, "originalTaxRate", rhsOriginalTaxRate), lhsOriginalTaxRate, rhsOriginalTaxRate, (this.originalTaxRate!= null), (that.originalTaxRate!= null))) {
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive, (this.active!= null));
        }
        {
            BigDecimal theRateValue;
            theRateValue = this.getRateValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rateValue", theRateValue), currentHashCode, theRateValue, (this.rateValue!= null));
        }
        {
            ReferenceType theAgencyRef;
            theAgencyRef = this.getAgencyRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agencyRef", theAgencyRef), currentHashCode, theAgencyRef, (this.agencyRef!= null));
        }
        {
            ReferenceType theTaxReturnLineRef;
            theTaxReturnLineRef = this.getTaxReturnLineRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxReturnLineRef", theTaxReturnLineRef), currentHashCode, theTaxReturnLineRef, (this.taxReturnLineRef!= null));
        }
        {
            List<EffectiveTaxRate> theEffectiveTaxRate;
            theEffectiveTaxRate = (((this.effectiveTaxRate!= null)&&(!this.effectiveTaxRate.isEmpty()))?this.getEffectiveTaxRate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveTaxRate", theEffectiveTaxRate), currentHashCode, theEffectiveTaxRate, ((this.effectiveTaxRate!= null)&&(!this.effectiveTaxRate.isEmpty())));
        }
        {
            SpecialTaxTypeEnum theSpecialTaxType;
            theSpecialTaxType = this.getSpecialTaxType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialTaxType", theSpecialTaxType), currentHashCode, theSpecialTaxType, (this.specialTaxType!= null));
        }
        {
            TaxRateDisplayTypeEnum theDisplayType;
            theDisplayType = this.getDisplayType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "displayType", theDisplayType), currentHashCode, theDisplayType, (this.displayType!= null));
        }
        {
            IntuitAnyType theTaxRateEx;
            theTaxRateEx = this.getTaxRateEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxRateEx", theTaxRateEx), currentHashCode, theTaxRateEx, (this.taxRateEx!= null));
        }
        {
            ReferenceType theOriginalTaxRate;
            theOriginalTaxRate = this.getOriginalTaxRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalTaxRate", theOriginalTaxRate), currentHashCode, theOriginalTaxRate, (this.originalTaxRate!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
