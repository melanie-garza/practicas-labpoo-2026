public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE NÓMINA Y GESTIÓN DE EMPLEADOS ===\n");

        Empleado[] nomina = new Empleado[3];

        nomina[0] = new Gerente("Carlos Ruiz", 42, "Masculino", "EMP-101", 45000.0, "Operaciones", 12000.0, 8);
        nomina[1] = new Desarrollador("Lucía Morales", 28, "Femenino", "EMP-204", 32000.0, "TI", "Java", 15);
        nomina[2] = new Disenador("Mateo Soto", 26, "Masculino", "EMP-305", 28000.0, "UX/UI", "Figma", 4);

        double costoNominaTotal = 0.0;

        for (Empleado emp : nomina) {
            System.out.println("--------------------------------------------------");
            emp.mostrarInfo();
            emp.trabajar();

            if (emp instanceof Gerente) {
                ((Gerente) emp).planificarProyectos();
            } else if (emp instanceof Desarrollador) {
                ((Desarrollador) emp).depurarCodigo();
            } else if (emp instanceof Disenador) {
                ((Disenador) emp).crearPrototipo();
            }

            costoNominaTotal += emp.calcularSalario();
            System.out.println();
        }

        System.out.println("==================================================");
        System.out.println("Gasto Total de Nómina de la Empresa: $" + costoNominaTotal);
        System.out.println("==================================================");
    }
}