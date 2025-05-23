/**
 * Representa una persona con peso y altura.
 */
public class Persona {
    private double peso; // Peso en kilogramos
    private double altura; // Altura en metros

    /**
     * Constructor de la clase Persona.
     * @param peso Peso en kilogramos
     * @param altura Altura en metros
     */
    public Persona(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Calcula el Índice de Masa Corporal (IMC).
     * @return IMC calculado
     */
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    /**
     * Devuelve un mensaje personalizado basado en el IMC calculado.
     * @return Mensaje sobre el estado de peso
     */
    public String obtenerMensajeIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return String.format("Tu IMC es %.1f. Estás por debajo del peso normal. ¡Consulta con un médico!", imc);
        } else if (imc < 25) {
            return String.format("Tu IMC es %.1f. Tienes un peso saludable. ¡Buen trabajo!", imc);
        } else {
            return String.format("Tu IMC es %.1f. Tienes sobrepeso. ¡Cuida tu salud!", imc);
        }
    }
} 