package rrhh;

public abstract class Empleado {
    private String nif;
    private String nombre;
    private String apellidos;
    private String puesto;
    private double salarioBase;
    private double plusConvenio;
    private double complementos;

    public Empleado(String nif, String nombre, String apellidos, String puesto, double salarioBase, double plusConvenio, double complementos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.salarioBase = salarioBase;
        this.plusConvenio = plusConvenio;
        this.complementos = complementos;
    }

    public double calcularIRPF() {
        double porcentajeIRPF = 10 + Math.random() * 8;  // Valor aleatorio entre 10 y 18%
        return salarioBase * (porcentajeIRPF / 100);
    }

    public double calcularSalarioMensual() {
        return salarioBase + plusConvenio + complementos - calcularIRPF();
    }

    // Getters y setters para los atributos
}
