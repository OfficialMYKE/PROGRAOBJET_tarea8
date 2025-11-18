import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Olimpiada misJuegos = new Olimpiada("Juegos Mundiales 2025", "Quito");

        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        registrarEvento(misJuegos, sc);
                        break;
                    case 2:
                        registrarParticipante(misJuegos, sc);
                        break;
                    case 3:
                        misJuegos.mostrarEventos();
                        break;
                    case 4:
                        consultarParticipantesDeEvento(misJuegos, sc);
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (OlimpiadaException e) {
                System.out.println("ERROR: " + e.getMessage());
            }

            System.out.println();

        } while (opcion != 5);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("===== GESTIÓN OLIMPIADA =====");
        System.out.println("1. Registrar nuevo Evento");
        System.out.println("2. Registrar Participante en Evento");
        System.out.println("3. Ver todos los Eventos");
        System.out.println("4. Consultar Participantes de un Evento");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void registrarEvento(Olimpiada olimpiada, Scanner sc) {
        System.out.print("Ingrese nombre del nuevo evento: ");
        String nombre = sc.nextLine();

        Evento nuevoEvento = new Evento(nombre);
        olimpiada.agregarEvento(nuevoEvento);
    }

    public static void registrarParticipante(Olimpiada olimpiada, Scanner sc) throws OlimpiadaException {
        System.out.print("Nombre del evento donde desea registrarlo: ");
        String nombreEvento = sc.nextLine();

        Evento evento = olimpiada.buscarEvento(nombreEvento);

        System.out.print("Tipo de participante (1: Atleta, 2: Equipo): ");
        int tipo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre del participante: ");
        String nombreParticipante = sc.nextLine();

        Participante p;

        if (tipo == 1) {
            System.out.print("Disciplina del atleta: ");
            String disciplina = sc.nextLine();
            p = new Atleta(nombreParticipante, disciplina);
        } else {
            System.out.print("Número de miembros del equipo: ");
            int miembros = sc.nextInt();
            sc.nextLine();
            p = new Equipo(nombreParticipante, miembros);
        }

        evento.agregarParticipante(p);
        System.out.println("¡Participante '" + p.getNombre() + "' registrado en '" + evento.getNombreEvento() + "'!");
    }

    public static void consultarParticipantesDeEvento(Olimpiada olimpiada, Scanner sc) throws OlimpiadaException {
        System.out.print("Nombre del evento que desea consultar: ");
        String nombreEvento = sc.nextLine();

        Evento evento = olimpiada.buscarEvento(nombreEvento);

        evento.mostrarParticipantes();
    }
}