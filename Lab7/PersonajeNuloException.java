public class PersonajeNuloException extends RuntimeException {
    public PersonajeNuloException(String accion) {
        super("Error en " + accion + ": El personaje objetivo no puede ser nulo.");
    }
}