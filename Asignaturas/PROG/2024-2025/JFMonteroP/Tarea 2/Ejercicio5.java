import java.util.Scanner; //importamos la clase Scanner para la entrada del usuario.

public class Ejercicio5 {
	
	public static void main (String[] args) {
		
		//Definimos las variables y la entrada del usuario.
		Scanner sc = new Scanner(System.in);
		int edad;
		String comprobar;

		//Entrada del usuario por consola de la edad a comprobar.
		System.out.println("Introduce la edad: ");
		edad = sc.nextInt();
		
		//Operación condicional para comprobar si es mayor o menor.
		comprobar = ((edad>18)?"Mayor de edad":"Menor de edad");
		
		//Impresión por consola del resultado con la variable comprobar.
		System.out.println(comprobar);
		
		//Cerrando clase Scanner.
		sc.close();
		
	} 
		
		
}