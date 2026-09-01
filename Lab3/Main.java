public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE VEHÍCULOS ===\n");

        Vehiculo[] flota = new Vehiculo[3];

        flota[0] = new Automovil("Toyota", "Corolla", 2022, 180.0, 4, "Gasolina");
        flota[1] = new Avion("Boeing", "747", 2018, 988.0, 10700.0, 4);
        flota[2] = new Barco("Yamaha", "275SD", 2021, 80.5, 8.2, "Turbina");

        for (Vehiculo v : flota) {
            System.out.println(v.toString());
            v.acelerar();
            v.frenar();

            if (v instanceof Automovil) {
                ((Automovil) v).tocarClaxon();
            } else if (v instanceof Avion) {
                ((Avion) v).despegar();
            } else if (v instanceof Barco) {
                ((Barco) v).anclar();
            }
            System.out.println();
        }

        // Prueba de validación de encapsulamiento con datos inválidos
        System.out.println("--- Prueba de Encapsulamiento (Datos Inválidos) ---");
        Vehiculo invalido = new Vehiculo("MarcaTest", "ModeloX", 1800, -50.0);
        System.out.println(invalido.toString());
    }
}