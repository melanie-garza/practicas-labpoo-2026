public class RecursoInsuficienteException extends RpgException {
    private String recurso;
    private int disponible;

    public RecursoInsuficienteException(String recurso, int disponible) {
        super("Recurso insuficiente: " + recurso + ". Disponible: " + disponible);
        this.recurso = recurso;
        this.disponible = disponible;
    }

    public String getRecurso() { return recurso; }
    public int getDisponible() { return disponible; }
}