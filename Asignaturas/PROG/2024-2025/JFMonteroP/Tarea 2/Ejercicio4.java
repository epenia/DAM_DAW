import java.util.Scanner; //Importamos la clase Scanner para la entrada de datos del usuario.

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invocamos a la clase Scanner.
		Scanner sc = new Scanner(System.in);
		
		//Definimos las variables que vamos a utilizar.
		int gradosF; //variable grados celsius.
		double gradosC; //variable para los grados centigrados
		
		//Para que imprima el string de entrada de datos del usuario y posteriormente la entrada de los datos
		System.out.println("Ingresa la temperatura en grados Fahrenheit: ");
		gradosF = sc.nextInt();
		
		//Fórmula matemática para la conversión de grados F a grados C.
		gradosC = ( ((double) 5/9) * (gradosF-32) );
		
		//Impresión por consola del resultado con 2 decimales.
		System.out.printf("La temperatura en grados Celsius es: %.2f", gradosC);
		
		sc.close(); // Cerramos la clase Scanner.
		
		
		
	}

}
