public class Pajaro extends Animal {
    private boolean puedeVolar;

    public Pajaro(String nombre, int edad, double peso, boolean puedeVolar) {
        super(nombre, edad, peso);
        this.puedeVolar = puedeVolar;
    }

    public boolean isPuedeVolar() { return puedeVolar; }
    public void setPuedeVolar(boolean puedeVolar) { this.puedeVolar = puedeVolar; }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Pío pío!");
    }

    public void volar() {
        if (puedeVolar) {
            System.out.println(getNombre() + " está volando por los cielos.");
        } else {
            System.out.println(getNombre() + " no puede volar.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", ¿Puede volar?: " + (puedeVolar ? "Sí" : "No");
    }
}