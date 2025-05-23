<html>
  <head>
  <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <table>
      <tr>
      {
        for $x in doc("discos.xml")//disco
        group by $so := $x/soporte
        return
            <th>{ data($so) }</th>
      }
      </tr>
      <tr>
      {
        for $x in doc("discos.xml")//disco
        group by $so := $x/soporte
        return
            <td>{ count($x) }</td>
      }
      </tr>
    </table>
  </body>
</html>