package tarea08;

import java.util.*;

public class Principal {
	

	public static void main(String[] args) {
		
		/*
		 * Variables locales.
		 */
		
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		HashMap<String, Estudiante> estudiantes = new HashMap<>(); 

		
		//-------------------------------------------------------
		
		
		/*
		 * Inicio del programa (MENU)
		 */
		
		
		while (continuar) {
			
			try {
				System.out.print("\n Elige una opción: \n 1. Crear estudiante. \n 2. Introducir nota a estudiante" + "\n 3. Ordenar notas estudiante" +
						"\n 4. Mostrar resumen estudiante \n 5. Mostrar resumen de estudiantes \n 6. Calcular media de la clase \n 7. Salir" +
						"\n Opción seleccionada : ");
							int eleccion = sc.nextInt();
				switch (eleccion) {
				
				/*
				* Ingresar estudiante ----------------------------------
				*/
					case 1:
						sc.nextLine(); // Limpiamos Buffer.
						
						System.out.println("Inserta el dni del Estudiante");
						String dni = sc.nextLine();
						System.out.println("Ingrese el nombre del Estudiante");
						String nombre = sc.nextLine();
						if (estudiantes.containsKey(dni)) {
							System.out.println("Ese estudiantes ya está registrado");
						}
						else {
							estudiantes.put(dni, new Estudiante(dni, nombre));
							System.out.println("Estudiante creado con éxito \n ");
						}
						
						break;

					/*
					 * Opción para introducir notas al estudiante. ------------------
					 */
						
						
					case 2: 
						
						sc.nextLine();  //Limpiamos Buffer
						
						System.out.println("Inserta el dni del estudiante: ");
						dni = sc.nextLine();
						
						if (!estudiantes.containsKey(dni)) {
							System.out.println("El estudiante no existe");
							break;
						}
		
						else {
							System.out.println("¿Qué quiere insertar? \n 1. Nota Examen. \n 2. Nota Tarea");
							int opcion = sc.nextInt();

							if (opcion == 1) {
								System.out.println("Ingresa la nota: ");
								double nota = sc.nextDouble();
								estudiantes.get(dni).anadirNotaExamen(nota);
							}
							else if (opcion == 2) {
								System.out.println("Ingresa la nota: ");
								double nota = sc.nextDouble();
								estudiantes.get(dni).anadirNotaTarea(nota);
							}
							else System.out.println("Opción no válida");

						}							
							
						break;						
						
					/*
					 * Ordenar las notas de los estudiantes.
					 */
						
					case 3:
						sc.nextLine();
						System.out.println("Inserta el dni del estudiante: ");
						dni = sc.nextLine();
						
						if (!estudiantes.containsKey(dni)) System.out.println("El estudiante no existe");
						
						else {
							System.out.println("¿Qué quieres ordenar? \n 1. notas examen \n 2. notas tareas");
							int opcion2 = sc.nextInt();
							sc.nextLine();
							System.out.println("¿Con orden (A)scendente o (D)escendente?");
							String orden = sc.nextLine();
							switch (opcion2) {
							case 1:
								if (orden.equalsIgnoreCase("A")) {
									estudiantes.get(dni).ordenarNotasExamen(true);
								}
								else if (orden.equalsIgnoreCase("D")) {
									estudiantes.get(dni).ordenarNotasExamen(false);
								}
								break;
							case 2:
								if (orden.equalsIgnoreCase("A")) {
									estudiantes.get(dni).ordenarNotasTarea(true);
								}
								else if (orden.equalsIgnoreCase("D")) {
									estudiantes.get(dni).ordenarNotasTarea(false);
								}
								
								break;
								
							default: 
								System.out.println("Opción no válida");
								break;
							}
							
						}
						
						break;
					/*
					 * Para imprimir datos por pantalla, resumen. --------------------------------------------------
					 */
						
					case 4: 
						sc.nextLine(); //Limpiar buffer.
						
						System.out.println("Inserta el dni del estudiante: ");
						dni = sc.nextLine();
						
						if (!estudiantes.containsKey(dni)) System.out.println("El estudiante no existe");
						
						else {
							System.out.println(estudiantes.get(dni).toString());
							
						}
						break;
					
					/*
					 * Para calcular la nota media del estudiante. -------------------------------------------------
					 */
					case 5:
						for (Estudiante estudiante1 : estudiantes.values()) {
							System.out.println(estudiante1);
						}
				
						break;
					
						
					/*
					 * Para calcular la nota media de la clase.
					 */
					
					case 6:
						double notasFinales = 0;
						int cantEstudiantes = estudiantes.size();
						for (Estudiante estudianteNota : estudiantes.values()) {
							notasFinales += estudianteNota.calcularNotaMedia();
						}
						if (cantEstudiantes > 0) {
							System.out.println("La nota media de la clase es: " + notasFinales/cantEstudiantes);
						}
						else System.out.println("No hay estudiantes registrados");
					
						break;
						
						
						
					/*
					 * Para salir del programa. --------------------------------------------------------------------
					 */
					case 7:		
						continuar = false;
						break;
						
					default: System.out.println("\n ## Selecciona una opción correcta ## \n");
						
						
				} //SWITCH
			} //TRY
				
			catch (Exception e) {
				System.out.println("\n ##Opción no válida, elija una opción, o el DNI introducido no es correcto. ## \n");
				sc.nextLine();
			
			}  //CATCH
			
		}  //WHILE
		
	}  //MAIN
	
} //CLASS
