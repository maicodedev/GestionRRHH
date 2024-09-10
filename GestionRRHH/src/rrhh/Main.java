package rrhh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú de Gestión de RRHH -----");
            System.out.println("1. Crear Empleado");
            System.out.println("2. Buscar Empleado");
            System.out.println("3. Ver Resumen de Empleados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearEmpleado(scanner);
                    break;
                case 2:
                    buscarEmpleado(scanner);
                    break;
                case 3:
                    verResumenEmpleados();
                    break;
                case 4:
                    System.out.println("Gracias por usar la aplicación. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    private static void crearEmpleado(Scanner scanner) {
        // Lógica para crear un empleado (técnico o ejecutivo)
        // Pedir los datos por consola e ir añadiendo empleados a la lista
    }

    private static void buscarEmpleado(Scanner scanner) {
        // Lógica para buscar un empleado por NIF
    }

    private static void verResumenEmpleados() {
        // Mostrar el listado de empleados
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado emp : empleados) {
                System.out.println(emp);
            }
        }
    }
}
