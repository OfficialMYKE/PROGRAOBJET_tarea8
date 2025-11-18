public class Equipo extends Participante {

    private int numMiembros;

    public Equipo(String nombre, int numMiembros) {
        super(nombre);
        this.numMiembros = numMiembros;
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Somos un EQUIPO. Miembros: " + this.numMiembros);
    }
}