
public class Tarjeta {
	private String compania;
	private String numero;

	public Tarjeta() {
		this.compania = "movistar";
		this.numero = "600600654";
	}

	public Tarjeta(String compania, String numero) {
		this.compania = compania;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Compañia: " + this.compania + ", Número: " + this.numero;
	}
	
	public static boolean validarNumero(String numero) {
		if (numero.length() != 9) {
			return false;
		}
		
		return numero.matches("^[6-9]\\d{8}");
	}
}
