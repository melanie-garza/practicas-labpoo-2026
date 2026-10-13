public class Arquero extends Personaje {
    private String tipoArco;
    private int flechas;
    private int precision;

    public Arquero(String nombre, int nivel, int puntosVida, String tipoArco, int flechas, int precision) {
        super(nombre, nivel, puntosVida);
        this.tipoArco = tipoArco;
        this.flechas = flechas;
        this.precision = precision;
    }

    @Override
    public void atacar(Personaje objetivo) throws RpgException {
        if (!isEstaVivo()) throw new PersonajeDerrotadoException(getNombre());
        if (flechas <= 0) throw new RecursoInsuficienteException("flechas", flechas);
        flechas--;
    }
}