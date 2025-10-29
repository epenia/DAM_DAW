package GestionVeh;

public abstract class Vehiculo implements Mantenible{
	
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected int anio;
	protected int kilometros;
	
	
	
	/**
	 * 
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param anio
	 * @param kilometros
	 */
	
	public Vehiculo(String matricula, String marca, String modelo, int anio, int kilometros) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.kilometros = kilometros;
	}
	
	/**
	 * Método que deben implementar cada clase.
	 */
	protected abstract double calcularCostoMantenimiento();
	
	/**
	 * Otro método que devuelve una cadena con la información del vehículo.
	 */
	protected void mostrarInformacion() {
		System.out.println("Matrícula: " + matricula + "\n Marca: " + marca + "\n Modelo: " + modelo + "\n Año matriculación: " + anio + "\n Kilómetros: "
				+ kilometros);
	}
	
	
	/**
	 * Getter y setter
	 * @return los datos de los vehículos.
	 */
	protected String getMatricula() {
		return matricula;
	}


	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	protected String getMarca() {
		return marca;
	}


	protected void setMarca(String marca) {
		this.marca = marca;
	}


	protected String getModelo() {
		return modelo;
	}


	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}


	protected int getAnio() {
		return anio;
	}


	protected void setAnio(int anio) {
		this.anio = anio;
	}


	protected int getKilometros() {
		return kilometros;
	}


	protected void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	
	

}
