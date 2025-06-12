package videojuegos;

public class Videojuegos {
	private String Titulo;
	private String Plataforma;
	private int anio_lanzamiento;
	private String Compania;
	private int horas_jugadas;
	
	
	public Videojuegos(String titulo, String plataforma, int anio_lanzamiento, String Compania, int horas_jugadas) {
		super();
		this.Titulo = titulo;
		this.Plataforma = plataforma;
		this.anio_lanzamiento = anio_lanzamiento;
		this.Compania = Compania;
		this.horas_jugadas = horas_jugadas;
	}


	public String getTitulo () { return Titulo; }
	public String getPlataforma() {return Plataforma;}
	public int gethoras_jugadas() {return horas_jugadas;}
	public String getCompania() { return Compania; }
	public int getanio_lanzamiento() { return anio_lanzamiento; }
	
	
	public void setTitulo(String Titulo) { this.Titulo = Titulo; }
	public void setPlataforma(String Plataforma) { this.Plataforma = Plataforma; }
	public void sethoras(int horas_jugadas) {this.horas_jugadas = horas_jugadas;}
	public void setanio_lanzamiento(int anio_lanzamiento) {this.anio_lanzamiento = anio_lanzamiento; }
	public void setCompania (String Compania) { this.Compania = Compania; }


	
	@Override
	public String toString() {
		return "Videojuegos [Titulo= " + Titulo + ", Plataforma= " + Plataforma + ", Año de Lanzamiento= " + anio_lanzamiento
				+ ", Compañia= " + Compania + ", Horas jugadas= " + horas_jugadas + "]";
	}



	
	

}
