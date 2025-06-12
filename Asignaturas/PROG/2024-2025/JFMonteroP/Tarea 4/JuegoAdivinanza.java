import java.util.*;

public class JuegoAdivinanza {
	

	
	//Variables de la clase.
	
	private int numeroSecreto; 
	private int intentosMaximos = 10;
	private int intentosRealizados = 0;
	private int puntuacion = 100;
	
	
	// Constructores.
	
	public JuegoAdivinanza() {
		super();
	}
	
	
	public JuegoAdivinanza(int numeroSecreto, int intentosMaximos, int intentosRealizados, int puntuacion) {
		super();
		this.numeroSecreto = numeroSecreto;
		this.intentosMaximos = intentosMaximos;
		this.intentosRealizados = intentosRealizados;
		this.puntuacion = puntuacion;
	}
	
	
	//MÉTODOS.
	
	//Método para controlar el flujo del juego******************************************************
	
	public void iniciarJuego () {
		
		numeroSecreto = (int) (Math.random() * 100) + 1; // Generamos el número secreto.
		
		
		// * Borrar para saber el número secreot  System.out.println(numeroSecreto);
		
		Scanner sc = new Scanner(System.in); //Creamos la clase Scanner para la entrada de datos.
		boolean ganador = false;
		
		while (intentosMaximos > intentosRealizados) {
			System.out.println("Ingresa un número entre 1 y 100");
			String entrada = sc.nextLine(); 
			System.out.print("*** Tú intento es el: " + (intentosRealizados+1) + "/" + intentosMaximos + " *** ");
			
			try {
				
				int numeroUsuario = validarEntrada(entrada);				
				
				if (numeroUsuario == numeroSecreto) {
					ganador = true;
					calcularPuntuacion(intentosRealizados);
					break;
				}
				else if (numeroUsuario > numeroSecreto) {
					System.out.println("el número secreto es más bajo");
				}
				else {
					System.out.println("El numero secreto es más alto");
				}
				
				
			}
			catch (Exception e) {
				System.out.println("Entrada no válida. " + e.getMessage());
			}
			
			intentosRealizados++;
		}
		
		
		mostrarMensajeFinal(ganador);

	}
		
	
	
	//Segundo Metodo. Calcular la puntuación***************************************************
	
	private void calcularPuntuacion(int intentos) {
		puntuacion = 100 - (10*intentos);
	}
	
	
	//Tercer Método, validar los datos*********************************************************
	private int validarEntrada(String entrada) throws Exception { 		
		try {
			int numero = Integer.parseInt(entrada);
			if (numero < 1 || numero > 100) {
				throw new Exception("Introduce un número entre 1 y 100");
			}
			return numero;			
		} 
		
		catch (NumberFormatException e) {
			throw new Exception("Debes introducir un número entero válido.");
		}
	}
	
	//Cuarto método, mostrar decir si ganó o no y mostrar puntuación****************************
	private  void mostrarMensajeFinal(boolean ganador) {
		if (ganador == true) {
			System.out.println("\n **** ¡Enhorabuena lo has conseguido!, tu puntuación ha sido: " + puntuacion 
					+ " puntos. **** \n ");
		}
		else {
			System.out.println("\n Has agotado el número de intentos. Mejor suerte la próxima vez");
		}
	}
	
}
