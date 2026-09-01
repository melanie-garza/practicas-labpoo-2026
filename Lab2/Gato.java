public class Gato extends Animal {
    private String colorPelaje;

    public Gato(String nombre, int edad, double peso, String colorPelaje) {
        super(nombre, edad, peso);
        this.colorPelaje = colorPelaje;
    }

    public String getColorPelaje() { return colorPelaje; }
    public void setColorPelaje(String colorPelaje) { this.colorPelaje = colorPelaje; }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau miau!");
    }

    public void treparArbol() {
        System.out.println(getNombre() + " está trepando a un árbol.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Color de pelaje: " + colorPelaje;
    }
}