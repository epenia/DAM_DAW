package Ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Rectangulo cuadrado1 = new Rectangulo();	

//		Creamos rectangulo
		cuadrado1.setAltura(10);
		cuadrado1.setBase(5);
		System.out.println("Area del cuadrado 1: " + cuadrado1.getArea());
		System.out.println("Perímetro del cuadrado 1: " + cuadrado1.getPerimetro());
		
		System.out.println("Resumen cuadrado1:");
		System.out.println(cuadrado1.toString());

		System.out.println("El cuadrado1 es largo?");
		System.out.println(cuadrado1.isLarge());		
		
//		Creamos otro rectangulo
		Rectangulo cuadrado2 = new Rectangulo(598,4);
		System.out.println("Area del cuadrado 2: " + cuadrado2.getArea());
		System.out.println("Perímetro del cuadrado 2: " + cuadrado2.getPerimetro());	
		System.out.println(cuadrado2.toString());	

//		Actualizamos la altura del cuadrado 2
		cuadrado2.setAltura(10);
		System.out.println("Resumen cuadrado2:");
		System.out.println(cuadrado2.toString());

		System.out.println("El cuadrado2 es largo?");
		System.out.println(cuadrado2.isLarge());		
		
	}

}
