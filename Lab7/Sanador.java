public class Sanador extends Personaje {
    public Sanador(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public void atacar(Personaje objetivo) throws RpgException {
        if (!isEstaVivo()) throw new PersonajeDerrotadoException(getNombre());
        System.out.println("[" + getNombre() + "] realiza un ataque sagrado básico.");
        if (objetivo != null) objetivo.recibirDanio(20);
    }
}