package Ejercicio1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
				
		// Entrada de datos desde la consola
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero de 4 cifras: ");		
		int numero = sc.nextInt();	 // Leemos el valor entero de 4 cifras
		sc.close(); 
		
		// Descomposición del número en millares, centenas, decenas y unidades
        int millares = numero / 1000;
        int centenas = (numero % 1000) / 100;
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10;
		
		// Imprimimos por la salida estandar del sistema
		System.out.println("Millares: " + millares);
		System.out.println("Centenas: " + centenas);
		System.out.println("Decenas: " + decenas);
		System.out.println("Unidades: " + unidades);				
	}
}