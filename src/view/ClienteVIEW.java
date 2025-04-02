package view;

import dao.ClienteDAO;
import java.util.List;
import java.util.Scanner;
import model.Cliente;

public class ClienteVIEW {
    private Scanner sc = new Scanner(System.in);
    private ClienteDAO clienteDAO = new ClienteDAO();

    public void menuClientes() {
        Scanner scanner = new Scanner(System.in);
        int opcionClientes;
        do {
            System.out.println("¿Qué acción deseas realizar?");
            System.out.println("1. Ver lista de clientes");
            System.out.println("2. Buscar cliente");
            System.out.println("3. Agregar cliente");
            System.out.println("4. Modificar cliente");
            System.out.println("5. Eliminar cliente");
            System.out.println("0. Volver al menú inicial");
            opcionClientes = scanner.nextInt();
            scanner.nextLine();
    
            switch (opcionClientes) {
                case 1: // Ver lista de clientes
                listarClientes();
                break;

                case 2: // Buscar cliente
                buscarCliente();                                     
                break;
     
                case 3: // Agregar cliente
                agregarCliente();
                break;
    
                case 4: // Modificar cliente
                actualizarCliente();       
                break;

                case 5: // Eliminar cliente
                eliminarCliente();
                break;
    
                case 0: System.out.println("Volviendo al menú inicial");
                break;

            }
                                                        
    
    
        } while (opcionClientes != 0);

    }

    private void listarClientes() {
        List<Cliente> lista = clienteDAO.obtenerTodos();
        for (Cliente c : lista) {
            System.out.println(c);
        }
    }

    private void buscarCliente() {

    }

    private void agregarCliente() {
        System.out.println("Introduce los datos del nuevo cliente:");

        System.out.println("Ingresa el nombre");
        String nombre = sc.nextLine();
        sc.nextLine();

        System.out.println("Ingresa el número de teléfono");
        String telefono = sc.nextLine();
        sc.nextLine();

        System.out.println("Ingresa el email");
        String email = sc.nextLine();
        sc.nextLine();
        clienteDAO.insertar(new Cliente(0, nombre, telefono, email));
    }

    private void actualizarCliente() {

    }

    private void eliminarCliente() {
        System.out.println("ID del cliente que deseas eliminar: ");
        int id = sc.nextInt();
        clienteDAO.eliminar(id);
    }
}    