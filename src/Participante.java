import java.util.ArrayList;

public abstract class Participante {

    protected String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void mostrarTipo();
}