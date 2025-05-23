#!/bin/bash

read -p "Introduce un numero: " primerNumero
read -p "Introduce un segundo numero: " segundoNumero

for i in $(seq "${primerNumero}" "${segundoNumero}")
do
    echo "numero ${i}"
done
