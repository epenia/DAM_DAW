for $c in doc("catalogo_cd.xml")/CATALOGO/CD
where xs:decimal($c/PRECIO) < 9 and $c/PRECIO/@MONEDA="LIBRA"
return fn:concat('Título: ', $c/TITULO, ', Artista: ', $c/ARTISTA)