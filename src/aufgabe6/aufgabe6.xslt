<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="xml" encoding="UTF-8" />
	<xsl:template match="/">
		<xsl:copy>
			<xsl:apply-templates
				select="RECHNUNGEN/RECHNUNG[number(substring(RECHNUNGSDETAILS/RECHNUNGSDATUM, 1, 4)) &gt; 2010]" />
		</xsl:copy>
	</xsl:template>
	
	<xsl:template match="RECHNUNG">
		<xsl:copy>
			<xsl:copy-of select="ADRESSAT[starts-with(ANREDE, 'Herr') or starts-with(ANREDE, 'Frau')]/ADRESSE" />
			<xsl:copy-of select="RECHNUNGSDETAILS/RECHNUNGSDATUM" />
			<xsl:copy-of select="RECHNUNGSDETAILS/RECHNUNGSNUMMER" />
			<xsl:copy-of select="RECHNUNGSDETAILS/BETRAG/BRUTTO_GESAMT" />
			<xsl:apply-templates select="PRODUKTE/PRODUKT" />
		</xsl:copy>
	</xsl:template>
	<xsl:template match="PRODUKT">
		<xsl:copy>
			<xsl:copy-of select="POSITION" />
			<xsl:copy-of select="ART" />
			<xsl:copy-of select="GESAMTPREIS" />
		</xsl:copy>	
	</xsl:template>
	
</xsl:stylesheet>