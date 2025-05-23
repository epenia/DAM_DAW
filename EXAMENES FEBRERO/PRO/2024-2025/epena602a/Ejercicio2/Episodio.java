package Ejercicio2;

public class Episodio {
	private String titulo;
	private int duracion;

	Episodio() {
		this.titulo = "";
		this.duracion = 0;
	}

	Episodio(String titulo, int duracion) {
		this.titulo = titulo;
		this.duracion = duracion;
	}
	
	public String getTitulo () {
		return this.titulo;
	}

	public int getDuracion() {
		return this.duracion;
	}

	@Override
	public String toString() {
		return "Titulo: " + this.titulo + ", Duracion: " + this.duracion;
	}
}
