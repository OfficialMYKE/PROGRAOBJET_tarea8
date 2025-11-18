public class Atleta extends Participante {

    private String disciplina;

    public Atleta(String nombre, String disciplina) {
        super(nombre);
        this.disciplina = disciplina;
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Soy un ATLETA. Disciplina: " + this.disciplina);
    }
}