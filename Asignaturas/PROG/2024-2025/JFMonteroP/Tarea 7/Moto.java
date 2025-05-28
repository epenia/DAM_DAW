package GestionVeh;

/**
 * Clase Moto, Hija de la Clase Vehículo.
 */
public class Moto extends Vehiculo {
	
	/*
	 * Atributos de la Clase Moto
	 */
	private int cilindrada;
	protected double costeMantenimiento = 0;

	public Moto(String matricula, String marca, String modelo, int anio, int kilometros, int cilindrada) {
		super(matricula, marca, modelo, anio, kilometros);
		this.cilindrada = cilindrada;
	}

	
	/**
	 * Método de la Clase Vehículo, implementado en la clase hija.
	 */
	@Override
	protected double calcularCostoMantenimiento() {
		if (cilindrada < 250) {
			costeMantenimiento = (kilometros*0.03)+50;
			return costeMantenimiento;
		}
		else {
			costeMantenimiento = (kilometros*0.05)+80;
			return costeMantenimiento;
		}
	}	
	
	/**
	 * Método de la interface.
	 */
	@Override
	public void realizarMantenimiento() {
		System.out.println("El vehículo esta recibiendo el mantenimiento, calculando coste: " + calcularCostoMantenimiento() + "€");
		System.out.println("\n Mantenimiento realizado \n");
	}


	/**
	 * Getter y Seter
	 */
	protected int getCilindrada() {
		return cilindrada;
	}



	protected void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}



	protected double getCosteMantenimiento() {
		return costeMantenimiento;
	}



	protected void setCosteMantenimiento(double costeMantenimiento) {
		this.costeMantenimiento = costeMantenimiento;
	}
	
	
}
