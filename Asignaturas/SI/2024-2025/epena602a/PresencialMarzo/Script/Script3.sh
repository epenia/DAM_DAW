#!/bin/bash

read -p "Introduzca la frase a descifrar: " FRASE


descrifrar(){
	local counter=${#1}
	local descifrado=""
	for (( i=$counter-1; i>=0; i-- ));do
		descifrado+=${FRASE:$i:1}
	done

	echo $descifrado
}

descrifrar $FRASE
