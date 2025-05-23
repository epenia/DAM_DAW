package Ejercicio1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		// Contantes para convertir segundos en minutos y horas
		final int minuto = 60; 		// 1 minuto = 60 segundos
		final int hora = 60 * 60;	// 1 hora = 60 minutos * 60 segundos cada minuto		
		
		// Entrada de datos desde la consola
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce los segundos en positivo: ");		
		int segundosTotales = sc.nextInt();	 // Leemos el valor de segundos introducido
		sc.close(); 

		// Asignamos el valor de segundosTotales a otra variable con la que poder hacer operaciones
		int segundosRestantes = segundosTotales;
		
		// Calculamos horas, minutos y segundos
		int horas = segundosRestantes / hora;	
		segundosRestantes -= horas * hora;

		int minutos = segundosRestantes / minuto;
		segundosRestantes -= minutos * minuto;
		
		// Pintamos el resultado
        System.out.printf("%d segundos son: %d horas, %d minutos y %d segundos%n", segundosTotales, horas, minutos, segundosRestantes);
	}
}