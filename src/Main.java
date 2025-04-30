import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEquipos gestor = new GestorEquipos();

        while (true) {
            System.out.println("\n---- GESTIÓN DE EQUIPOS ----");
            System.out.println("1. Registrar equipo");
            System.out.println("2. Añadir jugador a equipo");
            System.out.println("3. Consultar lista de equipos y jugadores");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del equipo: ");
                    String nombreEquipo = scanner.nextLine();
                    gestor.registrarEquipo(nombreEquipo);
                    System.out.println("✅ Equipo registrado.");
                    break;
                case 2:
                    System.out.print("Nombre del equipo: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Nombre del jugador: ");
                    String jugadorNombre = scanner.nextLine();
                    System.out.print("Nickname del jugador: ");
                    String nickname = scanner.nextLine();
                    System.out.print("Edad del jugador: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    Jugador nuevoJugador = new Jugador(jugadorNombre, nickname, edad);
                    gestor.añadirJugadorAEquipo(nombre, nuevoJugador);
                    break;
                case 3:
                    for (Equipo e : gestor.consultarEquiposYJugadores()) {
                        System.out.println(e);
                    }
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Opción no válida.");
            }
        }
    }
}
