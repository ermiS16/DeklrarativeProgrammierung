//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.11.21 um 10:13:33 AM CET 
//


package aufgabe4;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aufgabe4 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aufgabe4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RECHNUNGEN }
     * 
     */
    public RECHNUNGEN createRECHNUNGEN() {
        return new RECHNUNGEN();
    }

    /**
     * Create an instance of {@link RECHNUNGEN.RECHNUNG }
     * 
     */
    public RECHNUNGEN.RECHNUNG createRECHNUNGENRECHNUNG() {
        return new RECHNUNGEN.RECHNUNG();
    }

    /**
     * Create an instance of {@link RECHNUNGEN.RECHNUNG.PRODUKTE }
     * 
     */
    public RECHNUNGEN.RECHNUNG.PRODUKTE createRECHNUNGENRECHNUNGPRODUKTE() {
        return new RECHNUNGEN.RECHNUNG.PRODUKTE();
    }

    /**
     * Create an instance of {@link RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS }
     * 
     */
    public RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS createRECHNUNGENRECHNUNGRECHNUNGSDETAILS() {
        return new RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS();
    }

    /**
     * Create an instance of {@link RECHNUNGEN.RECHNUNG.ADRESSAT }
     * 
     */
    public RECHNUNGEN.RECHNUNG.ADRESSAT createRECHNUNGENRECHNUNGADRESSAT() {
        return new RECHNUNGEN.RECHNUNG.ADRESSAT();
    }

    /**
     * Create an instance of {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN }
     * 
     */
    public RECHNUNGEN.RECHNUNG.UNTERNEHMEN createRECHNUNGENRECHNUNGUNTERNEHMEN() {
        return new RECHNUNGEN.RECHNUNG.UNTERNEHMEN();
    }

    /**
     * Create an instance of {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN }
     * 
     */
    public RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN createRECHNUNGENRECHNUNGUNTERNEHMENZAHLUNGSMOEGLICHKEITEN() {
        return new RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN();
    }

    /**
     * Create an instance of {@link RECHNUNGEN.RECHNUNG.PRODUKTE.PRODUKT }
     * 
     */
    public RECHNUNGEN.RECHNUNG.PRODUKTE.PRODUKT createRECHNUNGENRECHNUNGPRODUKTEPRODUKT() {
        return new RECHNUNGEN.RECHNUNG.PRODUKTE.PRODUKT();
    }

    /**
     * Create an instance of {@link RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS.BETRAG }
     * 
     */
    public RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS.BETRAG createRECHNUNGENRECHNUNGRECHNUNGSDETAILSBETRAG() {
        return new RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS.BETRAG();
    }

    /**
     * Create an instance of {@link RECHNUNGEN.RECHNUNG.ADRESSAT.ADRESSE }
     * 
     */
    public RECHNUNGEN.RECHNUNG.ADRESSAT.ADRESSE createRECHNUNGENRECHNUNGADRESSATADRESSE() {
        return new RECHNUNGEN.RECHNUNG.ADRESSAT.ADRESSE();
    }

    /**
     * Create an instance of {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ADRESSE }
     * 
     */
    public RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ADRESSE createRECHNUNGENRECHNUNGUNTERNEHMENADRESSE() {
        return new RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ADRESSE();
    }

    /**
     * Create an instance of {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BANKVERBINDUNG }
     * 
     */
    public RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BANKVERBINDUNG createRECHNUNGENRECHNUNGUNTERNEHMENZAHLUNGSMOEGLICHKEITENBANKVERBINDUNG() {
        return new RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BANKVERBINDUNG();
    }

    /**
     * Create an instance of {@link RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BITCOINADRESSE }
     * 
     */
    public RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BITCOINADRESSE createRECHNUNGENRECHNUNGUNTERNEHMENZAHLUNGSMOEGLICHKEITENBITCOINADRESSE() {
        return new RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BITCOINADRESSE();
    }

}
