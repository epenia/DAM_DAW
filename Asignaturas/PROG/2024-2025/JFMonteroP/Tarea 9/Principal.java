package tarea09;

import java.util.*;
import java.io.*;

public class Principal {
	
	
		static Scanner sc = new Scanner(System.in);
		
		static ArrayList<String> canciones = new ArrayList<>();
		
		static String ruta = ("src/tarea09/canciones.txt");
		
	
		
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean opcion = true;
		
		while (opcion) {
			
			try {
				
				System.out.println("\n \n ---MENU---");
				System.out.println("1. Leer Fichero");
				System.out.println("2. Añadir Cación");
				System.out.println("3. Eliminar Canción");
				System.out.println("4. Desordenar Canciones");
				System.out.println("5. Mostrar Canciones");
				System.out.println("6. Escribir Fichero");
				System.out.println("7. Salir");
				System.out.print("Selecciona una opción: ");
				
				int menuopcion = sc.nextInt();
				
				switch (menuopcion) {
				
				case 1:
					leerArchivo(ruta);
					break;
				case 2:
					anadirCancion();
					break;
				case 3:
					eliminarCancion();
					break;
				case 4:
					desordenar();
					break;
				case 5:
					mostrarCanciones();
					break;
				case 6:
					escribirFichero(ruta);
					break;
				case 7:
					System.out.println("\n **Gracias por usar el programa**");
					opcion = false;
					break;
				default: {
					System.out.println("Elige una opción válida");
					break;
				}
					
				}
	
			
			}
			
			catch (Exception e) {
				System.out.println("Selecciona una opción correcta");
			}
			
			sc.nextLine();
		

		}
	}

	public static void leerArchivo(String ruta) throws IOException {
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(ruta);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(fr);
		String linea;
		while ((linea = br.readLine()) != null) {
			canciones.add(linea);
		}
		System.out.println("\n ** Fichero leído correctamente **");
		
	}//Leer Archivo
	
	
	
	public static void anadirCancion() {
		System.out.println("\n Ingresa el título de la cancion y el autor: ");
		sc.nextLine();
		String cancion = sc.nextLine();
		canciones.add(cancion);
		System.out.println("\n Canción añadida correctamente;");
	} //Añadir cancion
	
	
	public static void eliminarCancion () {
		System.out.println("¿Qué canción quieres eliminar? elige por número de posición");
		mostrarCanciones();
		int eliminar = sc.nextInt();
		eliminar = eliminar - 1;
		canciones.remove(eliminar);
	}// Eliminar cancion.
	
	public static void desordenar() {
		Collections.shuffle(canciones);
		System.out.println("Caciones desordenaddas");
		mostrarCanciones();
	}//Desordenar canciones
	
	public static void mostrarCanciones() {
		if (canciones.isEmpty()) {
			System.out.println("La lista de canciones está vacia");
		}
		else {
			for (int i = 0; i<canciones.size(); i++) {
				System.out.println( (i+1) + "." + canciones.get(i));
			}
		}
		
	} //Mostrar canciones
	
	public static void escribirFichero(String ruta) {
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
	        for (String cancion : canciones) {
	            bw.write(cancion);
	            bw.newLine();
	        }
	        System.out.println("Fichero guardado correctamente.");
	    } catch (IOException e) {
	        System.out.println("Error al escribir el fichero: " + e.getMessage());
	    }
	}//escribir fichero.
	
	
}


		




