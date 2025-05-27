
import java.util.UUID;

public class Movil {
	private static int moviles = 0;
	private String marca;
	private String modelo;
	private String color;
	private String id;

	private int contadorLlamadas = 0;

	private Tarjeta tarjeta;

	public Movil() {
		this.inicializar("nokia", "X6", "negro");
	}

	public Movil(String marca, String modelo, String color) {
		this.inicializar(marca, modelo, color);
	}
	
	public void inicializar (String marca, String modelo, String color) {

		this.id = (UUID.randomUUID()).toString();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tarjeta = null;
		moviles++;
	}

	public void llamar(String nombre, String numero) {
		this.contadorLlamadas++;
	}

	public boolean comprobarTarjeta() {
		return this.tarjeta != null;
	}
	
	public void ponerTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	public void quitarTarjeta() {
		this.tarjeta = null;
	}

	@Override
	public String toString() {
		return "ID: " + this.id + ", Marca: " + this.marca + ", Modelo: " + this.modelo + ", Color: " + this.color;
	}
	
	public int numeroLlamadas() {
		return this.contadorLlamadas;
	}

	public static int getTotalMoviles() {
		return moviles;
	}
}
