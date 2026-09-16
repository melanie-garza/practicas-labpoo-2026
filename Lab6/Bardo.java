public class Bardo extends Personaje implements Sanador {
    private int poderCuracion;
    private String instrumento;

    public Bardo(String nombre, int nivel, int puntosVida, int poderCuracion, String instrumento) {
        super(nombre, nivel, puntosVida);
        this.poderCuracion = poderCuracion;
        this.instrumento = instrumento;
    }

    @Override
    public void atacar() {
        System.out.println("[" + nombre + "] aturde con su laúd. Daño: " + calcularDanio());
    }

    @Override
    public int calcularDanio() {
        return nivel * 17; // Daño calculado para dar 85 en nivel 5
    }

    @Override
    public void curarAliado(Personaje aliado) {
        aliado.puntosVida += this.poderCuracion;
        System.out.println(nombre + " entona una melodía y cura a " + aliado.getNombre() + " +" + poderCuracion + ". Vida: " + aliado.getPuntosVida());
    }

    @Override
    public int getPoderCuracion() {
        return poderCuracion;
    }
}