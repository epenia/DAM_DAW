package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaramos la forma de entrada de datos con el usuario

		String numeros = "";

		for (int i = 0; i < 8; i++) {
			int numero = Ejercicio1.recuperarNumero();
			numeros += numero;
		}

		int numeroPar = 0;
		int numeroImpar = 0;

		for (int i = 0; i < numeros.length(); i++) {
			// Comprobamos si el numero es par
			if (Ejercicio1.esPar(numeros.charAt(i))) {
				System.out.println("El numero es par: " + numeros.charAt(i));

				// si el numero par es mayor del que tenemos guardado en la variable numeroPar
				// lo guardamos si no pasamos de el.
				if (numeroPar < numeros.charAt(i)) {
					numeroPar = numeros.charAt(i);
				}

				// En caso de ser par hacemos que continue por la siguiente iteración del bucle
				continue;
			}

			// Si no es par
			// Comprobamos si el numero inpar es mayor del que tenemos guardado en la
			// variable numeroInpar lo guardamos si no pasamos de el.
			if (numeroImpar < numeros.charAt(i)) {
				numeroImpar = numeros.charAt(i);
			}
			System.out.println("El numero es inpar: " + numeros.charAt(i));
		}

		// Si existe algun numero par siempre será mayor a 0 y lo mostramos
		// En caso contrario pintamos que no hay numeros pares
		if (numeroPar != 0) {
			System.out.println("El número par más alto es:" + numeroPar);
		} else {
			System.out.println("No se han introducido numero pares");
		}

		// Si existe algun numero impar siempre será mayor a 0 y lo mostramos
		// En caso contrario pintamos que no hay impares
		if (numeroImpar != 0) {
			System.out.println("El número inpar más alto es:" + numeroImpar);
		} else {
			System.out.println("No se han introducido numeros inpares");
		}

	}

	public static int recuperarNumero() {

		// Establecemos un bucle infinito el cual solamente se sale si el usuario
		// introduce un número mayor de 0
		while (true) {
			Scanner datos = new Scanner(System.in);
			System.out.println("Introduce un número: ");

			try {
				int numero = datos.nextInt();
				if (numero > 0) {
					return numero;
				}

				System.out.println("!!!!!!! El número debe ser mayor de 0 !!!!!!!!");
			} catch (Exception e) {
				System.out.println("!!!!!!! Debe introducir un número !!!!!!!!");
			}
		}
	}

	public static boolean esPar(int numero) {
		// Comprobamos con el resto si el número es o no par
		return numero % 2 == 0;
	}

}
