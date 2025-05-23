package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	private static ArrayList<Juego> Juegos = new ArrayList();
	private static Scanner input = new Scanner(System.in);

	private static void menu() {
		System.out.println("-----------Menú------------");
		System.out.println("1) Crear juego");
		System.out.println("2) Nuevo personaje");
		System.out.println("3) Jugar");
		System.out.println("4) Ver juegos disponibles");
		System.out.println("5) Salir");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Principal.menu();
			String option = input.next().toLowerCase();
			switch (option) {
			case "1":
				System.out.println("Creando juego");
				Principal.addJuego();
				break;
			case "2":
				System.out.println("Creando Personaje");
				Principal.addPersonaje();
				break;
			case "3":
				System.out.println("Jugar");
				Principal.jugar();
				break;
			case "4":
				System.out.println("Visualizando juegos");
				Principal.listarJuegos();
				break;
			case "5":
				System.out.println("Saliendo del juego");
				return;
			default:
				System.out.println("Opción no valida");
				break;
			}
			;
		}
	}

	private static void addJuego() {
		System.out.println("Introduzca nombre del juego:");
		String nombre = input.next();
		input.nextLine();
		System.out.println("Introduzca el año del juego:");
		int anio = input.nextInt();

		Juego NuevoJuego = new Juego(nombre, anio);
		if (Juegos.isEmpty()) {
			Juegos.addFirst(NuevoJuego);
			return;
		}
		Juegos.add(NuevoJuego);
	}

	private static void addPersonaje() {
		if (Juegos.isEmpty()) {
			System.out.println("No hay juegos a los que añadir personaje");
			return;
		}	
		Juego juego = null;
		while (true) {
			System.out.println("Introduzca el ID juego al que desea añadir el personaje: ");
			Principal.listarJuegos();
			int idJuego = input.nextInt();
			
			if (idJuego == -1) {
				System.out.println("Saliendo de añadir personaje");
				return;
			}

			juego = Principal.buscarJuego(idJuego);

			if (juego == null) {
				System.out.println("El juego no existe por favor vuelve a intentarlo");
				System.out.println("Intenta poner un ID de juego existente");
				System.out.println("Puedes poner -1 para salir");
				continue;
			}	
			break;
		}

		System.out.println("Introduzca nombre del personaje:");
		String nombre = input.next();
		System.out.println("Introduzca la habilidad del personaje (numero entero): " + nombre);
		int habilidad = input.nextInt();
		System.out.println("Introduzca la fuerza del personaje (numero entero): " + nombre);
		int fuerza = input.nextInt();
		
		Personaje NuevoPersonaje = new Personaje(nombre, habilidad, fuerza);
		System.out.println("El personaje: " + nombre + " ha sido añadido al juego: " + juego.getNombre());
		juego.addPersonaje(NuevoPersonaje);

	}

	private static Juego buscarJuego(int id) {
		try {
		for (int i = 0; i < Juegos.size(); i++) {
			Juego juego = Juegos.get(i);
			if (juego.getId() == id) {
				return juego;
			}
		}
		return null;
		} catch (Exception e) {
			return null;
		}
		
	}

	private static void listarJuegos() {
		for (int i = 0; i < Juegos.size(); i++) {
			System.out.println(Juegos.get(i).toString());
		}
	}
	
	private static void listarPersonajes(Juego juego) {
		for (int i = 0; i < juego.getPersonajes().size(); i++) {
			System.out.println(juego.getPersonajes().get(i).toString());
		}
	}
	

	private static void jugar() {
		if (Juegos.isEmpty()) {
			System.out.println("No hay juegos para jugar");
			return;
		}		
		
		Juego juego = null;
		while (true) {
			System.out.println("Introduzca el ID juego al que desea jugar (-1 para salir de jugar):");
			Principal.listarJuegos();
			int idJuego = input.nextInt();
			
			if (idJuego == -1) {
				System.out.println("Saliendo de añadir personaje");
				return;
			}

			juego = Principal.buscarJuego(idJuego);

			if (juego == null) {
				System.out.println("El juego no existe por favor vuelve a intentarlo");
				continue;
			}	
			break;
		}
		

		if (juego.getPersonajes().size() < 2) {
			System.out.println("El juego debe tener por lo menos 2 personajes para poder jugar");
			return;
		}		
		
		Personaje personaje1 = null;
		while (true) {
			Principal.listarPersonajes(juego);
			System.out.println("Jugador 1: Introduzca el ID del personaje que desea seleccionar");
			int idPersonaje = input.nextInt();
			personaje1 = juego.buscarPersonaje(idPersonaje);
			
			if (personaje1 == null) {
				System.out.println("Jugador 1: El personaje elegido no existe");
				continue;
			}
			break;
		}	

		
		Personaje personaje2 = null;
		while (true) {
			Principal.listarPersonajes(juego);
			System.out.println("Jugador 2: Introduzca el ID del personaje que desea seleccionar");
			int idPersonaje = input.nextInt();
			personaje2 = juego.buscarPersonaje(idPersonaje);
			
			if (personaje2 == null) {
				System.out.println("Jugador 2: El personaje elegido no existe");
				continue;
			}
			break;
		}
		
		int IDGanador = juego.Jugar(personaje1.getId(), personaje2.getId());
		
		if (IDGanador == -1) {
			System.out.println("El resultado es un empate");
			return;
		}		

		System.out.println("Ha ganado el jugador " + IDGanador);
		
	}

}
