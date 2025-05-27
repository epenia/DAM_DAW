package programa_clase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class principal {
	final static String filePath = "src/programa_clase/frases.txt";

	private static ArrayList<String> frases = new ArrayList<String>();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1: Leer frases del fichero");
		System.out.println("2: Añadir una nueva frase");
		System.out.println("3: Eliminar una frase existente");
		System.out.println("4: Mostrar una frase aleatoria");
		System.out.println("5: Mostrar todas las frases almacenadas");
		System.out.println("6: Guardar todas las frases en el fichero");
		System.out.println("");
		System.out.println("7: Salir del programa");

		String menuOption = input.nextLine().toLowerCase();

		do {

			switch (menuOption) {
			case "1":
				leerFichero();
				break;
				
			case "2":
				agregarFrase();
				break;
				
			case "3":
				eliminarFrase();
				break;
				
			case "4"://					
				mostrarFraseAleatoria();
				break;
				
			case "5"://					
				mostrarFraseAleatoria();
				break;
				
			case "6":
//					
				guardarFrasesEnFichero();
				break;
				
			case "7":
				System.out.println("Saliendo del programa");
				break;
				
			default:
				System.out.println("Opción de menú no encontrada");
				break;
			}

		} while (!menuOption.equals("7"));

	}

	private static void leerFichero() {
		if (frases.size() > 0) {
			System.out.println("Ya existen frases previamente quiere continuar cargandola?");
			System.out.print("(si,no): ");
			String recargarFichero = input.nextLine().toLowerCase();

			if (!recargarFichero.equals("si")) {
				return;
			}
		}

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				frases.add(linea); // Añade las frases al ArrayList
			}
			System.out.println("Las frases han sido cargadas");

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado: " + e.toString());
		} catch (IOException e) {
			System.out.println("Error de entrada/salida: " + e.toString());
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}

	private static void agregarFrase() {
		System.out.print("Introduce una frase: ");
		String frase = input.nextLine();

		do {
			if (frase.length() <= 0) {
				System.out.println("La frase nueva no puede estar vacia");
				continue;
			}

			frases.add(frase);
		} while (frase.length() <= 0);

	}

	private static void eliminarFrase() {
		if (frases.size() <= 0) {
			System.out.println("No se han encontrado frases");
			return;
		}

		mostrarTodasFrases();

		System.out.print("Seleccione la frase que quiere eliminar");

		int eliminarFrase = input.nextInt();

		if (eliminarFrase == 0) {
			System.out.println("Cancelando la operación");
			return;
		}
		
		frases.remove(eliminarFrase-1);

	}

	private static void mostrarFraseAleatoria() {
		if (frases.size() <= 0) {
			System.out.println("No se han encontrado frases");
			return;
		}
		
		int frase = (int)Math.random()*frases.size();

		System.out.println("Mostrando frase "+ frases.get(frase));
		
	}

	private static void mostrarTodasFrases() {

		if (frases.size() <= 0) {
			System.out.println("No se han encontrado frases");
			return;
		}

		System.out.println("Listado de frases");
		System.out.println("");

		for (int i = 0; i <= frases.size(); i++) {
			System.out.println((i + 1) + ": " + frases.get(i));
		}

	}

	private static void guardarFrasesEnFichero() {
		FileWriter fichero = null;
		BufferedWriter pw = null;
		// PrintWriter pw2 = null;
		try {
			fichero = new FileWriter(filePath, false); // true para añadir al final, false para sobrescribir
			pw = new BufferedWriter(fichero);

			for (int i = 0; i <= frases.size(); i++) {
				pw.write(frases.get(i));
				pw.newLine(); // Añade un salto de línea
				pw.flush();
			}

			System.out.println("Frases almacenadas");

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado: " + e.toString());

		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				if (pw != null)
					pw.close();
				if (fichero != null)
					fichero.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

	}

}
