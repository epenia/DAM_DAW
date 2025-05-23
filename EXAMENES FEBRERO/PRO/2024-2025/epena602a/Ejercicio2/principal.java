package Ejercicio2;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Inicialiamos las series
		Serie Serie1 = new Serie("Walking death", 8, 2008);
		Serie Serie2 = new Serie("Mandalorian", 3, 2015);
		
		// Mostramos el número de series creadas
		System.out.println("Cantidad total de series: " + Serie.serieId);
		
		//Ejecutamos el menú interactivo		
		principal.menu(Serie1, Serie2);
	}
	
	public static void menu(Serie Serie1, Serie Serie2) {
		boolean finalizar = false;
		do {

			Scanner scanner = new Scanner(System.in);	
			System.out.println("Opciones disponibles: ");
			System.out.println("");
			System.out.println("1 - Añadir episodio");
			System.out.println("2 - Ver serie");
			System.out.println("3 - Mostrar duración de la serie");
			System.out.println("4 - Imprimir series");
			System.out.println("");
			System.out.println("");
			System.out.println("5 - Salir del programa");

			System.out.println("Elige la acción a realizar:");
			String accion = scanner.next();
			
			Serie serieElegida = null;
			
			switch (accion) {
				case "1":
					serieElegida = principal.elegirSerie(Serie1, Serie2);	
					
					if (serieElegida.tengoEpisodios()) {
						System.out.println("La serie ya tiene episodio y no se pueden añadir más");
						continue;
					}				
					
					Episodio episodio = principal.crearEpisodio();
					serieElegida.setEpisodio(episodio);
					System.out.println("El episodio a sido añadido a la serie");
					System.out.println("");

					break;
				case "2":
					serieElegida = principal.elegirSerie(Serie1, Serie2);				
					serieElegida.verSerie();			
					System.out.println("");
					
					break;
				case "3":
					serieElegida = principal.elegirSerie(Serie1, Serie2);						
					System.out.println("");			
					System.out.println(serieElegida.duracionSerie());					
					System.out.println("");
					break;
				case "4":
					System.out.println(Serie1.toString());
					System.out.println(Serie2.toString());
					System.out.println("");
					break;
				case "5":
					finalizar = true;
					System.out.println("Finalizando el programa");
					System.out.println("");
					break;
				default:
					System.out.println("La opción elegida no existe vuelva a intentarlo");
					System.out.println("");
					continue;
			}
			
		} while (!finalizar);
		
	}
	
	public static Serie elegirSerie(Serie serie1, Serie serie2) {

		Scanner scanner = new Scanner(System.in);	
		String accion = "";
		do {
			System.out.println("Elegir serie: ");
			System.out.println("");
			System.out.println("1 - " + serie1.toString());
			System.out.println("2 - " + serie2.toString());
			System.out.println("");
			
			accion = scanner.next();
			
			if (!accion.equals("1") && !accion.equals("2")) {
				System.out.println("No existe la serie elegida");
			}
		} while(!accion.equals("1") && !accion.equals("2"));
		
		
		return accion.equals("1") ? serie1 : serie2;
	}
	
	public static Episodio crearEpisodio() {
		Scanner scanner = new Scanner(System.in);	
		String titulo = "";
		int duracion = 0;
		boolean repetir = true;
		do {
			System.out.println("Creando episodio: ");
			System.out.println("");
			System.out.println("Titulo: " );
			System.out.println("");
			titulo = scanner.next();
			System.out.println("");
			System.out.println("Duracion: ");
			System.out.println("");
			duracion = scanner.nextInt();
			
			
			if (duracion <= 0) {
				System.out.println("La duración debe ser mayor a 0");
			}

			if (titulo.length() <= 0) {
				System.out.println("Debe escribir algo en el titulo");
			}
			
			if (duracion > 0 && titulo.length() > 0) {
				repetir = false;
			}
		} while (repetir);
		
		Episodio episodio = new Episodio(titulo, duracion);
		return episodio;
	}

}
