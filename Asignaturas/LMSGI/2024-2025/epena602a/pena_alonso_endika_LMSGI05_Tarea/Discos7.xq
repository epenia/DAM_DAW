for $d in doc("discos.xml")//disco
group by $s := $d/sello
return $s