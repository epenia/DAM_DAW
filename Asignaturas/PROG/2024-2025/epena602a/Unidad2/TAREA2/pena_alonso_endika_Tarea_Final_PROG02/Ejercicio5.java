package Ejercicio1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		// Entrada de datos desde la consola
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su edad: ");
		int edad = sc.nextInt(); // Leemos el valor y lo guardamos en la variable edad
		sc.close();
		
		String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
		
		System.out.println(resultado);
	}
}