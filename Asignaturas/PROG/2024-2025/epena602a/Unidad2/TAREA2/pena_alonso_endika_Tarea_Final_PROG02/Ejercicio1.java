package Ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {

		// Declaramos todas las variables variables
		float temperaturaHabitacion = 22.5f; // tipo float porque es un dato que puede tener decimales pero de pequeño valor
		String nombreMascota = "Roxy";	// Tipo string ya que es un texto
		boolean esNumeroPar = true; // tipo boolean porque puede ser SI o NO
		float valorPI = 3.14159f; // tipo float porque tenemos pocos decimales en está asignación de PI
		double saldoBancario = 2315.13; // double porque el saldoBancario puede crecer o decrecer mucho
		String numeroDeSerie = "MWPQJR4MW9"; // String debido a que es un dato de tipo alfanumerico

		// Pintamos la salida de las variables
		System.out.println("Temperatura: " + temperaturaHabitacion);
		System.out.println("Nombre de la mascota: " + nombreMascota);
		System.out.println("El número es par?: " + esNumeroPar);
		System.out.println("Valor de PI: " + valorPI);
		System.out.println("Saldo de la cuenta: " + saldoBancario);
		System.out.println("Número de serie: " + numeroDeSerie);
	}
}