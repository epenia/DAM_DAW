package Ejercicio1;

public class Persona {

	private String nombre;
	private int edad;
	private String genero;

	public Persona(String nombre, int edad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public String toString() {
		return this.nombre + " Genero " + this.genero + " y " + this.edad + " años de edad";
	}

}
