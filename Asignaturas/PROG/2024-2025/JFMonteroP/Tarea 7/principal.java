package GestionVeh;

import java.util.*;


public class principal {
	
	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		Vehiculo[] vehiculos = new Vehiculo[20];		
		int indexVeh = 0;
		String combustible = "";
		int cilindrada = 0;
		boolean continuar = false;
		boolean combustibletrue = false;
		
		
		
		while (!continuar) {
			try {
				System.out.println("\n ### MENU INTERACTIVO ### \n * Eligue una de las siguientes opciones: \n 1. Registrar Vehículo." +
						"\n 2. Realizar Mantenimiento \n 3. Mostrar Información de los vehículos \n 4. Salir");
				System.out.print("Selección: ");
				int eleccion = sc.nextInt();
				switch (eleccion) {
				case 1:
					System.out.println("Que vehículo deseas registrar: \n 1. Coche \n 2. Moto \n 3. Camión");				
					int tipo = sc.nextInt();
					sc.nextLine();
					switch (tipo) {						
					case 1: {
						System.out.print("Ingresa la matrícula: ");
						String matricula = sc.nextLine();
						System.out.print("Ingresa la marca: ");
						String marca = sc.nextLine();
						System.out.print("Ingresa el modelo: ");
						String modelo = sc.nextLine();						
						while (!combustibletrue) {
						System.out.print("Ingresa el combustible(gasolina/diesel/electrico: ");
						combustible = sc.nextLine();
							if (combustible.equalsIgnoreCase("diesel") || combustible.equalsIgnoreCase("gasolina") || combustible.equalsIgnoreCase("electrico")) {
								combustibletrue = true;
							}
							else System.out.println("Introduce diesel, gasolina o electrico");
							
						}
						System.out.print("Ingresa el año de fabricación: ");
						int anio = sc.nextInt();
						System.out.print("Ingresa los kilómetros del coche: ");
						int kilometros = sc.nextInt();
						vehiculos[indexVeh] = new Coche (matricula, marca, modelo, anio, kilometros, combustible);
						indexVeh++;
						combustibletrue = false;
						break;
					}
					
					case 2: {
						System.out.print("Ingresa la matrícula: ");
						String matricula = sc.nextLine();
						System.out.print("Ingresa la marca: ");
						String marca = sc.nextLine();
						System.out.print("Ingresa el modelo: ");
						String modelo = sc.nextLine();
						while (cilindrada <= 0) {
							System.out.print("Ingresa la cilindrada en cc: ");
							cilindrada = sc.nextInt();
						}					
						System.out.print("Ingresa el año de fabricación: ");
						int anio = sc.nextInt();
						System.out.print("Ingresa los kilómetros de la Moto: ");
						int kilometros = sc.nextInt();
						vehiculos[indexVeh] = new Moto (matricula, marca, modelo, anio, kilometros, cilindrada);
						indexVeh++;
						break;
					}
					
					case 3: {
						System.out.print("Ingresa la matrícula: ");
						String matricula = sc.nextLine();
						System.out.print("Ingresa la marca: ");
						String marca = sc.nextLine();
						System.out.print("Ingresa el modelo: ");
						String modelo = sc.nextLine();
						System.out.print("Ingresa el peso en Toneladas: ");
						int peso = sc.nextInt();
						System.out.print("Ingresa el año de fabricación: ");
						int anio = sc.nextInt();
						System.out.print("Ingresa los kilómetros del camion: ");
						int kilometros = sc.nextInt();
						vehiculos[indexVeh] = new Camion (matricula, marca, modelo, anio, kilometros, peso);
						indexVeh++;
						break;
					}
					default: {
						System.out.println("No se ha seleccionado una opción correcta");
						break;
					}//CASE TIPO.
					}//CASE 1 Registrar veh
					break;
				case 2:{
					sc.nextLine();
					System.out.println("Ingresa la matrícula del vehículo a realizar el mantenimiento: ");				
					String matricula = sc.nextLine();
					
					for (int i = 0; i < indexVeh; i++) {	
						while (vehiculos[i].matricula.equalsIgnoreCase(matricula)){							
								vehiculos[i].realizarMantenimiento();
								break;
						}			
					}
					System.out.println("Matrícula no encontrada");
					break;	
					} //CASE 2 Mantenimiento Veh.
					
				
				case 3: {
					for (int i = 0; i < indexVeh; i++) {
						System.out.println("-Matricula: " + vehiculos[i].matricula + " -Marca: " + vehiculos[i].marca + " -Modelo: " + vehiculos[i].modelo 
								+ " -Año: " + vehiculos[i].anio + " -Kilometros: " + vehiculos[i].kilometros);
					}
					break;
				}//CASE 3 Información.
				
				case 4: {
					System.out.println(" \n ### Gracias por usar la APP de Gestión de vehículos ### \n "
							+ "***********************************************************");
					continuar = true;
					break;
					
				} //CASE 4 Salir
				
				default: System.out.println("\n Elija una de las opciones del Menú. \n ");
				break;
				
				}//SWITCH
				
				
			}//TRY
			
			catch (Exception e) {
				System.out.println("\n ## Dato  introducido incorrecto u Opción incorrecta, elija una de las opciones. ## \n ");
				sc.nextLine();
			}
			
		}//WHILE	
		
		sc.close();

	} //MAIN
	

}//CLASS
