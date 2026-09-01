public class Desarrollador extends Empleado {
    private String lenguajePrincipal;
    private int horasExtras;

    public Desarrollador(String nombre, int edad, String genero, String idEmpleado, double salarioBase, String departamento, String lenguajePrincipal, int horasExtras) {
        super(nombre, edad, genero, idEmpleado, salarioBase, departamento);
        this.lenguajePrincipal = lenguajePrincipal;
        this.horasExtras = horasExtras;
    }

    public String getLenguajePrincipal() { return lenguajePrincipal; }
    public void setLenguajePrincipal(String lenguajePrincipal) { this.lenguajePrincipal = lenguajePrincipal; }

    public int getHorasExtras() { return horasExtras; }
    public void setHorasExtras(int horasExtras) { this.horasExtras = horasExtras; }

    @Override
    public double calcularSalario() {
        double pagoPorHoraExtra = 250.0;
        return getSalarioBase() + (horasExtras * pagoPorHoraExtra);
    }

    @Override
    public void trabajar() {
        System.out.println("El desarrollador " + getNombre() + " está programando módulos en " + lenguajePrincipal + ".");
    }

    public void depurarCodigo() {
        System.out.println(getNombre() + " está resolviendo errores y optimizando código.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: Desarrollador | Lenguaje: " + lenguajePrincipal + " | Horas Extras: " + horasExtras);
    }
}