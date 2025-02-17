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
 * 				Product: QBW
 * 				Description: The InventorySite resource
 * 				represents a location where inventory is stored.
 * 				Endpoint:
 * 				inventorysite
 * 				Business Rules: [li]The site name must be unique.[/li]
 * 			
 * 
 * <p>Java class for InventorySite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventorySite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://schema.intuit.com/finance/v3}PhysicalAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfo" type="{http://schema.intuit.com/finance/v3}ContactInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InventorySiteEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventorySite", propOrder = {
    "name",
    "active",
    "defaultSite",
    "description",
    "contact",
    "addr",
    "contactInfo",
    "inventorySiteEx"
})
public class InventorySite
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "DefaultSite")
    protected Boolean defaultSite;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Contact")
    protected String contact;
    @XmlElement(name = "Addr")
    protected List<PhysicalAddress> addr;
    @XmlElement(name = "ContactInfo")
    protected List<ContactInfo> contactInfo;
    @XmlElement(name = "InventorySiteEx")
    protected IntuitAnyType inventorySiteEx;

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
     * Gets the value of the defaultSite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultSite() {
        return defaultSite;
    }

    /**
     * Sets the value of the defaultSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultSite(Boolean value) {
        this.defaultSite = value;
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
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAddress }
     * 
     * 
     */
    public List<PhysicalAddress> getAddr() {
        if (addr == null) {
            addr = new ArrayList<PhysicalAddress>();
        }
        return this.addr;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfo }
     * 
     * 
     */
    public List<ContactInfo> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<ContactInfo>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the inventorySiteEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getInventorySiteEx() {
        return inventorySiteEx;
    }

    /**
     * Sets the value of the inventorySiteEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setInventorySiteEx(IntuitAnyType value) {
        this.inventorySiteEx = value;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param addr
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setAddr(List<PhysicalAddress> addr) {
        this.addr = addr;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param contactInfo
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(List<ContactInfo> contactInfo) {
        this.contactInfo = contactInfo;
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
        final InventorySite that = ((InventorySite) object);
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
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive, (this.active!= null), (that.active!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDefaultSite;
            lhsDefaultSite = this.isDefaultSite();
            Boolean rhsDefaultSite;
            rhsDefaultSite = that.isDefaultSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultSite", lhsDefaultSite), LocatorUtils.property(thatLocator, "defaultSite", rhsDefaultSite), lhsDefaultSite, rhsDefaultSite, (this.defaultSite!= null), (that.defaultSite!= null))) {
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
            String lhsContact;
            lhsContact = this.getContact();
            String rhsContact;
            rhsContact = that.getContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contact", lhsContact), LocatorUtils.property(thatLocator, "contact", rhsContact), lhsContact, rhsContact, (this.contact!= null), (that.contact!= null))) {
                return false;
            }
        }
        {
            List<PhysicalAddress> lhsAddr;
            lhsAddr = (((this.addr!= null)&&(!this.addr.isEmpty()))?this.getAddr():null);
            List<PhysicalAddress> rhsAddr;
            rhsAddr = (((that.addr!= null)&&(!that.addr.isEmpty()))?that.getAddr():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addr", lhsAddr), LocatorUtils.property(thatLocator, "addr", rhsAddr), lhsAddr, rhsAddr, ((this.addr!= null)&&(!this.addr.isEmpty())), ((that.addr!= null)&&(!that.addr.isEmpty())))) {
                return false;
            }
        }
        {
            List<ContactInfo> lhsContactInfo;
            lhsContactInfo = (((this.contactInfo!= null)&&(!this.contactInfo.isEmpty()))?this.getContactInfo():null);
            List<ContactInfo> rhsContactInfo;
            rhsContactInfo = (((that.contactInfo!= null)&&(!that.contactInfo.isEmpty()))?that.getContactInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactInfo", lhsContactInfo), LocatorUtils.property(thatLocator, "contactInfo", rhsContactInfo), lhsContactInfo, rhsContactInfo, ((this.contactInfo!= null)&&(!this.contactInfo.isEmpty())), ((that.contactInfo!= null)&&(!that.contactInfo.isEmpty())))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsInventorySiteEx;
            lhsInventorySiteEx = this.getInventorySiteEx();
            IntuitAnyType rhsInventorySiteEx;
            rhsInventorySiteEx = that.getInventorySiteEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inventorySiteEx", lhsInventorySiteEx), LocatorUtils.property(thatLocator, "inventorySiteEx", rhsInventorySiteEx), lhsInventorySiteEx, rhsInventorySiteEx, (this.inventorySiteEx!= null), (that.inventorySiteEx!= null))) {
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
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive, (this.active!= null));
        }
        {
            Boolean theDefaultSite;
            theDefaultSite = this.isDefaultSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultSite", theDefaultSite), currentHashCode, theDefaultSite, (this.defaultSite!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            String theContact;
            theContact = this.getContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contact", theContact), currentHashCode, theContact, (this.contact!= null));
        }
        {
            List<PhysicalAddress> theAddr;
            theAddr = (((this.addr!= null)&&(!this.addr.isEmpty()))?this.getAddr():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addr", theAddr), currentHashCode, theAddr, ((this.addr!= null)&&(!this.addr.isEmpty())));
        }
        {
            List<ContactInfo> theContactInfo;
            theContactInfo = (((this.contactInfo!= null)&&(!this.contactInfo.isEmpty()))?this.getContactInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactInfo", theContactInfo), currentHashCode, theContactInfo, ((this.contactInfo!= null)&&(!this.contactInfo.isEmpty())));
        }
        {
            IntuitAnyType theInventorySiteEx;
            theInventorySiteEx = this.getInventorySiteEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inventorySiteEx", theInventorySiteEx), currentHashCode, theInventorySiteEx, (this.inventorySiteEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
