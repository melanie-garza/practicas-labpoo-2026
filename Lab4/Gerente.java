public class Gerente extends Empleado {
    private double bono;
    private int equipoSize;

    public Gerente(String nombre, int edad, String genero, String idEmpleado, double salarioBase, String departamento, double bono, int equipoSize) {
        super(nombre, edad, genero, idEmpleado, salarioBase, departamento);
        this.bono = bono;
        this.equipoSize = equipoSize;
    }

    public double getBono() { return bono; }
    public void setBono(double bono) { this.bono = bono; }

    public int getEquipoSize() { return equipoSize; }
    public void setEquipoSize(int equipoSize) { this.equipoSize = equipoSize; }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bono;
    }

    @Override
    public void trabajar() {
        System.out.println("El gerente " + getNombre() + " está coordinando y gestionando un equipo de " + equipoSize + " personas.");
    }

    public void planificarProyectos() {
        System.out.println(getNombre() + " está estructurando la planeación trimestral.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: Gerente | Bono: $" + bono + " | Tamaño de equipo: " + equipoSize);
    }
}