for $c in doc("catalogo_cd.xml")/CATALOGO/CD
where $c/PAIS='EU'
group by $d := $c/DISCOGRAFICA
return fn:concat('DISCOGRAFICA: ', $d, ', Numero CD`s: ', count($c))