for $c in doc("discos.xml")//cancion
where xs:integer($c/@tiempo) < 150 or xs:integer($c/@tiempo) > 450
order by xs:integer($c/@tiempo) ascending
return $c