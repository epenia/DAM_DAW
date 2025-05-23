package Examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContadorVocalesConsonantesTest {

	@Test
	public void testContarVocalesVacio() {
		String texto = "";
		
		int expected = 0;
		int result = ContadorVocalesConsonantes.contarConsonantes(texto);
		
		assertEquals("El resultado esperado es: " + expected, expected, result);
	}
	
	@Test
	public void testContarVocalesNull() {
		String texto = null;
		
		int expected = 0;
		int result = ContadorVocalesConsonantes.contarConsonantes(texto);
		
		assertEquals("El resultado esperado es: " + expected, expected, result);
	}
	
	@Test
	public void testContarVocalesOK() {
		String texto = "aeiou oelo";
		
		int expected = 8;
		int result = ContadorVocalesConsonantes.contarVocales(texto);
		
		assertEquals("El resultado esperado es: " + expected, expected, result);
	}

	@Test
	public void testContarConsonantesVacio() {
		String texto = "";
		
		int expected = 0;
		int result = ContadorVocalesConsonantes.contarVocales(texto);
		
		assertEquals("El resultado esperado es: " + expected, expected, result);
	}
	

	@Test
	public void testContarConsonantesNull() {
		String texto = null;
		
		int expected = 0;
		int result = ContadorVocalesConsonantes.contarVocales(texto);
		
		assertEquals("El resultado esperado es: " + expected, expected, result);
	}

	@Test
	public void testContarConsonantesOK() {
		String texto = "aeiou oelo";
		
		int expected = 1;
		int result = ContadorVocalesConsonantes.contarConsonantes(texto);
		
		assertEquals("El resultado esperado es: " + expected, expected, result);
	}

	@Test
	public void testContarConsonantesSoloVocales() {
		String texto = "aeiou oeo";
		
		int expected = 0;
		int result = ContadorVocalesConsonantes.contarConsonantes(texto);
		
		assertEquals("El resultado esperado es: " + expected, expected, result);
	}
	

}
