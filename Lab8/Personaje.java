public abstract class Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;
    private boolean estaVivo;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.estaVivo = puntosVida > 0;
    }

    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getPuntosVida() { return puntosVida; }
    public boolean isEstaVivo() { return estaVivo; }

    public abstract void atacar(Personaje objetivo) throws RpgException;

    public void recibirDanio(int danio) throws AccionInvalidaException {
        if (danio < 0) {
            throw new AccionInvalidaException("recibirDanio", "El daño no puede ser negativo: " + danio);
        }
        this.puntosVida -= danio;
        if (this.puntosVida <= 0) {
            this.puntosVida = 0;
            this.estaVivo = false;
        }
        System.out.println(nombre + " recibe " + danio + " de daño. Vida: " + puntosVida);
        if (!estaVivo) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }

    public void curar(int cantidad) {
        this.puntosVida += cantidad;
        System.out.println(nombre + " se ha curado +" + cantidad + " puntos de vida. Vida actual: " + puntosVida);
    }
}