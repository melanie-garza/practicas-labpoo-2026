public class Disenador extends Empleado {
    private String herramientaPrincipal;
    private int proyectosEntregados;

    public Disenador(String nombre, int edad, String genero, String idEmpleado, double salarioBase, String departamento, String herramientaPrincipal, int proyectosEntregados) {
        super(nombre, edad, genero, idEmpleado, salarioBase, departamento);
        this.herramientaPrincipal = herramientaPrincipal;
        this.proyectosEntregados = proyectosEntregados;
    }

    public String getHerramientaPrincipal() { return herramientaPrincipal; }
    public void setHerramientaPrincipal(String herramientaPrincipal) { this.herramientaPrincipal = herramientaPrincipal; }

    public int getProyectosEntregados() { return proyectosEntregados; }
    public void setProyectosEntregados(int proyectosEntregados) { this.proyectosEntregados = proyectosEntregados; }

    @Override
    public double calcularSalario() {
        double bonoPorProyecto = 500.0;
        return getSalarioBase() + (proyectosEntregados * bonoPorProyecto);
    }

    @Override
    public void trabajar() {
        System.out.println("El diseñador " + getNombre() + " está diseñando interfaces y prototipos en " + herramientaPrincipal + ".");
    }

    public void crearPrototipo() {
        System.out.println(getNombre() + " está creando un nuevo sistema de diseño.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: Diseñador | Herramienta: " + herramientaPrincipal + " | Proyectos Entregados: " + proyectosEntregados);
    }
}