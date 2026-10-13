import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            PersistenciaGremio persistencia = new PersistenciaGremio();

            // Bloque 1 - Crear y guardar roster
            ArrayList<Personaje> roster = new ArrayList<>();
            roster.add(new Druida("Sylva", 10, 300, 100));
            roster.add(new Arquero("Legolas", 6, 150, "Arco", 20, 95));
            roster.add(new Guerrero("Thorin", 9, 400, "Hacha", 80));
            
            persistencia.guardarRoster(roster);
            System.out.println();

            // Bloque 2 - Cargar roster
            ArrayList<String> rosterCargado = persistencia.cargarRoster();
            System.out.println("\n=== Roster cargado desde archivo ===");
            for (String linea : rosterCargado) {
                String[] datos = linea.split(",");
                System.out.println("Nombre: " + datos[0] + " | Nivel: " + datos[1] + " | Vida: " + datos[2]);
            }
            System.out.println();

            // Bloque 3 - Guardar y cargar inventario
            HashMap<String, Integer> inventario = new HashMap<>();
            inventario.put("Poción de vida", 8);
            inventario.put("Flecha élfica", 30);
            inventario.put("Pergamino de fuego", 3);
            
            persistencia.guardarInventario(inventario);
            
            HashMap<String, Integer> invCargado = persistencia.cargarInventario();
            System.out.println("\n=== Inventario cargado desde archivo ===");
            for (String item : invCargado.keySet()) {
                System.out.println(item + " -> " + invCargado.get(item));
            }
            System.out.println();

            // Bloque 4 - Bitácora
            persistencia.agregarEntradaBitacora("Sylva atacó a Malachar (daño: 240)");
            persistencia.agregarEntradaBitacora("Legolas sin flechas - no pudo atacar");
            persistencia.agregarEntradaBitacora("Thorin venció a Dragón de Hielo");

            persistencia.mostrarBitacora();

            // Bloque 5 - Mostrar tamaños de archivo generados
            System.out.println("\n=== Archivos en datos_gremio/ ===");
            System.out.println("roster.txt\t(" + new File("datos_gremio/roster.txt").length() + " bytes)");
            System.out.println("inventario.txt\t(" + new File("datos_gremio/inventario.txt").length() + " bytes)");
            System.out.println("bitacora.txt\t(" + new File("datos_gremio/bitacora.txt").length() + " bytes)");

        } catch (IOException e) {
            System.out.println("Error de archivo: " + e.getMessage());
        }
    }
}