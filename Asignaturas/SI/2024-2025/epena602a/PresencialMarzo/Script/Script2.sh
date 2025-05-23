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

count_ficheros=0
for fichero in `ls -l ${RUTA}`;do
	if [[ "$fichero" =~ \.txt$ ]]; then
		count_ficheros=$((count_ficheros+1))
		echo `basename ${fichero}`
	fi
done


echo "El numero total de ficheros txt es de: ${count_ficheros}"
