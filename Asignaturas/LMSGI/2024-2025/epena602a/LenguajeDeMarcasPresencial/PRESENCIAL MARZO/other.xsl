<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">

<xsl:template match="/">
<html>
<head>
<meta charset="UTF-8"/> 
<link href="marzo2.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<table>
<xsl:apply-templates/>
</table>
</body>
</html>
</xsl:template>

<xsl:template match="propietario">
<tr>
<td>
<h1>Agenda de </h1>
</td>
<td>
<h2>
<xsl:apply-templates select="identificadores/apellidos"/>, <xsl:apply-templates select="identificadores/nombre"/>
</h2>
<p><xsl:apply-templates select="direccion/calle"/>, <xsl:apply-templates select="direccion/localidad"/> (<xsl:apply-templates select="direccion/cp"/>)</p>
<p><xsl:apply-templates select="telefonos" /></p>
</td>
</tr>
</xsl:template>

<xsl:template match="contactos">
<tr>
<td>
<h1>Contactos</h1>
</td>
<td>
<xsl:apply-templates select="persona"/>
</td>
</tr>
</xsl:template>

<xsl:template match="persona">
<div>
<h3>
<xsl:apply-templates select="identificadores/apellidos"/>, <xsl:apply-templates select="identificadores/nombre"/>
</h3>
<p><xsl:apply-templates select="direccion/calle"/>, <xsl:apply-templates select="direccion/localidad"/> (<xsl:apply-templates select="direccion/cp"/>)</p>
<p><xsl:apply-templates select="telefonos" /></p>
<hr />
</div>
</xsl:template>

</xsl:stylesheet>