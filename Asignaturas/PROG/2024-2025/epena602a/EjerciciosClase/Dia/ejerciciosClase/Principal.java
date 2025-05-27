package ejerciciosClase;

import ejerciciosClase.Dia.enumMeses;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=================== OBJETO DIA 1 ====================");
		Dia objDia1 = new Dia(enumMeses.abril);
		
		objDia1.setDia(20);
		objDia1.setAnio(2024);
		
		System.out.println(objDia1);
		String isVerano1 = (objDia1.isSummer()) ? "Es verano" : "No es verano";
		System.out.println(isVerano1);

		System.out.println("");
		System.out.println("=================== OBJETO DIA 2 ====================");
		Dia objDia2 = new Dia(enumMeses.agosto);		
		
		objDia2.setDia(20);
		objDia2.setAnio(2024);
		
		String isVerano2 = (objDia2.isSummer()) ? "Es verano" : "No es verano";
		
		System.out.println("Fecha larga: " + objDia2);
		System.out.println(isVerano2);
	}

}
