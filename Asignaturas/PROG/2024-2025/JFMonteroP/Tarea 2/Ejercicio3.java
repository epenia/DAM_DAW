import java.util.Scanner; //Importamos la clase Scanner.

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables, incluida la de introducir datos por parte del usuario.
		Scanner sc = new Scanner(System.in);	
		int millares, centenas, decenas, unidades;
		int numeroUser;
		
		//Solicitamos al usuario por consola el número para transformar.
		System.out.println("Introduce número a transformar:"); //Imprime un mensaje en pantalla.
		numeroUser = sc.nextInt(); //Variable que almacena el dato introducido.
		
		//Operaciones que realiza el programa y almacena en la variable.
		millares = (numeroUser/1000);
		centenas = (numeroUser % 1000) /100;
		decenas = (numeroUser % 100) / 10;
		unidades = (numeroUser % 10);
		
		//Impresión por pantalla del resultado de las operaciones anteriores.
		System.out.println("Millares: " + millares + "\nCentenas: " + centenas + "\nDecenas: " + decenas + "\nUnidades: " + unidades);
		
		
		sc.close(); // Se cierra la clase Scanner.
	}

}
