import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MENU
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		
		while (continuar) {
			
			try { 
			
				System.out.println("## Selecciona una de las opciones: ## \n 1. Iniciar Juego. \n 2. ¿Como se juega? \n 3. Salir.");
				int eleccion = sc.nextInt();
			
				switch (eleccion) { 
					case 1: //En caso de seleccionar la 1, creamos una clases nuevoJuego y llamamos al método.
						JuegoAdivinanza nuevojuego = new JuegoAdivinanza();
						nuevojuego.iniciarJuego(); // Iniciamos el juego.
						break;
					case 2: //Unas breves instrucciones de como se juega.
						System.out.println("\n El juego es sencillo, introduce un número entre 1 y 100 para ver " +
								"si adivinas el número que está pensando la máquina. \n Tendrás 10 intentos" + 
								" para conseguirlo, adelante y ¡Suerte! \n");
						break;
						
					case 3: //Salir del juego.
						System.out.println("¡Adiós! Gracias por jugar");
						continuar = false;
						break;
					default:
						System.out.println("\n****Opción no válida selecciona una de las 3 opciones**** \n");
				}
			}
			catch (Exception e) {
				System.out.println("Ingresa un número del menu.");
				sc.nextLine(); //evita entradas de string por la excepción.
			}
		}
	sc.close();
	}

}
