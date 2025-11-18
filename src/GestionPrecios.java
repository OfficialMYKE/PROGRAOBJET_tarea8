import java.util.ArrayList;
import java.util.Scanner;

public class GestionPrecios {
    //Arreglo Double
    private ArrayList<Double> precios;
    //Constructor, inicializar precios
    public GestionPrecios() {
        this.precios = new ArrayList<>();
    }

    // Opción 1: Ingresa un precio
    public void ingresarPrecio(Scanner sc) {
        System.out.print("Ingrese el precio: ");
        double precioIngresado;
        precioIngresado = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        if (precioIngresado > 0) {
            this.precios.add(precioIngresado);
            System.out.println("Precio $" + precioIngresado + " agregado correctamente.");
        } else {
            System.out.println("Error: El precio debe ser un número mayor que cero.");
        }
    }

    // Opción 2: Muestra todos los precios
    public void mostrarPrecios() {
        if (this.precios.isEmpty()) {
            System.out.println("No existen precios registrados.");
        } else {
            System.out.println("--- Lista de Precios Registrados ---");
            for (double precio : this.precios) {
                System.out.println("$ " + precio);
            }
        }
    }

    // Opción 3: Encuentra y muestra el precio más alto
    public void precioMasAlto() {
        if (this.precios.isEmpty()) {
            System.out.println("No hay precios para comparar.");
            return;
        }

        double max = this.precios.get(0);
        for (double precio : this.precios) {
            if (precio > max) {
                max = precio;
            }
        }
        System.out.println("El precio más alto es: $" + max);
    }

    // Opción 4: Encuentra y muestra el precio más bajo
    public void precioMasBajo() {
        if (this.precios.isEmpty()) {
            System.out.println("No hay precios para comparar.");
            return;
        }

        double min = this.precios.get(0);
        for (double precio : this.precios) {
            if (precio < min) {
                min = precio;
            }
        }
        System.out.println("El precio más bajo es: $" + min);
    }

    // Opción 5: Muestra los precios que están duplicados
    public void precioIguales() {
        if (this.precios.isEmpty()) {
            System.out.println("No hay precios para comparar.");
            return;
        }

        ArrayList<Double> duplicados = new ArrayList<>();
        boolean encontrado = false;

        for (int i = 0; i < this.precios.size(); i++) {
            double p1 = this.precios.get(i);

            if (duplicados.contains(p1)) continue;

            for (int j = i + 1; j < this.precios.size(); j++) {
                if (p1 == this.precios.get(j)) {
                    duplicados.add(p1);
                    encontrado = true;
                    break;
                }
            }
        }

        if (encontrado) {
            System.out.println("Precios duplicados (iguales) encontrados:");
            System.out.println(duplicados);
        } else {
            System.out.println("No se encontraron precios duplicados.");
        }
    }

    // Opción 6: Busca un precio específico, recibe el Scanner
    public void buscarPrecio(Scanner sc) {
        System.out.print("Ingrese el precio que desea buscar: ");
        double precioBuscado = sc.nextDouble();
        sc.nextLine(); // Consumir el salto de línea

        if (this.precios.contains(precioBuscado)) {
            System.out.println("¡Encontrado! El precio $" + precioBuscado + " sí existe en la lista.");
        } else {
            System.out.println("No encontrado. El precio $" + precioBuscado + " no está en la lista.");
        }
    }
}