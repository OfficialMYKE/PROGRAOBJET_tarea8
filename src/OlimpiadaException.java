// REQUERIMIENTO 6: Excepción personalizada
public class OlimpiadaException extends Exception {

    // Un constructor que recibe el mensaje de error
    public OlimpiadaException(String mensaje) {
        super(mensaje);
    }
}