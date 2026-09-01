public class Barco extends Vehiculo {
    private double eslora;
    private String tipoPropulsion;

    public Barco(String marca, String modelo, int ano, double velocidadMaxima, double eslora, String tipoPropulsion) {
        super(marca, modelo, ano, velocidadMaxima);
        this.eslora = eslora;
        this.tipoPropulsion = tipoPropulsion;
    }

    public double getEslora() { return eslora; }
    public void setEslora(double eslora) { this.eslora = eslora; }

    public String getTipoPropulsion() { return tipoPropulsion; }
    public void setTipoPropulsion(String tipoPropulsion) { this.tipoPropulsion = tipoPropulsion; }

    public void anclar() {
        System.out.println("El barco " + getMarca() + " " + getModelo() + " ha soltado el ancla.");
    }

    @Override
    public String toString() {
        return super.toString() + " | Eslora: " + eslora + " m | Propulsión: " + tipoPropulsion;
    }
}