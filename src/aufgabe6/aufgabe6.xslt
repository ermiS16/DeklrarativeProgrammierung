<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="xml" encoding="UTF-8" />
	<xsl:template match="/RECHNUNGEN">
		<xsl:copy>
			<xsl:apply-templates
				select="RECHNUNG[number(substring(RECHNUNGSDETAILS/RECHNUNGSDATUM, 1, 4)) &gt; 2010]" />
		</xsl:copy>
	</xsl:template>
	
	<xsl:template match="RECHNUNG">
		<xsl:copy>
			<xsl:apply-templates select="ADRESSAT[starts-with(ANREDE, 'Herr') or starts-with(ANREDE, 'Frau')]"/>
			<xsl:apply-templates select="RECHNUNGSDETAILS"/>
			<xsl:apply-templates select="PRODUKTE" />
		</xsl:copy>
	</xsl:template>
	<xsl:template match="ADRESSAT">
		<xsl:copy>
			<xsl:copy-of select="ANREDE" />
			<xsl:copy-of select="NAME" />
			<xsl:copy-of select="ADRESSE" />
		</xsl:copy>
	</xsl:template>
	
	<xsl:template match="PRODUKTE">
		<xsl:copy>
			<xsl:apply-templates select="PRODUKT" />
		</xsl:copy>	
	</xsl:template>

	<xsl:template match="PRODUKT">
		<xsl:copy>
			<xsl:copy-of select="POSITION" />
			<xsl:copy-of select="ART" />
			<xsl:copy-of select="GESAMTPREIS" />
		</xsl:copy>
	</xsl:template>
	
	<xsl:template match="RECHNUNGSDETAILS">
		<xsl:copy>
			<xsl:copy-of select="RECHNUNGSDATUM" />
			<xsl:copy-of select="RECHNUNGSNUMMER" />
			<xsl:apply-templates select="BETRAG" />
		</xsl:copy>
	</xsl:template>
	
	<xsl:template match="BETRAG">
		<xsl:copy>
			<xsl:copy-of select="BRUTTO_GESAMT" />
		</xsl:copy>
	</xsl:template>
</xsl:stylesheet>