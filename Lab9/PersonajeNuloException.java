public class PersonajeNuloException extends RuntimeException {
    public PersonajeNuloException(String accion) {
        super("Error: El personaje objetivo no puede ser nulo.");
    }
}