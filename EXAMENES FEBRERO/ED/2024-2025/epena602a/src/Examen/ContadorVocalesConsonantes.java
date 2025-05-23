package Examen;

public class ContadorVocalesConsonantes {
	
	public static int contarVocales(String texto) {
		if (texto == null || texto.isEmpty()) {
			return 0;
		}

		int contador = 0;
		texto = texto.toLowerCase();

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				contador++;
			}
		}

		return contador;
	}

	public static int contarConsonantes(String texto) {
		if (texto == null || texto.isEmpty()) {
			return 0;
		}

		int contador = 0;
		texto = texto.toLowerCase();

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (Character.isLetter(c) && (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')) {
				contador++;
			}
		}

		return contador;
	}

}
