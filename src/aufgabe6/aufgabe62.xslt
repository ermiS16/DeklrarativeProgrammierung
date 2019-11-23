<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" encoding="UTF-8" />
<xsl:template match="/RECHNUNGEN">
	<xsl:apply-templates select="RECHNUNG"/>
</xsl:template>
<xsl:template match="RECHNUNG">	
	<xsl:for-each select=".">
		<xsl:text>
		</xsl:text>
		<xsl:text><xsl:value-of select="ADRESSAT/ANREDE"/></xsl:text>
		<xsl:text> </xsl:text>
		<xsl:text><xsl:value-of select="ADRESSAT/NAME"/></xsl:text><xsl:text>.
		</xsl:text>
		<xsl:text>Danke für die Zahlung von</xsl:text>
		<xsl:text><xsl:value-of select="RECHNUNGSDETAILS/BRUTTO_GESAMT"/> </xsl:text>
		<xsl:text> für die Rechnung vom </xsl:text>
		<xsl:text><xsl:value-of select="RECHNUNGSDETAILS/RECHNUNGSDATUM[translate(./text(),'-','.')]"/></xsl:text><xsl:text>.
		</xsl:text>
		<xsl:text>Ich hoffe die </xsl:text>
		<xsl:text><xsl:value-of select="count(PRODUKTE/PRODUKT)" /></xsl:text>
		<xsl:text> Einzelposten sind zu Ihrer Zufriedenheit geliefert worden.
		</xsl:text>
	</xsl:for-each>
</xsl:template>

</xsl:stylesheet>