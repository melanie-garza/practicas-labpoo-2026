public class CombateConcurrente implements Runnable {
    private String campo;
    private Personaje p1;
    private Personaje p2;
    private TablaResultados tabla;

    public CombateConcurrente(String campo, Personaje p1, Personaje p2, TablaResultados tabla) {
        this.campo = campo;
        this.p1 = p1;
        this.p2 = p2;
        this.tabla = tabla;
    }

    @Override
    public void run() {
        System.out.println("[" + campo + "] INICIO - " + p1.getNombre() + " vs " + p2.getNombre());
        try {
            // Simulamos 3 rondas de combate rápido
            for (int i = 1; i <= 3; i++) {
                System.out.println("[" + campo + "] Ronda " + i);
                Thread.sleep(500); // Simulamos el tiempo de la ronda
            }
            
            // Determinamos un ganador aleatorio para la simulación
            Personaje ganador = (Math.random() > 0.5) ? p1 : p2;
            System.out.println("[" + campo + "] FIN - " + ganador.getNombre() + " gana.");
            
            // Registramos de forma segura en la tabla
            tabla.registrarResultado(campo + " -> Ganador: " + ganador.getNombre());
            
        } catch (InterruptedException e) {
            System.out.println("[" + campo + "] Combate interrumpido.");
        }
    }
}