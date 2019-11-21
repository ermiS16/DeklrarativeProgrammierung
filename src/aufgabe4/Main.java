package aufgabe4;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;

import aufgabe4.RECHNUNGEN.RECHNUNG;
import aufgabe4.RECHNUNGEN.RECHNUNG.ADRESSAT;
import aufgabe4.RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS;
import aufgabe4.RECHNUNGEN.RECHNUNG.RECHNUNGSDETAILS.BETRAG;
import aufgabe4.RECHNUNGEN.RECHNUNG.UNTERNEHMEN;
import aufgabe4.RECHNUNGEN.RECHNUNG.UNTERNEHMEN.ZAHLUNGSMOEGLICHKEITEN.BANKVERBINDUNG;

public class Main {
	
	public static void main(String[] args) throws JAXBException {
		
		JAXBContext context = JAXBContext.newInstance("aufgabe4");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		RECHNUNGEN rechnungen = (RECHNUNGEN) JAXBIntrospector.getValue(
			unmarshaller.unmarshal(new File("src/aufgabe4/rechnung.xml")));


		printRechnung(rechnungen);
	}
	
	public static void printRechnung(RECHNUNGEN rechnungen) {

		for(RECHNUNGEN.RECHNUNG rechnung : rechnungen.getRECHNUNG()) {
			String result = new String();
			UNTERNEHMEN unternehmen = rechnung.getUNTERNEHMEN();
			ADRESSAT empfaenger = rechnung.getADRESSAT();
			RECHNUNGSDETAILS rechnungsdetails = rechnung.getRECHNUNGSDETAILS();
			BETRAG betrag = rechnungsdetails.getBETRAG();
			BANKVERBINDUNG bankverbindung = rechnung.getUNTERNEHMEN().getZAHLUNGSMOEGLICHKEITEN().getBANKVERBINDUNG().get(0);
			
			
			result += empfaenger.getANREDE() + " " + empfaenger.getNAME() + ",\n"
					+ "bitte zahlen Sie endlich den geforderten Betrag\n"
					+ "von " + betrag.getBRUTTOGESAMT() + rechnungsdetails.getWAEHRUNG()
					+ " auf das Konto\n"
					+ bankString(bankverbindung) + " ein.\n";
			if(unternehmen.getTELEFON() != null) {
				result += "Falls Sie trotzdem noch unverschämt genug sind\n"
						+ "und Fragen haben, dann können Sie mich jederzeit\n"
						+ "unter " + unternehmen.getTELEFON() + " erreichen.\n";
			}
			result += "Hochachtungsvoll\n" + unternehmen.getNAME() + "\n\n";
			System.out.println(result);
		}
	}
	
	private static String bankString(BANKVERBINDUNG bankverbindung) {
		
		String bankString = new String();
		if(bankverbindung == null) {
			return ", , ";
		}
		String bankName = bankverbindung.getBANK();
		String bankBLZ = bankverbindung.getBLZ();
		String bankBIC = bankverbindung.getBIC();
		String bankKonto = bankverbindung.getKONTONUMMER();
		String bankIBAN = bankverbindung.getIBAN();
		
		if(bankName != null) {
			bankString += bankName + ", ";
		}
		if(bankBLZ != null) {
			bankString += bankBLZ + ", ";
		}else if(bankBIC != null) {
			bankString += bankBIC + ", ";
		}
		if(bankKonto != null) {
			bankString += bankKonto;
		}else if(bankIBAN != null) {
			bankString += bankIBAN;
		}
		return bankString;
	}
}
