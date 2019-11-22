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
					</xsl:copy>
				</xsl:if>
			</xsl:for-each>
		</xsl:copy>
	</xsl:template>
</xsl:stylesheet>