public class AccionInvalidaException extends RpgException {
    private String accion;

    public AccionInvalidaException(String accion, String motivo) {
        super("Acción inválida '" + accion + "': " + motivo);
        this.accion = accion;
    }

    public String getAccion() { return accion; }
}