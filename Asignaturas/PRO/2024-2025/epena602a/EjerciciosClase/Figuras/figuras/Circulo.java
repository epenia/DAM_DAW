package figuras;

public class Circulo {
	
	float PI = 3.14165f;
	
	private int radio;
	
	public Circulo() {
		radio = 0;
	}
	
	public Circulo(int radio) {
		this.radio = radio;
	}
	
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public int getRadio() {
		return this.radio;
	}
	
	public float getArea() {
		return (this.radio*this.radio)*PI;
	}
		
	public String toString() {
		return "El area es: " + this.getArea() + " y su radio: " + this.radio;
	}
	
	public boolean isBig() {
		return (this.radio > 50);
	}
	
}
