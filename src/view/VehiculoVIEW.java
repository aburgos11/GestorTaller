package view;


import java.util.List;
import java.util.Scanner;
import dao.VehiculoDAO;
import model.Vehiculo;


public class VehiculoVIEW {

    private VehiculoDAO vehiculoDAO = new VehiculoDAO();

    public void menuVehiculos() {
        
        int opcionVehiculos;
        do {
            System.out.println("¿Qué acción deseas realizar?");
            System.out.println("1. Ver lista de vehiculos");
            System.out.println("2. Buscar vehiculo");
            System.out.println("3. Agregar vehiculo");
            System.out.println("4. Eliminar vehiculo");
            System.out.println("0. Volver al menú inicial");
            opcionVehiculos = sc.nextInt();
           
    
            switch (opcionVehiculos) {
                case 1: // Ver lista de vehiculos
                listarVehiculo();
                break;

                case 2: // Buscar vehiculos
                buscarVehiculo();                                     
                break;
     
                case 3: // Agregar vehiculos
                agregarVehiculo();
                break;

                case 4: // Eliminar vehiculos
                eliminarVehiculo();
                break;
    
                case 0: System.out.println("Volviendo al menú inicial");
                break;

            }
                                                        
    
    
        } while (opcionVehiculos != 0);

    }
    Scanner sc = new Scanner(System.in);

    private void listarVehiculo() {
        List<Vehiculo> lista = vehiculoDAO.obtenerTodos();
        for (Vehiculo c : lista) {
            System.out.println(c);
        }
    }

    private void buscarVehiculo() {
        System.out.println("Introduce la matricula del vehiculo que deseas buscar:");
        String matricula = sc.nextLine();

            Vehiculo vehiculo = vehiculoDAO.buscarPorMatricula(matricula);

            if (vehiculo == null) {
                System.out.println("No se encontró ningún vehiculo con la matricula proporcionada.");
            } else {
                System.out.println("Vehiculo encontrado:");
                System.out.println(vehiculo);
            }

    }


    private void agregarVehiculo() {
        System.out.println("Introduce los datos del nuevo vehiculo:");

        System.out.println("Introduce la matricula");
        String matricula = sc.nextLine();
        System.out.println("Ingresa la marca del vehiculo");
        String marca = sc.nextLine();

        System.out.println("Ingresa el nmodelo del vehiculo");
        String modelo = sc.nextLine();

        Vehiculo nuevoVehiculo = new Vehiculo(matricula, marca, modelo);

        vehiculoDAO.insertar(nuevoVehiculo);

    }


    private void eliminarVehiculo() {
        System.out.println("Matricula del vehiculo que deseas eliminar: ");
        String matricula = sc.nextLine();
        VehiculoDAO.eliminar(matricula);
    }



}
