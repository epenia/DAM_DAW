#!/bin/bash

read -p "Introduce la ruta de una carpeta que queremos listar: " ruta

if [ -e "$ruta" ]; then
    if [ -f "$ruta" ];then
        echo "La ruta: $ruta, corresponde aun fichero no aun directorio y por tanto no se puede listar"
    fi

    if [ -d "$ruta" ];then
        echo `ls -l $ruta/*.txt | wc -l`
    fi

fi