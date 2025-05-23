for $c in doc("catalogo_cd.xml")/CATALOGO/CD
group by $p := $c/PAIS
return fn:concat('PAIS: ', $p, ', Numero CD`s: ', count($c))