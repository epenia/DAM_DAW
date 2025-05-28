package Ejerc1;

public class Coche {
	
	// Creamos los Atributos
	private String matricula;
	private String marca;
	private String modelo;
	private String titular;
	private double capacidad;
	private double estadoDeposito;
	private double consumo;
	private double gastoEuros;
	private double gastoLitros;
	private double kmTotales;
	private static int viajesRealizados;
	private static int repostajesRealizados;
	
	//Creamos los constructores, uno vacio.
	public Coche() {
		super();
	}
	
	public Coche (String matricula, String marca, String modelo, String titular, double capacidad, double consumo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.titular = titular;
		this.capacidad = capacidad;
		this.estadoDeposito = capacidad;
		this.consumo = consumo;
	}
	
	//Métodos
	
	public void realizarViaje (double km) { //Método para realizar el viaje.
		viajesRealizados ++;
		String viaje = ("**** Viaje nº ****\n" + viajesRealizados);
		this.kmTotales = this.kmTotales + km;
		this.gastoLitros = (this.consumo)*(km/100);
		this.estadoDeposito = this.capacidad - this.gastoLitros; 
		this.estadoDeposito = this.capacidad - this.gastoLitros;
		System.out.println(viaje);
		
	}
	
	
	public void repostarCombustible(double litros, double precioPorLitro) { //Método para el repostaje.
		repostajesRealizados ++;
		this.estadoDeposito = this.estadoDeposito + litros;
		this.gastoEuros = litros * precioPorLitro;
		System.out.println("***** Repostaje del Vehículo***** \n");
		if (this.estadoDeposito > this.capacidad) {
			System.out.println("***No se puede repostar esa cantidad sobre pasa la capacidad teniendo\n en cuenta"
					+ " el gasto de combustible y la capacidad del deposito*** \n");
		}
		else System.out.println("Cantidad Repostada \n");
	}

	public void mostrarInformacion() {
		System.out.println("************** DATOS DEL VEHÍCULO ***************");
		System.out.println();
		System.out.println("La matrícula del coche es: " + matricula);
		System.out.println("La marca del coche es: " + marca);
		System.out.println("El modelo del coche es: " + modelo);
		System.out.println("El titular del vehículo es: " + titular);
		System.out.println("La capacidad del deposito es: " + capacidad);
		System.out.println("El estado del deposito es: " + estadoDeposito);
		System.out.println("El consumo de combustible es: " + consumo + " Litros/100km");
		System.out.println("El gasto de Dinero es: " + gastoEuros + "€");
		System.out.println("El gasto de litros totales es: " + gastoLitros);
		System.out.println("Los km Totales de los viajes son: " + kmTotales + "km");
		System.out.println("El número de viajes realizados es: " + viajesRealizados);
		System.out.println("El número de repostajes realizados es: " + repostajesRealizados);
		System.out.println();
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	
	
}
