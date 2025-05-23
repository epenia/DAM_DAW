for $c in doc("discos.xml")//cancion
where xs:integer($c/@tiempo) < 100 or xs:integer($c/@tiempo) > 400
return $c