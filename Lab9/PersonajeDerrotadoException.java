public class PersonajeDerrotadoException extends RpgException {
    public PersonajeDerrotadoException(String nombrePersonaje) {
        super("El personaje '" + nombrePersonaje + "' está derrotado.");
    }
}