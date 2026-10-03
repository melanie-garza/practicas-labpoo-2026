public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG - Sistema con Manejo de Excepciones ===\n");

        MotorCombate motor = new MotorCombate();

        Druida sylva = new Druida("Sylva", 5, 200, 50);
        Nigromante malachar = new Nigromante("Malachar", 5, 180, 40);

        // Escenario 1: Turno normal sin excepción
        motor.ejecutarTurno(sylva, malachar);

        // Escenario 2: Personaje derrotado intenta atacar
        motor.ejecutarTurno(malachar, sylva);

        // Escenario 3: Arquero sin flechas
        Arquero legolas = new Arquero("Legolas", 6, 150, "Arco Largo", 0, 95);
        motor.ejecutarTurno(legolas, malachar);

        // Escenario 4: Curar aliado derrotado
        System.out.println("-- Intento de curar aliado derrotado --");
        try {
            sylva.curarAliado(malachar);
        } catch (RpgException e) {
            System.out.println("No se pudo curar: " + e.getMessage() + "\n");
        }

        // Escenario 5: Daño negativo con bloque try-catch-finally manual
        System.out.println("-- Bloque manual try-catch-finally --");
        try {
            sylva.recibirDanio(-50);
        } catch (AccionInvalidaException e) {
            System.out.println("Capturado: " + e.getMessage());
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.\n");
        }

        // Mostrar bitácora registrada
        motor.mostrarBitacora();
    }
}