package Ejercicio2;

public class Personaje {
	public static int Personajes = 0;

	private int id;
	private String nombre;
	private int habilidad;
	private int fuerza;
	private int energia;

	Personaje() {
		++Personaje.Personajes;
		this.id = Personaje.Personajes;
		this.energia = 100;
	}

	Personaje(String nombre, int habilidad, int fuerza) {
		++Personaje.Personajes;
		this.id = Personaje.Personajes;
		this.nombre = nombre;
		this.habilidad = habilidad;
		this.fuerza = fuerza;
		this.energia = 100;
	}

	public int getId() {
		return this.id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHabilidad() {
		return this.habilidad;
	}

	public void setHabilidad(int habilidad) {
		this.habilidad = habilidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	@Override
	public String toString() {
		return "ID: " + this.id + ", Nombre: " + this.nombre + ", Habilidad: " + this.habilidad + ", Fuerza: "
				+ this.fuerza + ", Energia: " + this.energia;
	}

}
