package rrhh;

public class Ejecutivo extends Empleado {
    private double comisionAnual;

    public Ejecutivo(String nif, String nombre, String apellidos, String puesto, double salarioBase, double plusConvenio, double complementos, double comisionAnual) {
        super(nif, nombre, apellidos, puesto, salarioBase, plusConvenio, complementos);
        this.comisionAnual = comisionAnual;
    }

    @Override
    public double calcularSalarioMensual() {
        double salarioMensualBase = super.calcularSalarioMensual();
        return salarioMensualBase + (comisionAnual / 12);
    }

    // Getters y setters para comisión anual
}
