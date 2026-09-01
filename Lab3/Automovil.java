public class Automovil extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Automovil(String marca, String modelo, int ano, double velocidadMaxima, int numPuertas, String tipoCombustible) {
        super(marca, modelo, ano, velocidadMaxima);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumPuertas() { return numPuertas; }
    public void setNumPuertas(int numPuertas) { this.numPuertas = numPuertas; }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    public void tocarClaxon() {
        System.out.println(getMarca() + " " + getModelo() + " dice: ¡Beep beep!");
    }

    @Override
    public String toString() {
        return super.toString() + " | Puertas: " + numPuertas + " | Combustible: " + tipoCombustible;
    }
}