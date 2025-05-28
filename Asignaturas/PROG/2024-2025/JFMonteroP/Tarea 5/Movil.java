package Tarea05;

import java.util.Random;

public class Movil {
	
	public int id;
	private String marca;
	private String modelo;
	private String color;
	public int contadorLlamadas;
	private Tarjeta tarjeta;

	
	
	// Constructores
	
	public Movil() {
		super();
		this.id = 1;
		this.marca = "Iphone";
		this.modelo = "16 pro";
		this.color = "negro";
		this.contadorLlamadas = 0;
		this.tarjeta = null;
	}
	
	public Movil(String marca, String modelo, String color, Tarjeta tarjeta) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tarjeta = tarjeta;
		this.id = id++;
		this.contadorLlamadas = 0;
		this.tarjeta = null;
	}
	
	
	
	
	//Métodos
	
	public void llamar (String nombre, String numero) {
			if (this.tarjeta != null && numero.startsWith("6") || (this.tarjeta != null && numero.startsWith("9")) ) {
				System.out.println("\n ## Llamando... ## \n");
				this.contadorLlamadas ++;
			}
			else if (this.tarjeta == null) {
				System.out.println("\n ## El teléfono no tiene tarjeta pruebe a poner una primero ## \n");
				
			}
		
			else throw new IllegalArgumentException ("El número no empieza por 6 o 9");
		}
	
	public boolean comprobarTarjeta() {
		if (getTarjeta() == null) {
			System.out.println("##El teléfono no tiene tarjeta## \n");
			return false;		
		}
		else {
			System.out.println("##El teléfono tiene tarjeta## \n");
			return true;
		}
		
	}
	
	
	
	public static void getTotalMoviles(int id) {
		System.out.println(id);
	}
	
	public void mostrarInfoMovil() {
		System.out.println(" - " + marca + ", " + modelo + ", " + color + ", " + tarjeta + ", " + contadorLlamadas);
	}
	
	
	
	
	
	// Getter y Setter 
	
	
	
	public int getid() {
		return id;
	}

	public int getContadorLlamadas() {
		return contadorLlamadas;
	}

	public void setContadorLlamadas(int contadorLlamadas) {
		this.contadorLlamadas = contadorLlamadas;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	
	

}
