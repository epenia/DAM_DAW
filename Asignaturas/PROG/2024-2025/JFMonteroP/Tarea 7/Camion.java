package GestionVeh;

public class Camion extends Vehiculo {

	private int peso = 0;
	protected double costeMantenimiento = 0;
	
	public Camion(String matricula, String marca, String modelo, int anio, int kilometros, int peso) {
		super(matricula, marca, modelo, anio, kilometros);
		this.peso = peso;
	}

	

	@Override
	protected double calcularCostoMantenimiento() {
		if (peso < 10) {
			costeMantenimiento = (kilometros*0.08)+200;
			return costeMantenimiento;
		}
		else {
			costeMantenimiento = (kilometros*0.10)+300;
		return costeMantenimiento;
		}
	}
	
	
	@Override
	public void realizarMantenimiento() {
		System.out.println("El vehículo esta recibiendo el mantenimiento, calculando coste:" + calcularCostoMantenimiento() + "€");
		System.out.println("\n Mantenimiento realizado \n");
	}



	protected int getPeso() {
		return peso;
	}



	protected void setPeso(int peso) {
		this.peso = peso;
	}



	protected double getCosteMantenimiento() {
		return costeMantenimiento;
	}



	protected void setCosteMantenimiento(double costeMantenimiento) {
		this.costeMantenimiento = costeMantenimiento;
	}
	
	
	
}
