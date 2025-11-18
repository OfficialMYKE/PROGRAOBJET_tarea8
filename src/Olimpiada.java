import java.util.ArrayList;

public class Olimpiada {

    private String nombre;
    private String sede;
    private ArrayList<Evento> eventos;

    public Olimpiada(String nombre, String sede) {
        this.nombre = nombre;
        this.sede = sede;
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento e) {
        this.eventos.add(e);
        System.out.println("Evento '" + e.getNombreEvento() + "' registrado en " + this.nombre);
    }

    public void mostrarEventos() {
        System.out.println("--- Eventos de " + this.nombre + " (" + this.sede + ") ---");
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos registrados.");
            return;
        }
        for (Evento e : eventos) {
            System.out.println("- " + e.getNombreEvento());
        }
    }

    public Evento buscarEvento(String nombre) throws OlimpiadaException {
        for (Evento e : eventos) {
            if (e.getNombreEvento().equalsIgnoreCase(nombre)) {
                return e;
            }
        }

        throw new OlimpiadaException("Error: El evento '" + nombre + "' no fue encontrado.");
    }
}