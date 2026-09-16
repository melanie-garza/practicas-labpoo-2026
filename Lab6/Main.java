public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG – Expansión: Nuevas Clases ===");
        System.out.println();

        System.out.println("-- Error esperado (línea comentada) --");
        System.out.println("// new Personaje(...) -> cannot instantiate abstract class");
        // Personaje p = new Personaje("X", 1, 100); // Descomentar esto daría error de compilación intencional
        System.out.println();

        // Creación de personajes
        Druida sylva = new Druida("Sylva", 7, 200, 180, 120, "Oso");
        Nigromante malachar = new Nigromante("Malachar", 6, 350, 220, 2);
        Bardo finnian = new Bardo("Finnian", 5, 150, 60, "Laúd");

        System.out.println("-- Ataques y daño --");
        sylva.atacar();
        malachar.atacar();
        finnian.atacar();
        System.out.println();

        System.out.println("-- Solo los Hechiceros lanzan hechizos --");
        sylva.lanzarHechizo();
        malachar.lanzarHechizo();
        System.out.println();

        System.out.println("-- Solo los Sanadores curan --");
        malachar.recibirDanio(300);
        sylva.curarAliado(malachar);
        finnian.curarAliado(malachar);
        System.out.println();

        System.out.println("-- Estado final --");
        System.out.println(sylva);
        System.out.println(malachar);
        System.out.println(finnian);
    }
}