package Ejerc1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Crear un coche y un titular con datos fijos
		Persona nuevaPersona1 = new Persona ("Jose", 37, "Hombre");
		Coche nuevoCoche1 = new Coche ("1234CFM", "Nissan", "Juke", nuevaPersona1.getnombre(), 60 , 7.5);
		nuevaPersona1.imprimirPersona();	
		System.out.println();

		
		//Llamamos a los metodos creados en la clase coche con datos fijos.
		
		nuevoCoche1.realizarViaje(620.0); // Km Introducidos viaje1.
		
		nuevoCoche1.repostarCombustible(26, 1.850); // Repostaje 1 datos introducidos.
		
		nuevoCoche1.mostrarInformacion();
		
		System.out.println("*************");
		
		//Variables para la persona introducida por el usuario;
		String nombre, genero2;
		int edad2;
				
		//Variables para el coche introducido por el usuario;
		String matricula, marca, modelo;
		double capacidad, consumo;
		
		
		
		Scanner sc = new Scanner (System.in); // Creamos la clase scanner para la entrada de datos del usuario.
		
		//Entrada de datos por parte del usuario en consola.
		System.out.println();
		System.out.println("******NUEVO VEHÍCULO*******");		
		System.out.println("Escribe el  nombre del titular del coche: ");
		nombre = sc.next();
		System.out.println("Introduce la edad: ");
		edad2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce el género (Hombre/Mujer): ");
		genero2 = sc.next();
		
		//Creamos el objeto persona
		Persona objPersona2 = new Persona(nombre, edad2, genero2);
		
		objPersona2.imprimirPersona(); //Imprimimos por pantalla los datos de la persona introducida por el usuario.
		
		System.out.println("**** ENTRADA DATOS DEL NUEVO VEHÍCULO **** \n");
		System.out.println("Introduce la matrícula del coche: ");
		matricula = sc.next();
		System.out.println("Introduce la marca del vehículo");
		marca = sc.next();
		System.out.println("Introduce el modelo del coche");
		modelo = sc.next();
		System.out.println("Introduce la capacidad del deposito: ");
		capacidad = sc.nextDouble();
		System.out.println("Introduce el consumo del coche en L/100km");
		consumo = sc.nextDouble();
		System.out.println("Vamos a ir de viaje. Introduce los km del viaje: ");
		double km2 = sc.nextDouble();
		
		//Creamos el objeto coche2.
		Coche objCoche2 = new Coche (matricula, marca, modelo, objPersona2.getnombre(), capacidad, consumo);
		
		
		objCoche2.realizarViaje(km2); // Llamamos al método para realizar el viaje.
		
		System.out.println("Vamos a repostar, ¿cuántos Litros?");
		int litros = sc.nextInt();
		System.out.println("¿A qué precio esta el litro?");
		double precio = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		
		objCoche2.repostarCombustible(litros, precio); // Llamamos al método para el repostaje del vehículo 2.
		
		System.out.println("**********VEHÍCULO***********");
		System.out.println();
		
		objCoche2.mostrarInformacion(); // Imprimimos por pantalla los datos del vehículo.
		
		sc.close(); //Cerramos la clase Scanner;
	}
		
}