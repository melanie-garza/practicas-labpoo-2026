public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];
        
        animales[0] = new Perro("Firulais", 3, 14.5, "Labrador");
        animales[1] = new Gato("Michi", 2, 4.0, "Blanco");
        animales[2] = new Pajaro("Piolín", 1, 0.1, true);

        for (Animal a : animales) {
            System.out.println("-----------------------------------");
            System.out.println(a.toString());
            a.comer();
            a.hacerSonido();
            
            // Comportamientos específicos usando polimorfismo/instancias
            if (a instanceof Perro) {
                ((Perro) a).perseguirCola();
            } else if (a instanceof Gato) {
                ((Gato) a).treparArbol();
            } else if (a instanceof Pajaro) {
                ((Pajaro) a).volar();
            }
        }
        System.out.println("-----------------------------------");
    }
    
}