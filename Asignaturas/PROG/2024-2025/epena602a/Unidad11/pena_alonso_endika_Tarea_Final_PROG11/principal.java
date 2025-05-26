import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Videojuegos juegos = new Videojuegos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Videojuegos ---");
            System.out.println("1. Insertar juego");
            System.out.println("2. Actualizar horas jugadas");
            System.out.println("3. Eliminar juego");
            System.out.println("4. Listar todos los juegos");
            System.out.println("5. Listar juegos por plataforma");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Plataforma: ");
                    String plataforma = scanner.nextLine();
                    System.out.print("Año de lanzamiento: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Compañía: ");
                    String compania = scanner.nextLine();
                    System.out.print("Horas jugadas: ");
                    int horas = scanner.nextInt();
                    scanner.nextLine(); 
                    juegos.insertarJuego(titulo, plataforma, anio, compania, horas);
                    break;
                case 2:
                    System.out.print("Título del juego: ");
                    String tituloActualizar = scanner.nextLine();
                    System.out.print("Nuevas horas jugadas: ");
                    int nuevasHoras = scanner.nextInt();
                    scanner.nextLine();
                    juegos.actualizarHorasJugadas(tituloActualizar, nuevasHoras);
                    break;
                case 3:
                    System.out.print("Título del juego a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    juegos.eliminarJuego(tituloEliminar);
                    break;
                case 4:
                    juegos.listarTodosLosJuegos();
                    break;
                case 5:
                    System.out.print("Plataforma: ");
                    String plataformaBuscar = scanner.nextLine();
                    juegos.listarPorPlataforma(plataformaBuscar);
                    break;
                case 6:
                    System.out.println("Programa terminado...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
