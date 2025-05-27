package Ejercicio1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		// Entrada de datos desde la consola
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce los grados Fahrenheit: ");
		int fahrenheit = sc.nextInt(); // Leemos el valor de grados
		sc.close();

		// Aplicamos la formula
		float celsius = (float) 5 / 9 * (fahrenheit - 32);

		// Pintamos la salida
		System.out.printf("Los %d grados Fahrenheit son: %.2f grados Celsius%n", fahrenheit, celsius);

	}
}