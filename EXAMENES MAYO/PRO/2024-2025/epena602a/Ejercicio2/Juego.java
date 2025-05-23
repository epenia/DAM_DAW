package Ejercicio2;

import java.util.ArrayList;

public class Juego {
	public static int juegos = 0;
	private int id;
	private String nombre;
	private int anio;
	private ArrayList<Personaje> personajes = new ArrayList();

	Juego() {
		++Juego.juegos;
		this.id = Juego.juegos;
	}

	Juego(String nombre, int anio) {
		++Juego.juegos;
		this.id = Juego.juegos;
		this.nombre = nombre;
		this.anio = anio;
	}

	public int getId() {
		return this.id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getAnio() {
		return this.anio;
	}

	public void addPersonaje(Personaje personaje) {
		this.personajes.add(personaje);
	}

	public ArrayList<Personaje> getPersonajes() {
		return this.personajes;
	}

	public int Jugar(int IdPersonaje1, int IdPersonaje2) {
		Personaje personaje1 = this.buscarPersonaje(IdPersonaje1);
		Personaje personaje2 = this.buscarPersonaje(IdPersonaje2);

		// Formula (habilidad * fuerza ) + energia
		int PJ1 = (personaje1.getHabilidad() * personaje1.getFuerza()) + personaje1.getEnergia();
		int PJ2 = (personaje2.getHabilidad() * personaje2.getFuerza()) + personaje2.getEnergia();
		

		System.out.println("Jugador 1: (habilidad * fuerza ) + energia = " + PJ1);
		System.out.println("Jugador 2: (habilidad * fuerza ) + energia = " + PJ2);
		
		if (PJ1 < PJ2) {
			return 2;
		}
		
		if (PJ1 > PJ2) {
			return 1;
		}

		return -1;
	}

	public Personaje buscarPersonaje(int id) {
		for (int i = 0; i < this.personajes.size(); i++) {
			Personaje personaje = this.personajes.get(i);
			if (personaje.getId() == id) {
				return personaje;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "ID: " + this.id + ", Juego: " + this.nombre + ", Año: " + this.anio;
	}
}
