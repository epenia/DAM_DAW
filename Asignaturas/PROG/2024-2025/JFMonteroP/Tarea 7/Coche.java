package GestionVeh;


/**
 * Clase Coche Hija de Vehículo
 */
public class Coche extends Vehiculo {
	
	private String combustible;
	protected double costeMantenimiento = 0;

	public Coche(String matricula, String marca, String modelo, int anio, int kilometros, String combustible) {
		super(matricula, marca, modelo, anio, kilometros);
		this.combustible = combustible;
	}

	
	/**
	 * Método heredado de la clase Vehiculo.
	 */
	@Override
	protected double calcularCostoMantenimiento() {
		if (this.combustible.equalsIgnoreCase("diesel") || this.combustible.equalsIgnoreCase("gasolina")) {
			costeMantenimiento = (this.kilometros*0.05)+100;
			return costeMantenimiento;
		}
		else if (this.combustible.equalsIgnoreCase("electrico")){
			costeMantenimiento = (this.kilometros*0.03)+50;
			return costeMantenimiento;
		}
		else return 0;
		
		
	}
	
	/**
	 * Interface Mantenible.
	 */
	
	@Override
	public void realizarMantenimiento() {
		System.out.println("El vehículo esta recibiendo el mantenimiento, calculando coste: " + calcularCostoMantenimiento() + "€");
		System.out.println("\n Mantenimiento realizado \n");
	}

	/**
	 * Getter y Setter
	 * @return
	 */

	protected String getCombustible() {
		return combustible;
	}


	protected void setCombustible(String combustible) {
		this.combustible = combustible;
	}


	protected double getCosteMantenimiento() {
		return costeMantenimiento;
	}


	protected void setCosteMantenimiento(double costeMantenimiento) {
		this.costeMantenimiento = costeMantenimiento;
	}
	
	
}
