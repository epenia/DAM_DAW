package Ejerc2;

public class Rectangulo {
	//Declaramos las variables del rectángulo.
	private int altura;
	private int base;
	private float area;
	private float perimetro;
	
	//Constructor vacio declarando las variables a 0.
	public Rectangulo() {
		super();
		this.altura = 0;
		this.base = 0;
	}
	
	//Constructor con las variables iniciadas.
	public Rectangulo(int altura, int base) {
		super();
		this.altura = altura;
		this.base = base;
	}
	
	
	//GETTERs Y SETTERs
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	public void setArea(float area) {
		this.area = area;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	
	
	
	//Métodos.
	
	public float getArea() {
		return this.area = (this.base*this.altura);
	}
	
	public float getPerimetro() {
		return this.perimetro = (2 * (this.base + this.altura));
	}
	
	public String toString() {
		return ("La altura del rectángulo es: " + this.altura + " la base es: " + this.base + " El área es: " + this.area
				+ " el perímetro es: " + this.perimetro);
	}
	
	public boolean isLarge() {
		boolean grande = (this.area > 1000);
		return grande;
	}
		
	
}
