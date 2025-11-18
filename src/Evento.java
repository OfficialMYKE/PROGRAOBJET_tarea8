import java.util.ArrayList;

public class Evento {

    private String nombreEvento;
    private ArrayList<Participante> participantes;

    public Evento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
        this.participantes = new ArrayList<>();
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void agregarParticipante(Participante p) {
        this.participantes.add(p);
    }

    public void mostrarParticipantes() {
        System.out.println("--- Participantes del Evento: " + this.nombreEvento + " ---");
        if (participantes.isEmpty()) {
            System.out.println("No hay participantes registrados en este evento.");
            return;
        }

        for (Participante p : participantes) {
            System.out.print("Nombre: " + p.getNombre() + " -> ");

            p.mostrarTipo();
        }
    }
}