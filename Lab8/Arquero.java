public class Arquero extends Personaje {
    private String tipoArco;
    private int flechasDisponibles;
    private int precision;

    public Arquero(String nombre, int nivel, int puntosVida, String tipoArco, int flechasDisponibles, int precision) {
        super(nombre, nivel, puntosVida);
        this.tipoArco = tipoArco;
        this.flechasDisponibles = flechasDisponibles;
        this.precision = precision;
    }

    @Override
    public void atacar(Personaje objetivo) throws RpgException {
        if (!isEstaVivo()) {
            throw new PersonajeDerrotadoException(getNombre());
        }
        if (flechasDisponibles <= 0) {
            throw new RecursoInsuficienteException("flechas", flechasDisponibles);
        }
        flechasDisponibles--;
        System.out.println("[" + getNombre() + "] dispara una flecha. Flechas restantes: " + flechasDisponibles);
        if (objetivo != null) {
            objetivo.recibirDanio(45);
        }
    }
}