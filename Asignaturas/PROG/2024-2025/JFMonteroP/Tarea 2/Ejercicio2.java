import java.util.Scanner; //Importamos la clase Scanner para la introducción de datos por el usuario.

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar en el programa.
		
		int usuarioSeg; 
		int horas;
		int minutos;
		int segundo;
		
		//creamos la variable scanner que es la que se encarga de obtener los valores del usuario.
		Scanner sc = new Scanner (System.in);
		
		//Imprimimos por consola un mensaje y damos la opción al usuario de que introduzca los segundos.
		System.out.println("Introduce los segundos para transformar: ");
		usuarioSeg = sc.nextInt();
		
		//Aquí realiza las operaciones para obtener las horas, minutos y segundos. El % lo que hace es coger el resto de la división.
		horas = (usuarioSeg / 3600);
		minutos = ((usuarioSeg % 3600) / 60);
		segundo = (usuarioSeg % 60);
		
		//Imprimimos por pantalla el mensaje con el resultado y cerramos la clase Scanner.
		System.out.println("Equivalente a: "+ horas + " horas " + minutos + " minutos " + segundo + " segundos ");
		
		sc.close(); //Cerramos la clase Scanner.
		
		
		
	}

}
