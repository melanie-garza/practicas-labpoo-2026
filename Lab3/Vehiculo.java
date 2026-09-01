public class Vehiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadMaxima;

    public Vehiculo(String marca, String modelo, int ano, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
        setVelocidadMaxima(velocidadMaxima);
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) {
        if (ano > 1885 && ano <= 2027) {
            this.ano = ano;
        } else {
            System.out.println("Error: Año inválido (" + ano + "). Se asignará 2020 por defecto.");
            this.ano = 2020;
        }
    }

    public double getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("Error: La velocidad máxima debe ser mayor a 0.");
            this.velocidadMaxima = 1.0;
        }
    }

    public void acelerar() {
        System.out.println("El vehículo " + marca + " " + modelo + " está acelerando.");
    }

    public void frenar() {
        System.out.println("El vehículo " + marca + " " + modelo + " ha frenado.");
    }

    @Override
    public String toString() {
        return "Marca: " + marca + " | Modelo: " + modelo + " | Año: " + ano + " | Vel. Máx: " + velocidadMaxima + " km/h";
    }
}