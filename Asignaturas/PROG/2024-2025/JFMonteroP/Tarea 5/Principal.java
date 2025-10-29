package Tarea05;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		//Creamos el movil1 y asignamos tarjeta.
		Movil movil1 = new Movil();
		Tarjeta tarjeta1 = new Tarjeta();		
		movil1.setTarjeta(tarjeta1);
		
		//Creamos el movil2
		Movil movil2 = new Movil("Samsung", "S24", "Azul", null);
		
		
		//MENU del programa
		
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		
		while (continuar) {
			try {
				System.out.println("Selecciona una de las siguientes opciones" + "\n 1-Poner Tarjeta. "
						+ "\n 2-Quitar tarjeta \n 3-Llamar \n 4-Mostrar Información \n 5-Salir");
				int eleccion = sc.nextInt();
				
				
				switch (eleccion){
				
					//Poner Tarjeta en los móviles.
					case 1:
						System.out.println("A que móvil quieres poner la tarjeta,\n 1: Movil 1 \n 2: Movil 2");
						int eleccion1 = sc.nextInt();
						switch (eleccion1) {
							
							case 1: 
									
								boolean comprobando1 = movil1.comprobarTarjeta();
								if (comprobando1 == true) {
								}
								else {
									sc.nextLine(); //Salto de linea para limpiar el bufer.
									System.out.println("Introduce la compañia: ");
									String compania1 = sc.nextLine();
									
									boolean numeroCorrecto = false;
									while (!numeroCorrecto) {
										try {
											System.out.println("Introduce el número de teléfono, recuerda debe empezar por 6 o 9");
										String telefono1 = sc.nextLine();
										Tarjeta tarjetaNueva1 = new Tarjeta(compania1, telefono1);
										tarjetaNueva1.validarNumero(telefono1);
										movil2.setTarjeta(tarjetaNueva1);
										numeroCorrecto = true;										
										}
										catch (IllegalArgumentException e) {
											System.out.println(e.getMessage());
										}
																			
									}
								}
							break;
							case 2:
								
								boolean comprobando2 = movil2.comprobarTarjeta();
								if (comprobando2 == true) {
								}
								else {
									sc.nextLine(); //Salto de linea para limpiar el bufer.
									System.out.println("Introduce la compañia: ");
									String compania2 = sc.nextLine();
									
									boolean numeroCorrecto = false;
									while (!numeroCorrecto) {
										try {
											System.out.println("Introduce el número de teléfono debe empezar por '6' o '9'");
											String telefono2 = sc.nextLine();
											Tarjeta tarjetaNueva2 = new Tarjeta(compania2, telefono2);
											tarjetaNueva2.validarNumero(telefono2);
											movil2.setTarjeta(tarjetaNueva2);
											numeroCorrecto = true;										
										}
										catch (IllegalArgumentException e) {
											System.out.println(e.getMessage());
										}
																			
									}
								}
									
							break;
							
							default:
								System.out.println("\n #Introduce un número válido # \n");
						}
						
					break;
					
					// Fin Poner Tarjeta

					
					//Quitar tarjeta a los móviles.	
					
					case 2:	
						System.out.println("A que móvil quieres quitar la tarjeta,\n 1: Movil 1 \n 2: Movil 2");
						int eleccion2 = sc.nextInt();
						switch (eleccion2) {
							case 1:
								movil1.setTarjeta(null);
								break;
							case 2: 
								movil2.setTarjeta(null);
								break;
						}
					break;
					
					//Fin Quitar Tarjeta
					
					
					// Llamar con los móviles.		
					case 3:
						System.out.println("¿Con que teléfono desea llamar? \n 1-Móvil 1 \n 2-Móvil 2");
						int eleccion3 = sc.nextInt();
						switch (eleccion3) {
							case 1: {
								System.out.println("Inserta el nombre del contacto:");
								String nombre = sc.nextLine();
								sc.nextLine();
								boolean numeroCorrecto = false;
								while (!numeroCorrecto) {
									try {
										System.out.println("Inserta el número de teléfono, recuerda debe empezar por 6 o 9.");
										String numero = sc.nextLine();
										movil1.llamar(nombre, numero);
										numeroCorrecto = true;
									}
									catch (IllegalArgumentException e) {
										System.out.println(e.getMessage());
									}
								}
							break;
							
							}
							
							case 2: {
								System.out.println("Inserta el nombre del contacto:");
								String nombre = sc.nextLine();
								sc.nextLine();
								boolean numeroCorrecto2 = false;
								while (!numeroCorrecto2) {
									try {
										System.out.println("Inserta el número de teléfono, recuerda debe empezar por 6 o 9.");
										String numero = sc.nextLine();
										movil2.llamar(nombre, numero);
										numeroCorrecto2 = true;
									}
									catch (IllegalArgumentException e) {
										System.out.println(e.getMessage());
									}
								}
				
							}
							break;
						}
					break;
					
					//Fin Llamar por teléfono
						
					//Mostrar información de los teléfonos.
					case 4:
						movil1.mostrarInfoMovil();
						movil2.mostrarInfoMovil();	
					break;
						
					//Fin Mostrar info
					
					//Salir del programa.
					case 5:	{
						System.out.println("Gracias por usar el programa de móvil");
						continuar = false;
						break;
					}
					}
			}
			
			
			// Controlar los errores de insertar números no válidos.
			
			catch (Exception e) {
				System.out.println("\n ##Introduce una opción válida## \n");
				sc.nextLine();
			}
			
			
			}
				
		
	sc.close();

	}
}
