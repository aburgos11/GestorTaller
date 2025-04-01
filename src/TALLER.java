import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Taller {
    List<Cliente> clientes = new ArrayList<>();
    List<Vehiculo> vehiculos = new ArrayList<>();
    List<Reparacion> reparaciones = new ArrayList<>();
    List<Empleado> empleados = new ArrayList<>();
    List<Asignacion> asignaciones = new ArrayList<>();

    public static void main(String[] args) {
        Taller taller = new Taller();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do { 
            System.out.println("¿A qué lista quieres acceder? Selecciona la opción que deseas");
            System.out.println("1. Clientes");
            System.out.println("2. Vehículos");
            System.out.println("3. Empleados");
            System.out.println("4. Reparaciones");
            System.out.println("5. Asignaciones");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: // Clientes
                int opcionClientes;
                do {
                    System.out.println("¿Qué acción deseas realizar?");
                    System.out.println("1. Buscar cliente");
                    System.out.println("2. Agregar cliente");
                    System.out.println("3. Modificar cliente");
                    System.out.println("4. Eliminar cliente");
                    System.out.println("0. Volver al menú inicial");
                    opcionClientes = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionClientes) {
                        case 1:
                        // Buscar cliente
                        break;

                        case 2:
                        // Agregar cliente
                        break;

                        case 3:
                        // Modificar cliente
                        break;

                        case 4:
                        // Eliminar cliente
                        break;

                        case 0: System.out.println("Volviendo al menú inicial");
                        break;
                    }
                    
                } while (opcionClientes !=0);
                break;


                case 2: // Vehículos
                int opcionVehiculos;
                do {
                    System.out.println("¿Qué acción deseas realizar?");
                    System.out.println("1. Buscar vehículo");
                    System.out.println("2. Agregar vehículo");
                    System.out.println("3. Modificar vehículo");
                    System.out.println("4. Eliminar vehículo");
                    System.out.println("0. Volver al menú inicial");
                    opcionVehiculos = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionVehiculos) {
                        case 1:
                        // Buscar vehículo
                        break;

                        case 2:
                        // Agregar vehículo
                        break;

                        case 3:
                        // Modificar vehículo
                        break;

                        case 4:
                        // Eliminar vehículo
                        break;

                        case 0: System.out.println("Volviendo al menú inicial");
                        break;
                    }
                
                } while (opcionVehiculos !=0);                
                break;

                case 3: // Empleados
                int opcionEmpleados;
                do {
                    System.out.println("¿Qué acción deseas realizar?");
                    System.out.println("1. Buscar empleado");
                    System.out.println("2. Agregar empleado");
                    System.out.println("3. Modificar empleado");
                    System.out.println("4. Eliminar empleado");
                    System.out.println("0. Volver al menú inicial");
                    opcionEmpleados = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionEmpleados) {
                        case 1:
                        // Buscar empleado
                        break;

                        case 2:
                        // Agregar empleado
                        break;

                        case 3:
                        // Modificar empleado
                        break;
                        
                        case 4:
                        // Eliminar empleado
                        break;

                        case 0: System.out.println("Volviendo al menú inicial");
                        break;
                    }
                    
                } while (opcionEmpleados !=0);
                break;

                case 4: // Reparaciones
                int opcionReparaciones;
                do {
                    System.out.println("¿Qué acción deseas realizar?");
                    System.out.println("1. Buscar reparación realizada");
                    System.out.println("2. Registrar reparación");
                    System.out.println("0.Volver al menú inicial");
                    opcionReparaciones = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionReparaciones) {
                        case 1:
                        // Buscar reparación realizada
                        break;

                        case 2:
                        // Registrar reparación
                        break;

                        case 0: System.out.println("Volviendo al menú inicial");
                        break;
                    }
                    
                } while (opcionReparaciones !=0);
                break;

                case 5: // Asignaciones
                int opcionAsignaciones;
                do {
                    System.out.println("¿Qué acción deseas realizar?");
                    System.out.println("1. Asignar una reparación a un empleado");
                    System.out.println("0. Volver al menú inicial");
                    opcionAsignaciones = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionAsignaciones) {
                        case 1:
                        // Asignar una reparación
                        break;

                        case 0: System.out.println("Volviendo al menú inicial");
                        break;
                    }
                    
                } while (opcionAsignaciones !=0);
                break;

                case 0: System.out.println("Cerrando el programa");
                break;
            }
        } while (opcion != 0);


    }

}
