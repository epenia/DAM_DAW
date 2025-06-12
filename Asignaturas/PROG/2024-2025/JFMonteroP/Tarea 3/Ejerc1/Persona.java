package Ejerc1;

public class Persona {
	
	//Atributos de la clase Persona
	private String nombre;
	private int edad;
	private String genero;
	
	//Constructores de la clase Persona.
	public Persona () {
		super();
	}
	
	public Persona (String nombre, int edad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	
	public void imprimirPersona() {
		System.out.println("******** DATOS DEL TITULAR ************");
		System.out.println(this.nombre + ", " + this.edad + " años, " + this.genero);
		System.out.println();

	}
	
	
	public String getnombre() {
		return nombre;
	}
	
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
}
