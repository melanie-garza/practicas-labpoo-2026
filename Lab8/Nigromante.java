public class Nigromante extends Personaje {
    private int mana;

    public Nigromante(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    @Override
    public void atacar(Personaje objetivo) throws RpgException {
        if (!isEstaVivo()) {
            throw new PersonajeDerrotadoException(getNombre());
        }
        if (mana < 15) {
            throw new RecursoInsuficienteException("mana", mana);
        }
        mana -= 15;
        System.out.println("[" + getNombre() + "] lanza un rayo de sombras.");
        if (objetivo != null) {
            objetivo.recibirDanio(60);
        }
    }
}