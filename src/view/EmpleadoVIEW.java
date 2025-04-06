package view;

import dao.EmpleadoDAO;
import java.util.List;
import java.util.Scanner;
import model.Empleado;


public class EmpleadoVIEW {

    private EmpleadoDAO empleadoDAO = new EmpleadoDAO();

    public void menuEmpleados() {

        int opcionEmpleados;
        do {
            System.out.println("¿Qué acción deseas realizar?");
            System.out.println("1. Ver lista de empleados");
            System.out.println("2. Buscar empleado");
            System.out.println("3. Agregar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("0. Volver al menú inicial");
            opcionEmpleados = sc.nextInt();

            switch (opcionEmpleados) {
                case 1: // Ver lista de empleados
                listarEmpleados();
                break;

                case 2: // Buscar empleados
                buscarEmpleado();                                     
                break;
     
                case 3: // Agregar empleados
                agregarEmpleado();
                break;

                case 4: // Eliminar empleados
                eliminarEmpleado();
                break;
    
                case 0: System.out.println("Volviendo al menú inicial");
                break;

            }

        } while (opcionEmpleados != 0);
    }
    Scanner sc = new Scanner(System.in);

    private  void listarEmpleados() {
        List<Empleado> lista = empleadoDAO.obtenerTodos();
        for (Empleado c : lista) {
            System.out.println(c);
        }
    }


    private void buscarEmpleado() {
        System.out.println("Introduce el DNI del empleado que deseas buscar:");
        String dni = sc.nextLine();

            Empleado empleado = empleadoDAO.buscarPorDni(dni);

            if (empleado == null) {
                System.out.println("No se encontró ningún empleado con el DNI proporcionado.");
            } else {
                System.out.println("Empleado encontrado:");
                System.out.println(empleado);
            }
    }


    private void agregarEmpleado() {
        System.out.println("Introduce los datos del nuevo Empleado:");

        System.out.println("Introduce el DNI");
        String dniEmpleado = sc.nextLine();

        System.out.println("Ingresa el nombre");
        String nombre = sc.nextLine();

        System.out.println("¿En qué puesto trabajará el nuevo empleado?");
        System.out.println("1. Taller");
        System.out.println("2. Administrativo");     
        int opcionPuesto = sc.nextInt();
        String puesto = sc.nextLine();
        //String puestoTrabajo;
        switch (opcionPuesto) {
            case 1: 
            puesto = "Taller";
            break;

            case 2: 
            puesto = "Administrativo";
            break;
        }

        Empleado nuevoEmpleado = new Empleado(dniEmpleado, nombre, puesto);

        empleadoDAO.insertar(nuevoEmpleado);

    }


    private void eliminarEmpleado() {
        System.out.println("DNI del empleado que deseas eliminar: ");
        String dniEmpleado = sc.nextLine();
        empleadoDAO.eliminar(dniEmpleado);
    }

}
