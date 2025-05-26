package Ejercicio1;

public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private Persona titular;
	private int capacidad;
	private double estadoDeposito;
	private double gastoEuros;
	private double gastoLitros;
	private int kmTotales;
	private int viajesRealizados;

	// Genero un constructor en el que se pide la capacidad del coche y el gasto
	// cada 100km
	public Coche(String marca, String modelo, String matricula, Persona titular, int capacidad, double gastoLitros) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.titular = titular;

		this.capacidad = capacidad;
		this.gastoLitros = gastoLitros;

		// Establecemos estado del deposito igual que la capacidad
		this.estadoDeposito = capacidad;

	}

	public void realizarViaje(double km) {
		// Actualizamos los kilometros totales recorridos
		this.kmTotales += km;

		// Añadimos 1 viaje al contador de viajes realizados
		this.viajesRealizados++;

		// Calculamos gasto de combustible asumimos que el gastoLitros es cada 100
		// kilometros
		double combustibleConsumido = (km * this.gastoLitros) / 100;
		this.estadoDeposito -= combustibleConsumido;
	}

	public void respostarCombustible(double litros, double precioPorLitro) {

		double litrosNuevosTotales = litros + this.estadoDeposito;

		// Contabilizamos los litros introducidos.
		// Si los listros que vamos a introducir supera a la capacidad, solamente nos
		// quedamos con la diferencia entre el estado del deposito y la capacidad del
		// mismo
		double litrosAnadidos = (litrosNuevosTotales > this.capacidad) ? this.capacidad - this.estadoDeposito : litros;

		// Si la capacidad de litros que introducimos + la que nos queda en el deposito
		// supera la capacidad maxima
		// establecemos el estadoDeposito al máximo.
		this.estadoDeposito = (litrosNuevosTotales > this.capacidad) ? this.capacidad : litrosNuevosTotales;

		this.gastoEuros += (litrosAnadidos * precioPorLitro);
	}

	public void mostrarInformacion() {
		System.out.println("========================================");
		System.out.println("Información del coche de: " + this.titular.toString());
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Capacidad: " + this.capacidad);
		System.out.println("Consumo medio: " + this.gastoLitros);

		System.out.println("========================================");
		System.out.println("KM totales: " + this.kmTotales);
		System.out.println("Viajes realizados: " + this.viajesRealizados);

		System.out.println("========================================");
		System.out.printf("Combustible restante: %2.2f Litros %n", this.estadoDeposito);

		System.out.println("========================================");
		System.out.printf("Coste total en euros: %2.2f€ %n", this.gastoEuros);
	}
}
