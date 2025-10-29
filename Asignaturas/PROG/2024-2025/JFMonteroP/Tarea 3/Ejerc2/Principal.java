package Ejerc2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//Inicio primer rectángulo.
		Rectangulo objrect1 = new Rectangulo(20, 40);//Creamos el primer objeto de la clase rectángulo.
	
	//Llamada a los métodos del primer objeto.
		System.out.println("\n **Primer rectángulo** \n");
		objrect1.getPerimetro(); //Calculamos el perimetro y debajo el área.
		objrect1.getArea();
		System.out.println(objrect1.toString());
		System.out.println("Es grande el rectángulo: \n-  " + objrect1.isLarge());
	//Fin del primer rectángulo.
		
	//Inicio del segundo objeto.
		Rectangulo objrect2 = new Rectangulo(40, 60);//Creamos el segundo objeto de la clase rectángulo.
		
	//LLamada a los métodos del segundo objeto.
		System.out.println("\n \n **Segundo rectángulo** \n ");
		objrect2.getPerimetro();
		objrect2.getArea();
		System.out.println(objrect2.toString());
		System.out.println("¿Es grande el rectángulo?\n -  " + objrect2.isLarge());	
	//Fin segundo rectángulo.
		
	}

}
