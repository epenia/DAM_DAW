for $x in doc("discos.xml")//disco
group by $g := $x/@género
return fn:concat($g,':', count($x))