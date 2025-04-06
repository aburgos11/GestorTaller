
import java.sql.Connection;
import java.util.Scanner;
import model.ConexionBD;
import view.*;



public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        
        ClienteVIEW clienteVIEW = new ClienteVIEW();
        //VehiculoVIEW vehiculoVIEW = new VehiculoVIEW();
        //EmpleadoVIEW empleadoVIEW = new EmpleadoVIEW();

        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
        System.out.println("Conexión establecida correctamente.");
        } else {
        System.out.println("No se pudo establecer la conexión.");
        }
        String opcion;
        
        do {
            System.out.println("");
            System.out.println("¿A que sector quieres acceder?");
            System.out.println("1. Clientes");
            System.out.println("2. Vehiculos");
            System.out.println("5. Empleados");
            System.out.println("0. Salir");
            System.out.println("");
            opcion = sc.nextLine();
            

            switch (opcion) {
                case "1", "Clientes" -> { clienteVIEW.menuClientes(); }
                //case "2", "Vehiculos" -> { vehiculoVIEW.menuVehiculos(); }
                //case "5", "Empleados" -> { empleadoVIEW.menuEmpleados(); }
                case "0" -> { System.out.println("Saliendo del programa.");}
                default -> {}
                    
            }
        } while (!opcion.equalsIgnoreCase("0"));
    }
}
