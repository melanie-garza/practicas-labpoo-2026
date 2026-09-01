public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, double peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau guau!");
    }

    public void perseguirCola() {
        System.out.println(getNombre() + " está persiguiendo su propia cola.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Raza: " + raza;
    }
}