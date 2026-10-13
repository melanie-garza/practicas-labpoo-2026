public class Main {
    public static void main(String[] args) {
        System.out.println("=== Gran Torneo del Gremio ===\n");

        // Bloque 1 - Torneo con 3 combates simultáneos
        TablaResultados tabla = new TablaResultados();
        
        Personaje s1 = new Druida("Sylva", 10, 300, 100);
        Personaje m1 = new Nigromante("Malachar", 8, 250, 120);
        Personaje l1 = new Arquero("Legolas", 6, 150, "Arco", 20, 95);
        Personaje t1 = new Guerrero("Thorin", 9, 400, "Hacha", 80);
        Personaje b1 = new Guerrero("Brego", 7, 350, "Espada", 70);
        Personaje k1 = new Guerrero("Kael", 7, 350, "Lanza", 75);

        Thread h1 = new Thread(new CombateConcurrente("Campo-1", s1, m1, tabla));
        Thread h2 = new Thread(new CombateConcurrente("Campo-2", l1, t1, tabla));
        Thread h3 = new Thread(new CombateConcurrente("Campo-3", b1, k1, tabla));

        h1.start();
        h2.start();
        h3.start();

        // Bloque 2 - Monitor del torneo (hilo independiente)
        MonitorTorneo monitor = new MonitorTorneo("Torneo Principal", 2);
        monitor.start();

        // Bloque 3 - Esperar a que todos terminen con join()
        try {
            h1.join(); // El programa principal espera a que el Campo 1 termine
            h2.join();
            h3.join();
            monitor.join();
        } catch (InterruptedException e) {
            System.out.println("Espera interrumpida");
        }

        System.out.println("\nTodos los combates han terminado.");
        tabla.mostrarResultados();

        // Bloque 4 - Demostración de race condition
        System.out.println("\n=== Demostración de Race Condition ===");
        ContadorCompartido contador = new ContadorCompartido();
        Thread[] hilos = new Thread[5];

        // Prueba SIN synchronized
        for (int i = 0; i < 5; i++) {
            hilos[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) contador.incrementar();
            });
            hilos[i].start();
        }
        for (Thread t : hilos) try { t.join(); } catch (Exception e){}
        System.out.println("Sin sync  -- esperado: 5000 | real: " + contador.getContador());

        // Prueba CON synchronized
        contador.reset();
        for (int i = 0; i < 5; i++) {
            hilos[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) contador.incrementarSeguro();
            });
            hilos[i].start();
        }
        for (Thread t : hilos) try { t.join(); } catch (Exception e){}
        System.out.println("Con sync  -- esperado: 5000 | real: " + contador.getContador());
    }
}