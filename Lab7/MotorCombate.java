import java.util.ArrayList;

public class MotorCombate {
    private ArrayList<String> bitacora;

    public MotorCombate() {
        bitacora = new ArrayList<>();
    }

    public void ejecutarTurno(Personaje atacante, Personaje defensor) {
        System.out.println("--- Turno: " + atacante.getNombre() + " vs " + defensor.getNombre() + " ---");
        try {
            atacante.atacar(defensor);
            bitacora.add("OK | " + atacante.getNombre() + " atacó a " + defensor.getNombre() + " (daño: 240)");
        } catch (PersonajeDerrotadoException e) {
            System.out.println("⚠ " + e.getMessage());
            bitacora.add("DERROTA | " + atacante.getNombre() + " no pudo actuar");
        } catch (RecursoInsuficienteException e) {
            System.out.println("⚠ " + e.getMessage());
            bitacora.add("SIN RECURSO | " + atacante.getNombre() + " no pudo atacar");
        } catch (RpgException e) {
            System.out.println("⚠ Error RPG: " + e.getMessage());
            bitacora.add("ERROR | " + e.getMessage());
        } finally {
            System.out.println("[Bitácora] Turno registrado.\n");
        }
    }

    public void mostrarBitacora() {
        System.out.println("=== Bitácora de Combate ===");
        for (int i = 0; i < bitacora.size(); i++) {
            System.out.println((i + 1) + ". " + bitacora.get(i));
        }
    }
}