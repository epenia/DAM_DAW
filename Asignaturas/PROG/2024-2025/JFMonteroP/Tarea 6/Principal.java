import java.util.Scanner;

public class Principal {
	

	public static void main(String[] args) {
		
		/*
		 * Variables locales.
		 */
		
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		String dni = "";
		String nombre = "";
		Estudiante[] nuevoEstudiante = new Estudiante[30];
		int cantidadEstudiantes = 0;
		
		//-------------------------------------------------------
		
		
		/*
		 * Inicio del programa (MENU)
		 */
		
		
		while (continuar) {
			
			try {
				System.out.println("Elige una opción: \n 1. Crear estudiante. \n 2. Introducir nota a estudiante" +
						"\n 3. Mostrar resumen estudiante \n 4. Calcular media del estudiante \n 5. Calcular media de la clase \n 6. Salir");
							int eleccion = sc.nextInt();
				switch (eleccion) {
				
				/*
				* Ingresar estudiante ----------------------------------
				*/
					case 1: 
						
						System.out.println("Introduce el nombre:"); //Capturamos el nombre
						sc.nextLine();
						nombre = sc.nextLine();
						
						boolean dniValido = true;
						
						while (dniValido) {
							System.out.println("Introduce DNI:"); //Capturamos el dni
							dni = sc.nextLine();
							if (esValido(dni)) {  // Comprobamos el dni con el método esValido (el método esta al final).
								dniValido = false;
							}
							else {
								System.out.println("\n ## Introduce un dni válido 12345678A ## \n");
							}						
						} // while validación dni.
						
						if (cantidadEstudiantes < nuevoEstudiante.length) {
							nuevoEstudiante[cantidadEstudiantes] = new Estudiante(dni, nombre);
							cantidadEstudiantes++; //indice para llevar el número de estudiantes registrados.
						}
						else System.out.println("Se ha alcanzado el número máximo de estudiantes");
						
						break;

					/*
					 * Opción para introducir notas al estudiante. ------------------
					 */
						
					case 2: 
						
						boolean continuar1 = true;
						
						while(continuar1) {
							sc.nextLine();
							System.out.println("Introduce el dni al que deseas añadir la nota: ");  //Solicitamos el dni del estudiante.
							String buscarDni = sc.nextLine();
							int posicion = buscarDNI(nuevoEstudiante, buscarDni, cantidadEstudiantes); //Buscamos el dni en el array con el método buscarDNI (está al final).
							if (posicion != -1) {
								while (continuar1) {
									System.out.println("\n ## Seleccione que desea realizar: \n 1.Nota de Examen \n 2.Nota de Tarea");
									int selec1 = sc.nextInt();
									switch (selec1) {
										case 1:
											try {
												System.out.println("Introduce la nota del examen:");
												double notaex = sc.nextDouble();
												sc.nextLine();
												nuevoEstudiante[posicion].anadirNotaExamen(notaex);
												continuar1 = false;
											}
											catch (Exception e) {
												System.out.println("Dato introducido no válido");
											}
											break;
										
										case 2:
											try {
												System.out.println("Introduce la nota de la Tarea");
												double notaTarea = sc.nextDouble();
												sc.nextLine();
												nuevoEstudiante[posicion].anadirNotaTarea(notaTarea);
												continuar1 = false;
											}
											catch (Exception e) {
												System.out.println("Dato introducido no válido");
											}
										default: System.out.println("Selecciona una opción correcta.");
										break;
									} //switch
								} // 2ºWhile comprobación de la nota.1
							}// if
							
							else {
								System.out.println("Estudiante no encontrado, pulsa Enter para continuar.");
								
								}//else
							
							
						}
				
						break;
						
					/*
					 * Para imprimir datos por pantalla, resumen. --------------------------------------------------
					 */
						
					case 3: // Imprimir por pantalla un estudiante.
						sc.nextLine();
						System.out.println("introduce el dni del estudiante a ver: ");
						String buscarDni = sc.nextLine();
						int posicion = buscarDNI(nuevoEstudiante, buscarDni, cantidadEstudiantes);
						nuevoEstudiante[posicion].calcularMediaExamenes(); // Calculamos las medias para que no den 0
						nuevoEstudiante[posicion].calcularMediaTareas();
						System.out.println(nuevoEstudiante[posicion].toString());
						break;
					
					/*
					 * Para calcular la nota media del estudiante. -------------------------------------------------
					 */
					case 4:
						sc.nextLine();
						System.out.println("Introduce el dni al que calcular la nota media: ");
						String buscarDni2 = sc.nextLine();
						int posicionest = buscarDNI(nuevoEstudiante, buscarDni2, cantidadEstudiantes);
						nuevoEstudiante[posicionest].calcularMediaExamenes(); // Calculamos las medias para que no den 0;
						nuevoEstudiante[posicionest].calcularMediaTareas();
						System.out.println("La nota media del estudiante es: " + nuevoEstudiante[posicionest].calcularNotaMedia());
						
				
						break;
					
					/*
					 * Para salir del programa. --------------------------------------------------------------------
					 */
					case 5:
						System.out.println("Vamos a calcular la nota media de todos los estudiantes un segundo");
						double mediaExTodos = 0;
						double mediaTaTodos = 0;
						double mediaTotalClase = 0;
						for (int i = 0; i<cantidadEstudiantes; i++) {
							mediaExTodos += nuevoEstudiante[i].calcularMediaExamenes();
							mediaTaTodos += nuevoEstudiante[i].calcularMediaTareas();
							mediaTotalClase += nuevoEstudiante[i].calcularNotaMedia();

						}
						
						if (cantidadEstudiantes > 0) {
							mediaExTodos /= cantidadEstudiantes;
							mediaTaTodos /= cantidadEstudiantes;
							mediaTotalClase /= cantidadEstudiantes;
						}
						
						System.out.println("\n ## La nota media total de la clase es " + mediaTotalClase + "##" + "\n La nota media de exámenes de la clase es: "
								+ mediaExTodos + "\n la nota media de clase de las tareas es: " + mediaTaTodos + "\n");
						
						break;
					
					case 6:		
						continuar = false;
						break;
						
					default: System.out.println("Selecciona una opción correcta");
						
						
				} //SWITCH
			} //TRY
				
			catch (Exception e) {
				System.out.println("\n ##Opción no válida, elija una opción, o el DNI introducido no es correcto. ## \n");
				sc.nextLine();
			
			}  //CATCH
			
		}  //WHILE
		
	}  //MAIN
	
	
	/*
	 * Métodos adicionales para el funcionamiento del programa. ---------------------------------------------------------
	 */
	
	//COMPROBAR QUE EL DNI ES VÁLIDO.
	private static boolean esValido(String dniValido) {
		return dniValido.matches("\\d{8}[A-Za-z]");
	}
	
	// PARA BUSCAR DNI EN EL ARRAY
	public static int buscarDNI (Estudiante[] nuevoEstudiante, String dni, int cantidad) {
		for (int i = 0; i < cantidad; i++) { //Bucle for para recorrer el array de 0 hasta nº estudiantes.
			if(nuevoEstudiante[i] != null && nuevoEstudiante[i].getDni().equalsIgnoreCase(dni)) { //Comparamos los dni del array con el introducido
				return i;
			}
		}
				
		return -1;
	}
	
} //CLASS
