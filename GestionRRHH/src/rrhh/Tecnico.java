package rrhh;

import java.util.List;

public class Tecnico extends Empleado {
    private List<String> cualificaciones;

    public Tecnico(String nif, String nombre, String apellidos, String puesto, double salarioBase, double plusConvenio, double complementos, List<String> cualificaciones) {
        super(nif, nombre, apellidos, puesto, salarioBase, plusConvenio, complementos);
        this.cualificaciones = cualificaciones;
    }

    // Getters y setters para cualificaciones
}
