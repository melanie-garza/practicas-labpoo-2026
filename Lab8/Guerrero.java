public class Guerrero extends Personaje {
    private String arma;
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosVida, String arma, int fuerza) {
        super(nombre, nivel, puntosVida);
        this.arma = arma;
        this.fuerza = fuerza;
    }

    @Override
    public void atacar(Personaje objetivo) throws RpgException {
        if (!isEstaVivo()) {
            throw new PersonajeDerrotadoException(getNombre());
        }
        System.out.println("[" + getNombre() + "] ataca con " + arma + " causando gran impacto.");
        if (objetivo != null) {
            objetivo.recibirDanio(fuerza);
        }
    }
}