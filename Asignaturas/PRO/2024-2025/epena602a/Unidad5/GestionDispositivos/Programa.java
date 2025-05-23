import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		// Instanciamos un movil Samsung
		Movil movil1 = new Movil("Samsung", "Galaxy S25", "Negro");

		Tarjeta TarjetaMovistar = new Tarjeta("Orange", "656789098");
		Movil movil2 = new Movil("Apple", "Iphone 15", "Azul");
		movil2.ponerTarjeta(TarjetaMovistar);

		boolean finalizar = false;

		Scanner menu = new Scanner(System.in);

		do {

			System.out.println("########################");
			System.out.println("!!! Menú interactivo !!!");
			System.out.println("########################");
			System.out.println("");
			System.out.println("========================");
			System.out.println("Que desea hacer?");
			System.out.println("========================");

			System.out.println("");
			System.out.println("1 - Poner tarjeta");
			System.out.println("2 - Quitar tarjeta");
			System.out.println("3 - Llamar");
			System.out.println("4 - Mostrar información de los moviles");
			System.out.println("");
			System.out.println("5 - Salir del menú");
			System.out.println("");

			System.out.println("Pulse el número asociado a la opción que desea");
			String entrada = menu.nextLine();

			switch (entrada) {
			case "1":
				System.out.println("Vamos a poner una tarjeta");
				Programa.ponerTarjeta(movil1, movil2);
				break;
			case "2":
				System.out.println("Vamos a quitar una tarjeta");
				Programa.quitarTarjeta(movil1, movil2);
				break;
			case "3":
				System.out.println("Preparandonos para llamar");
				Programa.llamar(movil1, movil2);
				break;
			case "4":

				System.out.println("información del movil1");
				System.out.println(movil1.toString());
				System.out.println("Llamadas realizadas: " + movil1.numeroLlamadas());
				String tarjetaMovil1 = movil1.comprobarTarjeta() ? "SI" : "NO";
				System.out.println("Lleva tarjeta: " + tarjetaMovil1);
				System.out.println("");
				System.out.println("========================");
				System.out.println("");
				System.out.println("información del movil2");
				System.out.println(movil2.toString());
				System.out.println("Llamadas realizadas: " + movil2.numeroLlamadas());
				String tarjetaMovil2 = movil2.comprobarTarjeta() ? "SI" : "NO";
				System.out.println("Lleva tarjeta: " + tarjetaMovil2);
				System.out.println("");
				System.out.println("========================");
				System.out.println("");

				System.out.println("Total de móviles: " + Movil.getTotalMoviles());
				System.out.println("");
				break;
			case "5":
				finalizar = true;
				break;
			}

		} while (finalizar == false);

		System.out.println(" Terminamos el programa ");
	}

	public static Movil seleccionarMovil(Movil movil1, Movil movil2) {
		Scanner seleccionarMovil = new Scanner(System.in);

		System.out.println("========================");
		System.out.println("Seleccione el móvil con el que quiere realizar la acción");
		System.out.println("========================");

		System.out.println("");
		System.out.println("1 - " + movil1.toString());
		System.out.println("2 - " + movil2.toString());
		System.out.println("");

		String movil = seleccionarMovil.nextLine();

		System.out.println("");

		Movil movilSeleccionado = movil.equals("1") ? movil1 : movil2;

		return movilSeleccionado;

	}

	public static void ponerTarjeta(Movil movil1, Movil movil2) {
		Movil movil = Programa.seleccionarMovil(movil1, movil2);

		if (movil.comprobarTarjeta()) {
			System.out.println("El móvil ya tiene una tarjeta y no permite introducir más");
			System.out.println("");
			return;
		}

		Scanner informacionTarjeta = new Scanner(System.in);

		System.out.println("Introduzca el nombre de la compañia");
		String compania = informacionTarjeta.nextLine();

		boolean isValidNumber = false;
		String numero = "";

		do {
			System.out.println("Introduzca el número de teléfono");
			numero = informacionTarjeta.nextLine();
			isValidNumber = Tarjeta.validarNumero(numero);
			if (!isValidNumber) {
				System.out.println("El número introducido no es correcto, repitalo");
				System.out.println("");
			}
		} while (isValidNumber == false);

		Tarjeta nuevaTarjeta = new Tarjeta(compania, numero);

		movil.ponerTarjeta(nuevaTarjeta);

		System.out.println("Hemos puesto la tarjeta");
		System.out.println("");
	}

	public static void quitarTarjeta(Movil movil1, Movil movil2) {
		Movil movil = Programa.seleccionarMovil(movil1, movil2);

		if (!movil.comprobarTarjeta()) {
			System.out.println("El móvil no tiene ninguna tarjeta que quitar");
			System.out.println("");
			return;
		}

		movil.quitarTarjeta();

		System.out.println("Hemos quitado la tarjeta");
		System.out.println("");
	}

	public static void llamar(Movil movil1, Movil movil2) {
		Movil movil = Programa.seleccionarMovil(movil1, movil2);

		if (!movil.comprobarTarjeta()) {
			System.out.println("El móvil no tiene ninguna tarjeta por lo que no se puede realizar la llamada");
			System.out.println("");
			return;
		}

		Scanner destinoLlamada = new Scanner(System.in);

		System.out.println("Nombre de la persona a la que se quiere llamar");
		String destinatario = destinoLlamada.nextLine();
		System.out.println("");

		System.out.println("Número de teléfono al que queremos llamar");
		String numero = destinoLlamada.nextLine();
		System.out.println("");

		movil.llamar(destinatario, numero);

		System.out.println("Llamada a " + destinatario + " finalizada");
		System.out.println("");
	}
}
