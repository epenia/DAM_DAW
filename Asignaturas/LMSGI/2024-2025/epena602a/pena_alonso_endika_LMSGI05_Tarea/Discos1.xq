for $x in doc("discos.xml")//disco
where count($x/cancion) <= 6
return $x/titulo