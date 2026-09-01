public class Empleado extends Persona {
    private String idEmpleado;
    private double salarioBase;
    private String departamento;

    public Empleado(String nombre, int edad, String genero, String idEmpleado, double salarioBase, String departamento) {
        super(nombre, edad, genero);
        this.idEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(String idEmpleado) { this.idEmpleado = idEmpleado; }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public double calcularSalario() {
        return salarioBase;
    }

    public void trabajar() {
        System.out.println(getNombre() + " está realizando labores generales en " + departamento + ".");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("ID: " + idEmpleado + " | Depto: " + departamento + " | Salario Calculado: $" + calcularSalario());
    }
}