import java.util.ArrayList;

public class TablaResultados {
    private ArrayList<String> registros = new ArrayList<>();

    // synchronized garantiza que solo un hilo a la vez pueda escribir aquí
    public synchronized void registrarResultado(String resultado) {
        registros.add(resultado);
        System.out.println("[Tabla] Registrado: " + resultado);
    }

    public void mostrarResultados() {
        System.out.println("\n=== Resultados del Torneo ===");
        for (int i = 0; i < registros.size(); i++) {
            System.out.println((i + 1) + ". " + registros.get(i));
        }
        System.out.println("Total de combates: " + registros.size());
    }
}