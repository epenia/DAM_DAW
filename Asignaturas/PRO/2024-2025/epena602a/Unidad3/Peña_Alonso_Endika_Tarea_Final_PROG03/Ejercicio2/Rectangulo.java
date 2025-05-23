package Ejercicio2;

public class Rectangulo {

	private int base;
	private int altura;

	public Rectangulo() {
		this.base = 0;
		this.altura = 0;
	}

	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public float getArea() {
		return this.altura * this.base;
	}

	public float getPerimetro() {
		return (this.altura * 2) + (this.base * 2);
	}

	public boolean isLarge() {
		return this.getArea() > 1000;
	}

	public String toString() {
		return "Base: " + this.base + " Altura: " + this.altura + " El area es: " + this.getArea() + " y el perímetro es: " + this.getPerimetro();
	}
}
