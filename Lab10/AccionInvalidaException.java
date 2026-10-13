public class AccionInvalidaException extends RpgException {
    public AccionInvalidaException(String accion, String motivo) {
        super("Acción inválida '" + accion + "': " + motivo);
    }
}