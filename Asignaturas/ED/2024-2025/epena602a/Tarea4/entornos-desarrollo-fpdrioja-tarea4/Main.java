import java.util.Scanner;

/**
 * Clase principal que ejecuta el programa para calcular el IMC.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar peso y altura al usuario
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        
        // Crear una persona y calcular el IMC
        Persona persona = new Persona(peso, altura);
        System.out.println(persona.obtenerMensajeIMC());
        
        scanner.close();
    }
}