package videojuegos;

import java.util.*;
import java.sql.*;

public class Principal {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		String titulo, plataforma, compania;
		int horas_jugadas = 0, anio_lanzamiento;
		VideojuegosDAO dao = new VideojuegosDAO();
		
		while (continuar) {
			int opcion_user = menu();
			if (opcion_user != 0) {
				switch (opcion_user) {
				
				// INSERTAR VIDEOJUEGO NUEVO
				case 1:
					System.out.println("INSETAR VIDEOJUEGO: ");
					System.out.print("Titulo: ");
					titulo = sc.nextLine();
					System.out.print("Plataforma: ");
					plataforma = sc.nextLine();
					System.out.print("Año de Lanzamiento: ");
					anio_lanzamiento = sc.nextInt();
					sc.nextLine();
					System.out.print("Compañia: ");
					compania = sc.nextLine();
					dao.InsertarVideojuego(new Videojuegos(titulo, plataforma, anio_lanzamiento, compania, horas_jugadas));
					
					break;
				
				// ACTUALIZAR HORAS JUGADAS
				case 2:
					System.out.println("ACTUALIZAR HORAS JUGADAS: ");
					System.out.print("Introduce Titulo: ");
					titulo = sc.nextLine();
					System.out.print("Introduce horas jugadas: ");
					horas_jugadas = sc.nextInt();
					sc.nextLine();
					dao.actualizarHorasJugadas(titulo, horas_jugadas);
					break;
					
				// ELIMINAR VIDEOJUEGO DE LA TABLA
				case 3:
					System.out.println("ELIMINAR VIDEOJUEGO: ");
					System.out.println("Introduce el título: ");
					titulo = sc.nextLine();
					dao.eliminarJuego(titulo);
					break;
				
				// LISTAR TODOS LOS VIDEOJUEGOS
				case 4:
					List<Videojuegos> videojuegos = dao.listarTodosLosJuegos();
					for (Videojuegos a : videojuegos)
						System.out.println(a);
					break;
					
				// LISTAR POR PLATAFORMA
				case 5:
					System.out.println("Introduce la Plataforma: ");
					plataforma = sc.nextLine();
					List<Videojuegos> videojuegos2 = dao.listarPorPlataforma(plataforma);
					for (Videojuegos b : videojuegos2)
						System.out.println(b);
					
					break;
					
				case 6:
					System.out.println("Gracias por usar la App para gestión de videojuegos");
					continuar = false;
					break;
					
				default:
					System.out.println("Inserte una opción válida");
				}
			} else {
				continuar = true;
			}
		}
	}
	
	
	// PARA CREAR EL MENÚ
	
	public static int menu() {
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		try {
				System.out.println("----- MENÚ ----- \n Selecciona una opción:");
				System.out.println("1. Insertar Juego");
				System.out.println("2. Actualizar horas de juego");
				System.out.println("3. Eliminar juego");
				System.out.println("4. Lista de todos los juegos");
				System.out.println("5. Lista por plataforma");
				System.out.println("6. Salir");
				System.out.print("Opción: ");
				opcion = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Ingresa una opción válida");
		}
		return opcion;
	}

}
