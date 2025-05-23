#!/bin/bash
RUTA=${1} # Recupera el primer argumento como RUTA

if [ "${RUTA}" == "" ]; then
# Si no tenemos RUTA al lanzar el script la pedimos
	read -p "Introduzca la ruta que quiere explorar: " RUTA
fi

if [ -z "${RUTA}" ]; then
	echo "La ruta ${RUTA} no existe"
	exit 1
fi

if [ ! -d "${RUTA}" ]; then	
	echo "La ruta no es un directorio"
	exit 1
fi


numero_archivos=$(find ${RUTA} -maxdepth 1 -type f|wc -l)

echo "En la ubicación '${RUTA}' se han detectado ${numero_archivos} archivos secretos"
