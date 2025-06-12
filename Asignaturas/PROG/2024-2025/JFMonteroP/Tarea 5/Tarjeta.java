package Tarea05;

public class Tarjeta {
	
	private String compania;
	private String numero;
	
	public Tarjeta() {
		super();
		this.compania = "Yoigo";
		this.numero = "661234678";
	}
	
	public Tarjeta(String compania, String numero) {
		super();
		this.compania = compania;
		this.numero = numero;
	}
	
	//Métodos;
	
	@Override  
	public String toString() {
		return "compania: " + compania + ", numero: " + numero;
	}
	
	public static void validarNumero(String numero) {
		if (numero.startsWith("6") || numero.startsWith("9")) {
			System.out.println("El número es válido");
		}
		else {
			throw new IllegalArgumentException("El número introducido no es válido");
		}
	}
	
	
	//Getter y Setter;
	
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	

	
}
