#!/bin/bash

while true;do
    clear
    echo "========= MENÚ ========="
    echo "1. Crear fichero"
    echo "2. Borrar fichero"
    echo ""
    echo ""
    echo "Salir. finaliza el programa"
    echo "========================"

    read -p "Elige una opción: " opcion

    # Hacemos que la opción introducida se sea siempre minusculas 
    # para poder hacer la comparación de forma correcta
    case $(echo "$opcion" | awk '{print tolower($0)}') in
        1)
            read -p "Introduce el nombre para el fichero: " fichero
            touch $fichero && date +"%d-%m-%Y" > $fichero            
            ;;
        2)
            read -p "Introduce la ruta del fichero que quieres eliminar: " eliminar
            if [ ! -f "$eliminar" ]; then
                echo "No existe el fichero"
                sleep 5
            else
                rm -i $eliminar
            fi
            ;;
        "salir")
            echo "Saliendo del programa..."
            break
            ;;
        *)
            echo "No vas hacer nada, prueba otra vez"
            sleep 5
            ;;
    esac

done