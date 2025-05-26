import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		HashMap<String, Estudiante> estudiantes = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String opcion;

		do {
			System.out.println("\nMenú de Opciones:");
			System.out.println("a) Crear estudiante");
			System.out.println("b) Introducir nota a un estudiante");
			System.out.println("c) Ordenar notas de un estudiante");
			System.out.println("d) Mostrar notas de un estudiante");
			System.out.println("e) Mostrar resumen de estudiantes");
			System.out.println("f) Calcular media de la clase");
			System.out.println("g) Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextLine().toLowerCase();

			switch (opcion) {
			case "a":
				System.out.print("Introduce DNI: ");
				String dni = sc.nextLine();
				
				if (estudiantes.containsKey(dni)) {
					System.out.println("Error: El estudiante ya existe.");
					continue;
				}
				
				System.out.print("Introduce nombre: ");
				String nombre = sc.nextLine();
				estudiantes.put(dni, new Estudiante(dni, nombre));
				System.out.println("Estudiante creado correctamente.");
				
				break;
			case "b":
				System.out.print("Introduce DNI del estudiante: ");
				dni = sc.nextLine();
				Estudiante est = estudiantes.get(dni);
				
				if (est == null) {
					System.out.println("Error: Estudiante no encontrado.");
					continue;
				}

				System.out.print("¿Desea introducir nota de examen (e) o de tarea (t)? ");
				String tipo = sc.nextLine().toLowerCase();
				System.out.print("Introduce la nota (0 - 10): ");
				double nota = Double.parseDouble(sc.nextLine());

				if (nota < 0 || nota > 10) {
					System.out.println("Error: La nota debe estar entre 0 y 10.");
					continue;
				}

				if (tipo.equals("e")) {
					est.añadirNotaExamen(nota);
					System.out.println("Nota de examen añadida.");
				} else if (tipo.equals("t")) {
					est.añadirNotaTarea(nota);
					System.out.println("Nota de tarea añadida.");
				} else {
					System.out.println("Opción no válida.");
				}
				break;
			case "c":
				System.out.print("Introduce DNI del estudiante: ");
				dni = sc.nextLine();
				est = estudiantes.get(dni);
				if (est == null) {
					System.out.println("Error: Estudiante no encontrado.");
					continue;
				}
				
				System.out.print("¿Ordenar notas de examen (e) o de tarea (t)? ");
				String tipoNota = sc.nextLine().toLowerCase();
				System.out.print("¿Orden ascendente (a) o descendente (d)? ");
				String orden = sc.nextLine().toLowerCase();

				boolean ascendente = orden.equals("a");

				if (tipoNota.equals("e")) {
					est.ordenarNotasExamen(ascendente);
					System.out.println("Notas de examen ordenadas.");
				} else if (tipoNota.equals("t")) {
					est.ordenarNotasTarea(ascendente);
					System.out.println("Notas de tarea ordenadas.");
				} else {
					System.out.println("Opción no válida.");
				}
				break;
			case "d":
				System.out.print("Introduce DNI del estudiante: ");
				dni = sc.nextLine();
				est = estudiantes.get(dni);
				if (est == null) {
					System.out.println("Error: Estudiante no encontrado.");
					continue;
				}

				est.mostrarNotas();
				break;
			case "e":
				if (estudiantes.isEmpty()) {
					System.out.println("No hay estudiantes registrados.");
					continue;
				}

				for (Estudiante e : estudiantes.values()) {
					System.out.println(e);
				}
				break;
			case "f":
				if (estudiantes.isEmpty()) {
					System.out.println("No hay estudiantes registrados.");
					continue;
				}

				double sumaFinal = 0;
				for (Estudiante e : estudiantes.values()) {
					sumaFinal += e.calcularNotaMedia();
				}
				double mediaClase = sumaFinal / estudiantes.size();
				System.out.println("La media de la clase es: " + String.format("%.2f", mediaClase));

				break;
			case "g":
				System.out.println("Saliendo del programa.");
				break;
			default:
				System.out.println("Opción no válida. Intente de nuevo.");
				break;
			}
		} while (!opcion.equals("g"));

		sc.close();
	}
}
