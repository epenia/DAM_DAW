#!/bin/bash

inicio=1
contador=1
fin=5

while [ "$contador" -le "$fin" ] ;do

    echo "Apartado número: $contador"
    for i in $(seq "$inicio" "$fin");do 
        echo "Subapartador $contador.$i"
    done

    ((contador++))
done