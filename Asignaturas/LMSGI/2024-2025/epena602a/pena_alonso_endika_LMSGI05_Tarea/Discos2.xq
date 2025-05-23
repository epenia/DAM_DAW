let $canciones := doc("discos.xml")//cancion
return fn:concat('Número de canciones: ', count($canciones), ' - Tiempo total: ', sum($canciones/@tiempo))