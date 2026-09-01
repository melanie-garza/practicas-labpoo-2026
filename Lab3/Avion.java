public class Avion extends Vehiculo {
    private double altitudMaxima;
    private int numMotores;

    public Avion(String marca, String modelo, int ano, double velocidadMaxima, double altitudMaxima, int numMotores) {
        super(marca, modelo, ano, velocidadMaxima);
        this.altitudMaxima = altitudMaxima;
        this.numMotores = numMotores;
    }

    public double getAltitudMaxima() { return altitudMaxima; }
    public void setAltitudMaxima(double altitudMaxima) { this.altitudMaxima = altitudMaxima; }

    public int getNumMotores() { return numMotores; }
    public void setNumMotores(int numMotores) { this.numMotores = numMotores; }

    public void despegar() {
        System.out.println("El avión " + getMarca() + " " + getModelo() + " está despegando hacia los " + altitudMaxima + " metros.");
    }

    @Override
    public String toString() {
        return super.toString() + " | Altitud Máx: " + altitudMaxima + " m | Motores: " + numMotores;
    }
}