<?xml version="1.0" encoding="UTF-8" ?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="text"/>
<xsl:template match="/">
	<xsl:apply-templates select="RECHNUNGEN/RECHNUNG[(RECHNUNGSDETAILS/BETRAG/BRUTTO_GESAMT &lt; 1000) and (ADRESSAT/ANREDE != '')]"/>
</xsl:template>

<xsl:template match="RECHNUNG">
<xsl:value-of select="ADRESSAT/ANREDE"/>
<xsl:text> </xsl:text>
<xsl:value-of select="ADRESSAT/NAME"/>
<xsl:text>.
</xsl:text>

<xsl:text>Danke für die Zahlung von</xsl:text>
<xsl:text> </xsl:text>
<xsl:value-of select="RECHNUNGSDETAILS/BETRAG/BRUTTO_GESAMT"/>
<xsl:text> für die Rechnung vom </xsl:text>
<xsl:value-of select="number(substring(RECHNUNGSDETAILS/RECHNUNGSDATUM, 9, 2))"/><xsl:text>.</xsl:text>
<xsl:value-of select="number(substring(RECHNUNGSDETAILS/RECHNUNGSDATUM, 6, 2))"/><xsl:text>.</xsl:text>
<xsl:value-of select="number(substring(RECHNUNGSDETAILS/RECHNUNGSDATUM, 1, 4))"/><xsl:text>.
</xsl:text>

<xsl:text>Ich hoffe die </xsl:text>
<xsl:value-of select="count(PRODUKTE/PRODUKT)" />
<xsl:text> Einzelposten sind zu Ihrer Zufriedenheit geliefert worden.

</xsl:text>


</xsl:template>
</xsl:stylesheet>







<!-- 
 -->