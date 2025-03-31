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
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        } while (opcion != 0);


    }

}
