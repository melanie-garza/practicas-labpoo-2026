public class Main {
    public static void main(String[] args) {
        // Bloque 1 - Gestión de roster con ArrayList
        GestionGremio gremio = new GestionGremio();
        gremio.agregarMiembro(new Druida("Sylva", 10, 300, 100));
        gremio.agregarMiembro(new Nigromante("Malachar", 8, 250, 120));
        gremio.agregarMiembro(new Arquero("Legolas", 6, 150, "Arco", 20, 95));
        gremio.agregarMiembro(new Guerrero("Thorin", 9, 400, "Hacha", 80));
        System.out.println();
        gremio.mostrarRoster();

        gremio.eliminarMiembro("Malachar");
        gremio.mostrarRoster();

        Personaje encontrado = gremio.buscarPorNombre("Legolas");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNombre() + "\n");
        }

        // Bloque 2 - Cola de espera con LinkedList
        gremio.encolarSolicitante("Gandalf");
        gremio.encolarSolicitante("Aragorn");
        gremio.encolarSolicitante("Gimli");
        System.out.println();
        gremio.mostrarCola();

        gremio.atenderSiguiente(); // Atiende a Gandalf (FIFO)
        gremio.mostrarCola();
        System.out.println();

        // Bloque 3 - Inventario con HashMap
        gremio.agregarItem("Poción de vida", 5);
        gremio.agregarItem("Flecha élfica", 30);
        gremio.agregarItem("Poción de vida", 3);

        gremio.mostrarInventario();

        gremio.usarItem("Poción de vida");
        gremio.usarItem("Pergamino de fuego"); // No existe
        System.out.println();

        // Bloque 4 - Habilidades únicas con HashSet
        gremio.registrarHabilidad("Curación");
        gremio.registrarHabilidad("Magia oscura");
        gremio.registrarHabilidad("Curación"); // Duplicado

        gremio.mostrarHabilidades();

        System.out.println("¿Tiene tiro con arco? " + gremio.tieneHabilidad("Tiro con arco"));
        System.out.println("¿Tiene curación?      " + gremio.tieneHabilidad("Curación"));
    }
}