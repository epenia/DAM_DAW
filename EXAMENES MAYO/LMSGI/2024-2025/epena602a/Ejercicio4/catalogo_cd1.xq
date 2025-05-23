for $c in doc("catalogo_cd.xml")/CATALOGO/CD
where xs:integer($c/AÑO) < 1986
order by xs:decimal($c/PRECIO) descending
return fn:concat('Título: ', $c/TITULO, ', Artista: ', $c/ARTISTA, ', Precio: ', $c/PRECIO)