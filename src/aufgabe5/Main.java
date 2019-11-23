package aufgabe5;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {
	private static final String[] expressions = {
			"/RECHNUNGEN/RECHNUNG[4]/UNTERNEHMEN/ZAHLUNGSMOEGLICHKEITEN/*[1]/*",
			"/RECHNUNGEN/RECHNUNG/UNTERNEHMEN[TELEFON/text() != '']/NAME/text()",
			"//ADRESSE[starts-with(PLZ/text(), 7)]/*/text()",
			"//PRODUKT[EINZELPREIS < 100.00]/text()",
			"//RECHNUNG[count(PRODUKTE/PRODUKT) > 3]/RECHNUNGSDETAILS/RECHNUNGSNUMMER/text()",
			"//RECHNUNG[sum(PRODUKTE/PRODUKT/GESAMTPREIS/text()) != RECHNUNGSDETAILS/BETRAG/BRUTTO_GESAMT/text()]",
			"//RECHNUNG[contains(ADRESSAT/ANDREDE, 'Herr')] | //RECHNUNG[contains(ADRESSAT/ANREDE, 'Frau')]",
			"//RECHNUNG[RECHNUNGSDETAILS/BETRAG/BRUTTO_GESAMT/text() > 1000]",
			"//RECHNUNG[RECHNUNGSDETAILS/BETRAG/BRUTTO_GESAMT/text() > sum(//BRUTTO_GESAMT/text()) div count(//RECHNUNG)]"
	};
	
	private static final String[] tasks = {
			"Die erste Zahlungsart der dritten Rechnung",
			"Der Namenstext aus allen Adressen, die eine Telefonnummer enthalten",
			"Die Adresse jedes Leistungsbringers, die eine Postleitzahl, beginnend mit Ziffer 7, besitzt",
			"Jede Rechnungsposition, die einen Einzelpreis bestitzt, der kleiner als 100.00 Euro ist",
			"Die Rechnungsnummer jeder Rechnung mit mehr als 3 Positionen",
			"Jede Rechnung, bei der die Summe der Gesamtpreise der Positionen ungleich dem Rechnungsbruttobetrag ist",
			"Jede Rechnung, die in der Anrede der Empfaengeradresse den Text 'Herr' oder 'Frau' enthaehlt.",
			"Jede Rechnung mit einem Brutto-Gesamtbetrag über 1000.00 Euro",
			"Jede Rechnung mit einem Brutto-Gesamtbetrag über dem Durchschnittlichen Brutto-Gesamtbetrag aller Rechnungen"
	};
	
	public static void main(String[] args) {
		File xmlFile = new File("src/aufgabe5/rechnung.xml");
		try {
			Document doc = getDocument(xmlFile);		
			XPath xPath = getXPath();
			List<NodeList> nodeLists = new ArrayList<NodeList>();
			for(int i=0; i<expressions.length; i++) {
				NodeList nodeList = extractExpressions(expressions[i], doc, xPath);
				nodeLists.add(nodeList);				
			}
			printResult(nodeLists);
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

	private static Document getDocument(File xmlFile) throws 
	ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		builderFactory.setNamespaceAware(false);

		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.parse(xmlFile.getPath());
		document.getDocumentElement().normalize();
//		printXmlFile(document);
		return document;
	}
	
	private static XPath getXPath() {
		XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xPath = xPathFactory.newXPath();
		return xPath;
	}
	
	private static NodeList extractExpressions(String expression, Document doc, XPath xPath) throws XPathExpressionException {
		XPathExpression expr = xPath.compile(expression);		
		return (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
	}
	
	/**
	 * Prints the Eleement of all NodeLists in the List.
	 * @param nodeLists a List of NodeList.
	 */
	private static void printResult(List<NodeList> nodeLists) {
		int index = 0;
		for(NodeList list : nodeLists) {
			System.out.println("Aufgabe " + (index+1) + ": " + tasks[index]);
			for(int i=0; i<list.getLength(); i++) {
				System.out.println(list.item(i).getTextContent());					
			}
			index++;
			System.out.println();
		}
	}

	/**
	 * Print the Content of a XML File.
	 * For Debugging.
	 * @param doc to print
	 */
	private static void printXmlFile(Document doc) {
	       TransformerFactory tf = TransformerFactory.newInstance();
	       Transformer transformer;
	       try {
	            transformer = tf.newTransformer();
	            StringWriter writer = new StringWriter();
	            transformer.transform(new DOMSource(doc), new StreamResult(writer));
	            String xml = writer.getBuffer().toString();
	            System.out.println(xml);
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	}
}
