<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="xml" encoding="UTF-8" />
	<xsl:template match="/RECHNUNGEN">
		<xsl:copy>
			<xsl:for-each select="RECHNUNG">
				<xsl:if	test="RECHNUNGSDETAILS/RECHNUNGSDATUM[translate(./text(), '-', '') > 20101231]">
					<xsl:copy>
						<xsl:for-each select="UNTERNEHMEN">
							<xsl:copy>
								<xsl:for-each select="./*">
									<xsl:if test="name(.) != 'ZAHLUNGSMOEGLICHKEITEN'">
										<xsl:copy-of select="." />
									</xsl:if>
								</xsl:for-each>
							</xsl:copy>
						</xsl:for-each>
						
						<xsl:for-each select="ADRESSAT">
							<xsl:copy>
								<xsl:if test="./ANREDE = 'Herr' or ./ANREDE = 'Frau'">
									<xsl:for-each select="./*">
										<xsl:if test="name(.) = 'ADRESSE'">
											<xsl:copy-of select="." />
										</xsl:if>
									</xsl:for-each>
								</xsl:if>
							</xsl:copy>
						</xsl:for-each>
						
						<xsl:for-each select="RECHNUNGSDETAILS">
							<xsl:copy>
								<xsl:for-each select="./*">
									<xsl:if test="name(.) = 'BETRAG'">
										<xsl:for-each select="./*">
											<xsl:if test="name(.) = 'BRUTTO_GESAMT'">
												<xsl:copy-of select="." />
											</xsl:if>
										</xsl:for-each>
									</xsl:if>
									<xsl:if test="name(.) = 'RECHNUNGSDATUM' or name(.) = 'RECHNUNGSNUMMER'">
										<xsl:copy-of select="." />
									</xsl:if>
								</xsl:for-each>
							</xsl:copy>
						</xsl:for-each>
						
						<xsl:for-each select="PRODUKTE/PRODUKT">
							<xsl:copy>
								<xsl:for-each select="./*">
									<xsl:if test="name(.) ='POSITION'">
										<xsl:copy>
											<xsl:copy-of select="position()" />
										</xsl:copy>
									</xsl:if>
									<xsl:if test="name(.) = 'ART' or name(.) = 'GESAMTPREIS'">
										<xsl:copy-of select="." />
									</xsl:if>
								</xsl:for-each>
							</xsl:copy>
						</xsl:for-each>
						
					</xsl:copy>
				</xsl:if>
			</xsl:for-each>
		</xsl:copy>
	</xsl:template>
</xsl:stylesheet>