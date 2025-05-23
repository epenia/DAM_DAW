package Ejercicio2;

import java.util.Scanner;

public class Serie {
	public static int serieId = 0;
	private int id = 0;
	private String titulo = "";
	private int temporadas = 0;
	private int anio = 0;
	private Episodio episodios = null;

	Serie() {
		Serie.serieId++;
		this.id = Serie.serieId;
	}

	Serie(String titulo, int temporadas, int anio) {
		Serie.serieId++;
		this.id = Serie.serieId;
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.anio = anio;
	}

	public void verSerie() {
		if (!this.tengoEpisodios()) {
			System.out.println("Esta serie no tiene episodios disponibles");
			return;
		}
		

		Scanner scanner = new Scanner(System.in);	

		System.out.println("Episodios disponibles: ");
		System.out.println("1 - " + this.episodios.toString());		

		System.out.println("Elige el episodio que quieres ver: ");
		String eleccion = scanner.next();
		
		if (eleccion.equals("1")) {
			System.out.println("Viendo episodio: " + this.episodios.getTitulo());
			return;
		}

		System.out.println("No existe el episodio que has seleccionado");
		
	}

	public String duracionSerie() {
		if (!this.tengoEpisodios()) {
			System.out.println("Esta serie no tiene episodios disponibles");
			return "Sin episodios";
		}
		int duracion = this.episodios.getDuracion();
		int horas = duracion / 60;
		if (horas > 0) {
			duracion = duracion - 60 * horas;
		}

		return horas > 0 ? "La duración de la serie es de " + horas + " horas y " + duracion + " minutos"
				: "La duración de la serie es de " + duracion + " minutos";
	}

	public boolean tengoEpisodios() {
		return this.episodios != null;
	}
	
	public void setEpisodio(Episodio episodio) {
		this.episodios = episodio;
	}

	@Override
	public String toString() {
		String numeroEpisodios = this.tengoEpisodios() ? "1" : "0";
		String duracionSerie = this.tengoEpisodios() ? this.duracionSerie() : "0";
		return "Id: " + this.id + ", Titulo: " + this.titulo + ", Temporadas: " + this.temporadas + ", Año: "
				+ this.anio + ", Episodios: " + numeroEpisodios + ", Duración Serie: " + duracionSerie;
		
		
	}
}
