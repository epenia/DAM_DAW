#!/bin/bash
myPassword='EstoContrasenia'

validar_entrada(){
	local password=$1
	if [ "$password" == "$myPassword" ]; then
		echo "¡Contraseña correcta! Has ganado."
		exit 0
	else
		echo "Contraseña incorrecta. Intenta de nuevo."
	fi
}

pista(){
	local longitudTexto=${#myPassword}
	local pista=$((RANDOM % longitudTexto))
	local mostrarPista=""

	for (( i=0; i<longitudTexto; i++ )); do
		if [ $pista -eq $i ]; then
			mostrarPista+="${myPassword:$i:1}"
		else
			mostrarPista+='*'
		fi
	done
	echo "Pista: $mostrarPista"
}

intentos=0

while true; do
	if [ $intentos -eq 4 ]; then
		echo "Has llegado al límite de intentos. Saliendo ..."
		break
	fi
	
	echo "============== MENÚ =============="
	echo "ayuda: muestra una pista"
	echo "salir: sale del programa"
	echo ""	
	echo "cualquier otra cosa se compara con la contraseña"
	echo "=================================="
	
	read -p "Averigua la contraseña: " input
	
	case $input in
		ayuda)
			pista
			;;	
		salir)
			echo "Saliendo del programa"
			break
			;;
		*)
			validar_entrada "$input"
			;;
	esac
	((intentos++))
done
