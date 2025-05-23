for $x in doc("discos.xml")//disco
(: Lo estoy ordenando para probar :)
order by count($x/cancion) descending
return fn:concat($x/titulo, ' - Número de canciones: ', count($x/cancion), ' - Tiempo total: ', sum($x/cancion/@tiempo))