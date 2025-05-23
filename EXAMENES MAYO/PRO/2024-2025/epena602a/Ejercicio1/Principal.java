package Ejercicio1;

import java.util.Scanner;

public class Principal {

	private static String[] Letras = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "a", "b", "c", "d", "e", "f",
			"g", "h", "i", "j" };
	private static int[] Numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private static String[] Simbolos = { "@", "-", "_", "&", "%", "/", "=", "?", "¿", "ç" };
	private static Scanner input = new Scanner(System.in);

	private static void menu() {
		System.out.println("Introduzca la opción que desea");
		System.out.println("==============================");
		System.out.println("1) Imprimir el contenido de los arrays");
		System.out.println("2) Generar una contraseña sencilla");
		System.out.println("3) Generar contraseña compleja");
		System.out.println("4) Salir");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			Principal.menu();
			String option = input.next().toLowerCase();

			switch (option) {
			case "1":
				Principal.mostrarArrays();
				break;
			case "2":
				Principal.generarSimple();
				break;
			case "3":
				Principal.generarComplejo();
				break;
			case "4":
				System.out.println("Saliendo del programa");
				return;
			default:
				System.out.println("Opción no valida");
				break;
			}
			;
		}

	}

	private static void mostrarArrays() {
		System.out.println("Mostrando arrays por pantalla");

		String mostrarLetras = "";
		for (int i = 0; i < Letras.length; i++) {
			if (Letras.length - 1 == i) {
				mostrarLetras += Letras[i] + ".";
				continue;
			}
			mostrarLetras += Letras[i] + ", ";
		}

		String mostrarNumeros = "";
		for (int i = 0; i < Numeros.length; i++) {
			if (Numeros.length - 1 == i) {
				mostrarNumeros += Numeros[i] + ".";
				continue;
			}
			mostrarNumeros += Numeros[i] + ", ";
		}

		String mostrarSimbolos = "";
		for (int i = 0; i < Simbolos.length; i++) {
			if (Simbolos.length - 1 == i) {
				mostrarSimbolos += Simbolos[i] + ".";
				continue;
			}
			mostrarSimbolos += Simbolos[i] + ", ";
		}

		System.out.println("Letras:");
		System.out.println(mostrarLetras);

		System.out.println("Números:");
		System.out.println(mostrarNumeros);

		System.out.println("Caracteres especiales:");
		System.out.println(mostrarSimbolos);
	}

	private static void generarSimple() {
		System.out.println("Generando contraseña simple");
		String password = "";

		for (int i = 0; i < 8; i++) {
			if (i % 2 != 0) {

				double numero = Math.ceil((Math.random() % Letras.length) * 10);
				int miNumero = (int) numero;
				if (miNumero >= Letras.length)
					miNumero = Letras.length - 1;
				password += Letras[miNumero];
			} else {
				double numero = Math.ceil((Math.random() % Numeros.length) * 10);
				int miNumero = (int) numero;
				if (miNumero >= Numeros.length)
					miNumero = Numeros.length - 1;
				password += Numeros[miNumero];
			}
		}

		System.out.println("Password sencillo:");
		System.out.println(password);
	}

	private static void generarComplejo() {
		System.out.println("Generando contraseña compleja");
		String password = "";

		int numLetras = 5;
		int numSimbolos = 2;
		int numNumeros = 3;

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				double numero = Math.ceil((Math.random() % Simbolos.length) * 10);
				int miNumero = (int) numero;
				if (miNumero >= Simbolos.length)
					miNumero = Simbolos.length - 1;
				password += Simbolos[miNumero];
				numSimbolos--;
			} else {
				if (numLetras > numNumeros) {
					double numero = Math.ceil((Math.random() % Letras.length) * 10);
					int miNumero = (int) numero;
					if (miNumero >= Letras.length)
						miNumero = Letras.length - 1;
					password += Letras[miNumero];
					numLetras--;
				} else if (numNumeros > numSimbolos) {
					double numero = Math.ceil((Math.random() % Numeros.length) * 10);
					int miNumero = (int) numero;
					if (miNumero >= Numeros.length)
						miNumero = Numeros.length - 1;
					password += Numeros[miNumero];
					numNumeros--;
				} else if (numSimbolos > 0) {
					double numero = Math.ceil((Math.random() % Simbolos.length) * 10);
					int miNumero = (int) numero;
					if (miNumero >= Simbolos.length)
						miNumero = Simbolos.length - 1;
					password += Simbolos[miNumero];
					numSimbolos--;
				} else {
					if (i % 2 != 0) {
						double numero = Math.ceil((Math.random() % Letras.length) * 10);
						int miNumero = (int) numero;
						if (miNumero >= Letras.length)
							miNumero = Letras.length - 1;
						password += Letras[miNumero];
						numLetras--;
					} else {
						double numero = Math.ceil((Math.random() % Simbolos.length) * 10);
						int miNumero = (int) numero;
						if (miNumero >= Simbolos.length)
							miNumero = Simbolos.length - 1;
						password += Simbolos[miNumero];
						numSimbolos--;
					}
				}
			}

		}

		System.out.println("Password complejo:");
		System.out.println(password);
	}

}
