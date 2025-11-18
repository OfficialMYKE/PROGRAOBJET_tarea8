import java.util.Scanner;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestionPrecios gestion = new GestionPrecios();

        int opcion;

        do {
            mostrarMenu();

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    gestion.ingresarPrecio(sc);
                    break;
                case 2:
                    gestion.mostrarPrecios();
                    break;
                case 3:
                    gestion.precioMasAlto();
                    break;
                case 4:
                    gestion.precioMasBajo();
                    break;
                case 5:
                    gestion.precioIguales();
                    break;
                case 6:
                    gestion.buscarPrecio(sc);
                    break;
                case 7:
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

            System.out.println();

        } while (opcion != 7);

        sc.close(); // Cerramos el scanner al final
    }

    private static void mostrarMenu() {
        System.out.println("===== MENÚ DE PRECIOS INMOBILIARIOS =====");
        System.out.println("1. Ingresar precio");
        System.out.println("2. Mostrar todos los precios");
        System.out.println("3. Mostrar precio más alto");
        System.out.println("4. Mostrar precio más bajo");
        System.out.println("5. Mostrar precios duplicados (iguales)");
        System.out.println("6. Buscar un precio específico");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }
