package Ejercicio1;

import java.util.Scanner;

public class Ejercicio2Forma2 {
	public static void main(String[] args) {
		
		// Contantes para convertir segundos en minutos y horas
		final int minuto = 60; 		// 1 minuto = 60 segundos
		final int hora = 60 * 60;	// 1 hora = 60 minutos * 60 segundos cada minuto		
		
		// Entrada de datos desde la consola
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce los segundos en positivo: ");		
		int segundosTotales = sc.nextInt();	 // Leemos el valor de segundos introducido
		sc.close(); 
						
		int hours = segundosTotales / hora; 				// Dividimos el total de segundos entre los segundos que tiene una hora
        int minutes = (segundosTotales % hora) / minuto; 	// Usamos el resto de la division de los segundos totales entre los segundos de una hora y lo dividimos entre los segundos que tiene un minuto
        int seconds = segundosTotales % minuto; 			// Finalmente recogemos el resto de dividir el total de segundos entre los segundos de un minuto

        System.out.printf("%d segundos son: %d horas, %d minutos y %d segundos%n", segundosTotales, hours, minutes, seconds);
	}
}