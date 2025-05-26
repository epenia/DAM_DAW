package figuras;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=================== OBJETO FIGURA 1 ====================");
		Circulo objCirculo1 = new Circulo();
		
		objCirculo1.setRadio(20);
		
		System.out.println(objCirculo1);
		String isBig1 = (objCirculo1.isBig()) ? "El radio es mayor a 50" : "El radio no es mayor a 50";
		System.out.println(isBig1);

		System.out.println("");
		System.out.println("=================== OBJETO FIGURA 2 ====================");
		Circulo objCirculo2 = new Circulo(60);
		
		
		System.out.println(objCirculo2);
		String isBig2 = (objCirculo2.isBig()) ? "El radio es mayor a 50" : "El radio no es mayor a 50";
		System.out.println(isBig1);
	}

}
