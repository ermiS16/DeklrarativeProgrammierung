//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.21 um 10:13:33 AM CET 
//


package aufgabe4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECHNUNG" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UNTERNEHMEN">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ADRESSE">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="STRASSE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HAUSNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PLZ">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="4"/>
 *                                             &lt;pattern value="([A-Z][A-Z]-)?[0-9]{4,7}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ORT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TELEFON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="STEUERNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ZAHLUNGSMOEGLICHKEITEN">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BANKVERBINDUNG" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="BLZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="KONTONUMMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="KONTOINHABER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="BITCOIN_ADRESSE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="WALLET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ADRESSAT">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ANREDE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ADRESSE">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="STRASSE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="HAUSNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PLZ">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="4"/>
 *                                             &lt;pattern value="([A-Z][A-Z]-)?[0-9]{4,7}"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ORT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RECHNUNGSDETAILS">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RECHNUNGSDATUM" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="RECHNUNGSNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="BETRAG">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BRUTTO_GESAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="NETTO_GESAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="MWST_GESAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="WAEHRUNG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PRODUKTE">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PRODUKT" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="POSITION" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                                       &lt;element name="ART" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="EINZELPREIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="GESAMTPREIS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="MWST_PROZENT" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                                       &lt;element name="DATUM" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="menge" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rechnung"
})
@XmlRootElement(name = "RECHNUNGEN")
public class RECHNUNGEN {

    @XmlElement(name = "RECHNUNG", required = true)
    protected List<RECHNUNGEN.RECHNUNG> rechnung;

    /**
     * Gets the value of the rechnung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rechnung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECHNUNG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RECHNUNGEN.RECHNUNG }
     * 
     * 
     */
    public List<RECHNUNGEN.RECHNUNG> getRECHNUNG() {
        if (rechnung == null) {
            rechnung = new ArrayList<RECHNUNGEN.RECHNUNG>();
        }
        return this.rechnung;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="UNTERNEHMEN">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ADRESSE">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="STRASSE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HAUSNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PLZ">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="4"/>
     *                                   &lt;pattern value="([A-Z][A-Z]-)?[0-9]{4,7}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ORT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TELEFON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="STEUERNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ZAHLUNGSMOEGLICHKEITEN">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BANKVERBINDUNG" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="BLZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="KONTONUMMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="KONTOINHABER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="BITCOIN_ADRESSE" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="WALLET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ADRESSAT">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ANREDE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ADRESSE">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="STRASSE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="HAUSNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PLZ">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="4"/>
     *                                   &lt;pattern value="([A-Z][A-Z]-)?[0-9]{4,7}"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ORT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RECHNUNGSDETAILS">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RECHNUNGSDATUM" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="RECHNUNGSNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="BETRAG">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BRUTTO_GESAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                             &lt;element name="NETTO_GESAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="MWST_GESAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="WAEHRUNG" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PRODUKTE">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PRODUKT" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="POSITION" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                             &lt;element name="ART" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="EINZELPREIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="GESAMTPREIS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="MWST_PROZENT" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *                             &lt;element name="DATUM" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="menge" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unternehmen",
        "adressat",
        "rechnungsdetails",
        "produkte"
    })
    public static class RECHNUNG {

        @XmlElement(name = "UNTERNEHMEN", required = true)
        protected RECHNUNGEN.RECHNUNG.UNTERNEHMEN unternehmen;
        @XmlElement(name = "ADRESSAT", required = true)
        protected RECHNUNGEN.RECHNUNG.ADRESSAT adressat;
        @XmlElement(name = "RECHNUNGSDETAILS", required = true)
        protected RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS rechnungsdetails;
        @XmlElement(name = "PRODUKTE", required = true)
        protected RECHNUNGEN.RECHNUNG.PRODUKTE produkte;

        /**
         * Ruft den Wert der unternehmen-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN }
         *     
         */
        public RECHNUNGEN.RECHNUNG.UNTERNEHMEN getUNTERNEHMEN() {
            return unternehmen;
        }

        /**
         * Legt den Wert der unternehmen-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN }
         *     
         */
        public void setUNTERNEHMEN(RECHNUNGEN.RECHNUNG.UNTERNEHMEN value) {
            this.unternehmen = value;
        }

        /**
         * Ruft den Wert der adressat-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RECHNUNGEN.RECHNUNG.ADRESSAT }
         *     
         */
        public RECHNUNGEN.RECHNUNG.ADRESSAT getADRESSAT() {
            return adressat;
        }

        /**
         * Legt den Wert der adressat-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RECHNUNGEN.RECHNUNG.ADRESSAT }
         *     
         */
        public void setADRESSAT(RECHNUNGEN.RECHNUNG.ADRESSAT value) {
            this.adressat = value;
        }

        /**
         * Ruft den Wert der rechnungsdetails-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS }
         *     
         */
        public RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS getRECHNUNGSDETAILS() {
            return rechnungsdetails;
        }

        /**
         * Legt den Wert der rechnungsdetails-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS }
         *     
         */
        public void setRECHNUNGSDETAILS(RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS value) {
            this.rechnungsdetails = value;
        }

        /**
         * Ruft den Wert der produkte-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RECHNUNGEN.RECHNUNG.PRODUKTE }
         *     
         */
        public RECHNUNGEN.RECHNUNG.PRODUKTE getPRODUKTE() {
            return produkte;
        }

        /**
         * Legt den Wert der produkte-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RECHNUNGEN.RECHNUNG.PRODUKTE }
         *     
         */
        public void setPRODUKTE(RECHNUNGEN.RECHNUNG.PRODUKTE value) {
            this.produkte = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ANREDE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ADRESSE">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="STRASSE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HAUSNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PLZ">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="4"/>
         *                         &lt;pattern value="([A-Z][A-Z]-)?[0-9]{4,7}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ORT" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "anrede",
            "name",
            "adresse"
        })
        public static class ADRESSAT {

            @XmlElement(name = "ANREDE", required = true)
            protected String anrede;
            @XmlElement(name = "NAME", required = true)
            protected String name;
            @XmlElement(name = "ADRESSE", required = true)
            protected RECHNUNGEN.RECHNUNG.ADRESSAT.ADRESSE adresse;

            /**
             * Ruft den Wert der anrede-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getANREDE() {
                return anrede;
            }

            /**
             * Legt den Wert der anrede-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setANREDE(String value) {
                this.anrede = value;
            }

            /**
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

            /**
             * Ruft den Wert der adresse-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link RECHNUNGEN.RECHNUNG.ADRESSAT.ADRESSE }
             *     
             */
            public RECHNUNGEN.RECHNUNG.ADRESSAT.ADRESSE getADRESSE() {
                return adresse;
            }

            /**
             * Legt den Wert der adresse-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link RECHNUNGEN.RECHNUNG.ADRESSAT.ADRESSE }
             *     
             */
            public void setADRESSE(RECHNUNGEN.RECHNUNG.ADRESSAT.ADRESSE value) {
                this.adresse = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="STRASSE" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HAUSNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PLZ">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="4"/>
             *               &lt;pattern value="([A-Z][A-Z]-)?[0-9]{4,7}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ORT" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "strasse",
                "hausnummer",
                "plz",
                "ort"
            })
            public static class ADRESSE {

                @XmlElement(name = "STRASSE", required = true)
                protected String strasse;
                @XmlElement(name = "HAUSNUMMER", required = true)
                protected String hausnummer;
                @XmlElement(name = "PLZ", required = true)
                protected String plz;
                @XmlElement(name = "ORT", required = true)
                protected String ort;

                /**
                 * Ruft den Wert der strasse-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSTRASSE() {
                    return strasse;
                }

                /**
                 * Legt den Wert der strasse-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSTRASSE(String value) {
                    this.strasse = value;
                }

                /**
                 * Ruft den Wert der hausnummer-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHAUSNUMMER() {
                    return hausnummer;
                }

                /**
                 * Legt den Wert der hausnummer-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHAUSNUMMER(String value) {
                    this.hausnummer = value;
                }

                /**
                 * Ruft den Wert der plz-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPLZ() {
                    return plz;
                }

                /**
                 * Legt den Wert der plz-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPLZ(String value) {
                    this.plz = value;
                }

                /**
                 * Ruft den Wert der ort-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORT() {
                    return ort;
                }

                /**
                 * Legt den Wert der ort-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORT(String value) {
                    this.ort = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PRODUKT" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="POSITION" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                   &lt;element name="ART" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="EINZELPREIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="GESAMTPREIS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="MWST_PROZENT" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
         *                   &lt;element name="DATUM" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="menge" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "produkt"
        })
        public static class PRODUKTE {

            @XmlElement(name = "PRODUKT", required = true)
            protected List<RECHNUNGEN.RECHNUNG.PRODUKTE.PRODUKT> produkt;

            /**
             * Gets the value of the produkt property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the produkt property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPRODUKT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RECHNUNGEN.RECHNUNG.PRODUKTE.PRODUKT }
             * 
             * 
             */
            public List<RECHNUNGEN.RECHNUNG.PRODUKTE.PRODUKT> getPRODUKT() {
                if (produkt == null) {
                    produkt = new ArrayList<RECHNUNGEN.RECHNUNG.PRODUKTE.PRODUKT>();
                }
                return this.produkt;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="POSITION" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
             *         &lt;element name="ART" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="EINZELPREIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="GESAMTPREIS" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="MWST_PROZENT" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
             *         &lt;element name="DATUM" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *       &lt;/sequence>
             *       &lt;attribute name="menge" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "position",
                "art",
                "einzelpreis",
                "gesamtpreis",
                "mwstprozent",
                "datum"
            })
            public static class PRODUKT {

                @XmlElement(name = "POSITION")
                @XmlSchemaType(name = "unsignedInt")
                protected long position;
                @XmlElement(name = "ART", required = true)
                protected String art;
                @XmlElement(name = "EINZELPREIS")
                protected String einzelpreis;
                @XmlElement(name = "GESAMTPREIS", required = true)
                protected String gesamtpreis;
                @XmlElement(name = "MWST_PROZENT")
                @XmlSchemaType(name = "unsignedInt")
                protected Long mwstprozent;
                @XmlElement(name = "DATUM", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar datum;
                @XmlAttribute(name = "menge", required = true)
                protected String menge;

                /**
                 * Ruft den Wert der position-Eigenschaft ab.
                 * 
                 */
                public long getPOSITION() {
                    return position;
                }

                /**
                 * Legt den Wert der position-Eigenschaft fest.
                 * 
                 */
                public void setPOSITION(long value) {
                    this.position = value;
                }

                /**
                 * Ruft den Wert der art-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getART() {
                    return art;
                }

                /**
                 * Legt den Wert der art-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setART(String value) {
                    this.art = value;
                }

                /**
                 * Ruft den Wert der einzelpreis-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEINZELPREIS() {
                    return einzelpreis;
                }

                /**
                 * Legt den Wert der einzelpreis-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEINZELPREIS(String value) {
                    this.einzelpreis = value;
                }

                /**
                 * Ruft den Wert der gesamtpreis-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGESAMTPREIS() {
                    return gesamtpreis;
                }

                /**
                 * Legt den Wert der gesamtpreis-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGESAMTPREIS(String value) {
                    this.gesamtpreis = value;
                }

                /**
                 * Ruft den Wert der mwstprozent-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getMWSTPROZENT() {
                    return mwstprozent;
                }

                /**
                 * Legt den Wert der mwstprozent-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setMWSTPROZENT(Long value) {
                    this.mwstprozent = value;
                }

                /**
                 * Ruft den Wert der datum-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDATUM() {
                    return datum;
                }

                /**
                 * Legt den Wert der datum-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDATUM(XMLGregorianCalendar value) {
                    this.datum = value;
                }

                /**
                 * Ruft den Wert der menge-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMenge() {
                    return menge;
                }

                /**
                 * Legt den Wert der menge-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMenge(String value) {
                    this.menge = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="RECHNUNGSDATUM" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="RECHNUNGSNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="BETRAG">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BRUTTO_GESAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                   &lt;element name="NETTO_GESAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="MWST_GESAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="WAEHRUNG" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "rechnungsdatum",
            "rechnungsnummer",
            "betrag",
            "waehrung"
        })
        public static class RECHNUNGSDETAILS {

            @XmlElement(name = "RECHNUNGSDATUM", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar rechnungsdatum;
            @XmlElement(name = "RECHNUNGSNUMMER", required = true)
            protected String rechnungsnummer;
            @XmlElement(name = "BETRAG", required = true)
            protected RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS.BETRAG betrag;
            @XmlElement(name = "WAEHRUNG", required = true)
            protected String waehrung;

            /**
             * Ruft den Wert der rechnungsdatum-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getRECHNUNGSDATUM() {
                return rechnungsdatum;
            }

            /**
             * Legt den Wert der rechnungsdatum-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setRECHNUNGSDATUM(XMLGregorianCalendar value) {
                this.rechnungsdatum = value;
            }

            /**
             * Ruft den Wert der rechnungsnummer-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRECHNUNGSNUMMER() {
                return rechnungsnummer;
            }

            /**
             * Legt den Wert der rechnungsnummer-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRECHNUNGSNUMMER(String value) {
                this.rechnungsnummer = value;
            }

            /**
             * Ruft den Wert der betrag-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS.BETRAG }
             *     
             */
            public RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS.BETRAG getBETRAG() {
                return betrag;
            }

            /**
             * Legt den Wert der betrag-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS.BETRAG }
             *     
             */
            public void setBETRAG(RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS.BETRAG value) {
                this.betrag = value;
            }

            /**
             * Ruft den Wert der waehrung-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWAEHRUNG() {
                return waehrung;
            }

            /**
             * Legt den Wert der waehrung-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWAEHRUNG(String value) {
                this.waehrung = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="BRUTTO_GESAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *         &lt;element name="NETTO_GESAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="MWST_GESAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "bruttogesamt",
                "nettogesamt",
                "mwstgesamt"
            })
            public static class BETRAG {

                @XmlElement(name = "BRUTTO_GESAMT", required = true)
                protected BigDecimal bruttogesamt;
                @XmlElement(name = "NETTO_GESAMT")
                protected BigDecimal nettogesamt;
                @XmlElement(name = "MWST_GESAMT", required = true)
                protected BigDecimal mwstgesamt;

                /**
                 * Ruft den Wert der bruttogesamt-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getBRUTTOGESAMT() {
                    return bruttogesamt;
                }

                /**
                 * Legt den Wert der bruttogesamt-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setBRUTTOGESAMT(BigDecimal value) {
                    this.bruttogesamt = value;
                }

                /**
                 * Ruft den Wert der nettogesamt-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNETTOGESAMT() {
                    return nettogesamt;
                }

                /**
                 * Legt den Wert der nettogesamt-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNETTOGESAMT(BigDecimal value) {
                    this.nettogesamt = value;
                }

                /**
                 * Ruft den Wert der mwstgesamt-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMWSTGESAMT() {
                    return mwstgesamt;
                }

                /**
                 * Legt den Wert der mwstgesamt-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMWSTGESAMT(BigDecimal value) {
                    this.mwstgesamt = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ADRESSE">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="STRASSE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="HAUSNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PLZ">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="4"/>
         *                         &lt;pattern value="([A-Z][A-Z]-)?[0-9]{4,7}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ORT" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TELEFON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="STEUERNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ZAHLUNGSMOEGLICHKEITEN">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BANKVERBINDUNG" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="BLZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="KONTONUMMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="KONTOINHABER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="BITCOIN_ADRESSE" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="WALLET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "adresse",
            "telefon",
            "fax",
            "email",
            "steuernummer",
            "zahlungsmoeglichkeiten"
        })
        public static class UNTERNEHMEN {

            @XmlElement(name = "NAME", required = true)
            protected String name;
            @XmlElement(name = "ADRESSE", required = true)
            protected RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ADRESSE adresse;
            @XmlElement(name = "TELEFON")
            protected String telefon;
            @XmlElement(name = "FAX")
            protected String fax;
            @XmlElement(name = "EMAIL")
            protected String email;
            @XmlElement(name = "STEUERNUMMER", required = true)
            protected String steuernummer;
            @XmlElement(name = "ZAHLUNGSMOEGLICHKEITEN", required = true)
            protected RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN zahlungsmoeglichkeiten;

            /**
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

            /**
             * Ruft den Wert der adresse-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ADRESSE }
             *     
             */
            public RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ADRESSE getADRESSE() {
                return adresse;
            }

            /**
             * Legt den Wert der adresse-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ADRESSE }
             *     
             */
            public void setADRESSE(RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ADRESSE value) {
                this.adresse = value;
            }

            /**
             * Ruft den Wert der telefon-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTELEFON() {
                return telefon;
            }

            /**
             * Legt den Wert der telefon-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTELEFON(String value) {
                this.telefon = value;
            }

            /**
             * Ruft den Wert der fax-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFAX() {
                return fax;
            }

            /**
             * Legt den Wert der fax-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFAX(String value) {
                this.fax = value;
            }

            /**
             * Ruft den Wert der email-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEMAIL() {
                return email;
            }

            /**
             * Legt den Wert der email-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEMAIL(String value) {
                this.email = value;
            }

            /**
             * Ruft den Wert der steuernummer-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSTEUERNUMMER() {
                return steuernummer;
            }

            /**
             * Legt den Wert der steuernummer-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSTEUERNUMMER(String value) {
                this.steuernummer = value;
            }

            /**
             * Ruft den Wert der zahlungsmoeglichkeiten-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN }
             *     
             */
            public RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN getZAHLUNGSMOEGLICHKEITEN() {
                return zahlungsmoeglichkeiten;
            }

            /**
             * Legt den Wert der zahlungsmoeglichkeiten-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN }
             *     
             */
            public void setZAHLUNGSMOEGLICHKEITEN(RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN value) {
                this.zahlungsmoeglichkeiten = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="STRASSE" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="HAUSNUMMER" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PLZ">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="4"/>
             *               &lt;pattern value="([A-Z][A-Z]-)?[0-9]{4,7}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ORT" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "strasse",
                "hausnummer",
                "plz",
                "ort"
            })
            public static class ADRESSE {

                @XmlElement(name = "STRASSE", required = true)
                protected String strasse;
                @XmlElement(name = "HAUSNUMMER", required = true)
                protected String hausnummer;
                @XmlElement(name = "PLZ", required = true)
                protected String plz;
                @XmlElement(name = "ORT", required = true)
                protected String ort;

                /**
                 * Ruft den Wert der strasse-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSTRASSE() {
                    return strasse;
                }

                /**
                 * Legt den Wert der strasse-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSTRASSE(String value) {
                    this.strasse = value;
                }

                /**
                 * Ruft den Wert der hausnummer-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHAUSNUMMER() {
                    return hausnummer;
                }

                /**
                 * Legt den Wert der hausnummer-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHAUSNUMMER(String value) {
                    this.hausnummer = value;
                }

                /**
                 * Ruft den Wert der plz-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPLZ() {
                    return plz;
                }

                /**
                 * Legt den Wert der plz-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPLZ(String value) {
                    this.plz = value;
                }

                /**
                 * Ruft den Wert der ort-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getORT() {
                    return ort;
                }

                /**
                 * Legt den Wert der ort-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setORT(String value) {
                    this.ort = value;
                }

            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="BANKVERBINDUNG" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="BLZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="KONTONUMMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="KONTOINHABER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="BITCOIN_ADRESSE" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="WALLET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "bankverbindung",
                "bitcoinadresse"
            })
            public static class ZAHLUNGSMOEGLICHKEITEN {

                @XmlElement(name = "BANKVERBINDUNG", required = true)
                protected List<RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BANKVERBINDUNG> bankverbindung;
                @XmlElement(name = "BITCOIN_ADRESSE")
                protected RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BITCOINADRESSE bitcoinadresse;

                /**
                 * Gets the value of the bankverbindung property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bankverbindung property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBANKVERBINDUNG().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BANKVERBINDUNG }
                 * 
                 * 
                 */
                public List<RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BANKVERBINDUNG> getBANKVERBINDUNG() {
                    if (bankverbindung == null) {
                        bankverbindung = new ArrayList<RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BANKVERBINDUNG>();
                    }
                    return this.bankverbindung;
                }

                /**
                 * Ruft den Wert der bitcoinadresse-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BITCOINADRESSE }
                 *     
                 */
                public RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BITCOINADRESSE getBITCOINADRESSE() {
                    return bitcoinadresse;
                }

                /**
                 * Legt den Wert der bitcoinadresse-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BITCOINADRESSE }
                 *     
                 */
                public void setBITCOINADRESSE(RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BITCOINADRESSE value) {
                    this.bitcoinadresse = value;
                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="BANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="IBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="BLZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="KONTONUMMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="KONTOINHABER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "bank",
                    "iban",
                    "bic",
                    "blz",
                    "kontonummer",
                    "kontoinhaber"
                })
                public static class BANKVERBINDUNG {

                    @XmlElement(name = "BANK")
                    protected String bank;
                    @XmlElement(name = "IBAN")
                    protected String iban;
                    @XmlElement(name = "BIC")
                    protected String bic;
                    @XmlElement(name = "BLZ")
                    protected String blz;
                    @XmlElement(name = "KONTONUMMER")
                    protected String kontonummer;
                    @XmlElement(name = "KONTOINHABER")
                    protected String kontoinhaber;

                    /**
                     * Ruft den Wert der bank-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBANK() {
                        return bank;
                    }

                    /**
                     * Legt den Wert der bank-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBANK(String value) {
                        this.bank = value;
                    }

                    /**
                     * Ruft den Wert der iban-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIBAN() {
                        return iban;
                    }

                    /**
                     * Legt den Wert der iban-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIBAN(String value) {
                        this.iban = value;
                    }

                    /**
                     * Ruft den Wert der bic-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBIC() {
                        return bic;
                    }

                    /**
                     * Legt den Wert der bic-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBIC(String value) {
                        this.bic = value;
                    }

                    /**
                     * Ruft den Wert der blz-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBLZ() {
                        return blz;
                    }

                    /**
                     * Legt den Wert der blz-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBLZ(String value) {
                        this.blz = value;
                    }

                    /**
                     * Ruft den Wert der kontonummer-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getKONTONUMMER() {
                        return kontonummer;
                    }

                    /**
                     * Legt den Wert der kontonummer-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setKONTONUMMER(String value) {
                        this.kontonummer = value;
                    }

                    /**
                     * Ruft den Wert der kontoinhaber-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getKONTOINHABER() {
                        return kontoinhaber;
                    }

                    /**
                     * Legt den Wert der kontoinhaber-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setKONTOINHABER(String value) {
                        this.kontoinhaber = value;
                    }

                }


                /**
                 * <p>Java-Klasse für anonymous complex type.
                 * 
                 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="WALLET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "wallet"
                })
                public static class BITCOINADRESSE {

                    @XmlElement(name = "WALLET")
                    protected String wallet;

                    /**
                     * Ruft den Wert der wallet-Eigenschaft ab.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getWALLET() {
                        return wallet;
                    }

                    /**
                     * Legt den Wert der wallet-Eigenschaft fest.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setWALLET(String value) {
                        this.wallet = value;
                    }

                }

            }

        }

    }

}
