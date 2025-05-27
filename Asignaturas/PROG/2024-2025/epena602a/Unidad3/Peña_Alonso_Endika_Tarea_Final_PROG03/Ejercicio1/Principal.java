package Ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// generamos el primer coche
		Principal.coche1();
		Principal.coche2();
		
		// El programa en si tiene un pqueño problema ya que el coche podría viajar más de lo que permitiría su combustible.
	}

	public static void coche1() {
		Persona persona = new Persona("Endika", 32, "Hombre");
		Coche coche = new Coche("KIA", "XCeed", "6687HHB", persona, 50, 6.4);

		System.out.println("======== COCHE 1 Sin estrenar KM0 ========");
		coche.mostrarInformacion();

		System.out.println("======== COCHE 1 Realizamos viaje ========");
		coche.realizarViaje(87);
		coche.mostrarInformacion();

		System.out.println("======== COCHE 1 Realizamos otro viaje ========");
		coche.realizarViaje(238);
		coche.mostrarInformacion();

		System.out.println("======== COCHE 1 respostar ========");
		coche.respostarCombustible(20, 1.513);
		coche.mostrarInformacion();

		System.out.println("======== COCHE 1 Realizamos otro viaje ========");
		coche.realizarViaje(738);
		coche.mostrarInformacion();

		System.out.println("======== COCHE 1 volvemos a repostar ========");
		coche.respostarCombustible(20, 1.513);
		coche.mostrarInformacion();
	}

	public static void coche2() {
		// Entrada de datos desde la consola para un segundo coche
		Scanner scPersona = new Scanner(System.in);
		Scanner scCoche = new Scanner(System.in);

		System.out.println("Introduzca su datos");
		System.out.print("Nombre: ");
		String nombre = scPersona.nextLine(); // Leemos el valor de nombre

		System.out.print("Genero: ");
		String genero = scPersona.nextLine(); // Leemos el valor de genero

		System.out.print("Edad: ");
		int edad = scPersona.nextInt(); // Leemos el valor de edad

		System.out.println("Introduzca los datos de su vehículo: ");
		System.out.println("Marca de coche: ");
		String marca = scCoche.nextLine(); // Leemos el valor de la marca
		
		System.out.println("Modelo: ");
		String modelo = scCoche.nextLine(); // Leemos el valor del modelo

		System.out.println("Matrícula: ");
		String matricula = scCoche.nextLine(); // Leemos el valor de la matricula

		Persona persona = new Persona(nombre, edad, genero);
		Coche coche = new Coche(marca, modelo, matricula, persona, 60, 3.4);

		System.out.println("======== COCHE 2 Sin estrenar KM0 ========");
		coche.mostrarInformacion();

		System.out.println("======== COCHE 2 Realizamos viaje ========");
		coche.realizarViaje(87);
		coche.mostrarInformacion();

		System.out.println("======== COCHE 2 Realizamos otro viaje ========");
		coche.realizarViaje(738);
		coche.mostrarInformacion();

		System.out.println("======== COCHE 2 respostar ========");
		coche.respostarCombustible(20, 1.513);
		coche.mostrarInformacion();
	}

}
