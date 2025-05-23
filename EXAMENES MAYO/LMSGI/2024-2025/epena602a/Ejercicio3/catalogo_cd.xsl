<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    
    <xsl:template match="/">
        <html>
            <head>
                <title>Catálogo (CD's UK)</title>
                <!-- Lo he realizado en linea porque XML Copy editor me estaba dando errores al enlazar la hoja de estilos con rutas relativas -->
                
                <style>
                    h2{
                        text-align: center;
                    }
                    table {
                        border: 1px black solid;
                        width: 60%;
                        margin: auto;
                    }
                    th {
                        background-color: cornflowerblue;
                        color: black;
                        font-weight: 700;
                        font-size: 20px;
                    }
                    th,td {
                        border: 1px black solid;
                        text-align: center;
                    }
                    div.footer {
                        margin-top: 20px;
                        text-align: center;
                    }
                </style>
            </head>
            <body>
                <h2>Catálogo (CD's UK)</h2>
                <table>
                    <tr>
                        <th>Título</th>
                        <th>Artista</th>
                        <th>Discográfica</th>
                        <th>Precio</th>
                    </tr>

                    <!-- Mostrar catalogo de UK ordenador por precio descendente superior a 8 -->
                    <xsl:for-each select="CATALOGO/CD[PAIS='UK']">   
                        <xsl:sort select="PRECIO" order="descending" data-type="number"/>               
                        <xsl:if test="PRECIO &gt; 8">  
                            <tr>
                                <td>
                                    <xsl:value-of select="TITULO" />
                                </td>
                                <td>
                                    <xsl:value-of select="ARTISTA" />
                                </td>
                                <td>
                                    <xsl:value-of select="DISCOGRAFICA" />
                                </td>
                                <td>                                
                                    <xsl:value-of select="PRECIO" /> 
                                    <xsl:choose>
                                        <xsl:when test="PRECIO/@MONEDA='DOLAR'">
                                            &#36;
                                        </xsl:when>
                                        <xsl:when test="PRECIO/@MONEDA='EURO'">
                                            &#8364;
                                        </xsl:when>
                                        <xsl:otherwise>
                                            &#xA3;
                                        </xsl:otherwise>
                                    </xsl:choose>
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>
                <div class="footer">Está ordenado por precio descendente superior a 8.</div>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>