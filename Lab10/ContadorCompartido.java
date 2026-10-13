public class ContadorCompartido {
    private int contador = 0;

    // SIN synchronized - los hilos chocan y pierden datos
    public void incrementar() {
        contador++;
    }

    // CON synchronized - seguro entre hilos
    public synchronized void incrementarSeguro() {
        contador++;
    }

    public int getContador() {
        return contador;
    }

    public void reset() {
        contador = 0;
    }
}