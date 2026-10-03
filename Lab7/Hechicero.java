public class Hechicero extends Personaje {
    private int mana;

    public Hechicero(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    @Override
    public void atacar(Personaje objetivo) throws RpgException {
        if (!isEstaVivo()) throw new PersonajeDerrotadoException(getNombre());
        if (mana < 12) throw new RecursoInsuficienteException("mana", mana);
        mana -= 12;
        System.out.println("[" + getNombre() + "] lanza una bola de fuego.");
        if (objetivo != null) objetivo.recibirDanio(50);
    }
}