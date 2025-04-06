package view;

import dao.ClienteDAO;
import java.util.List;
import java.util.Scanner;
import model.Cliente;

public class ClienteVIEW {
    
    private ClienteDAO clienteDAO = new ClienteDAO();

    public void menuClientes() {
        
        int opcionClientes;
        do {
            System.out.println("¿Qué acción deseas realizar?");
            System.out.println("1. Ver lista de clientes");
            System.out.println("2. Buscar cliente");
            System.out.println("3. Agregar cliente");
            System.out.println("4. Modificar cliente");
            System.out.println("5. Eliminar cliente");
            System.out.println("0. Volver al menú inicial");
            opcionClientes = sc.nextInt();
           
    
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
    Scanner sc = new Scanner(System.in);

    private void listarClientes() {
        List<Cliente> lista = clienteDAO.obtenerTodos();
        for (Cliente c : lista) {
            System.out.println(c);
        }
    }

    private void buscarCliente() {
        System.out.println("Introduce el DNI del cliente que deseas buscar:");
        String dni = sc.nextLine();

            Cliente cliente = clienteDAO.buscarPorDni(dni);

            if (cliente == null) {
                System.out.println("No se encontró ningún cliente con el DNI proporcionado.");
            } else {
                System.out.println("Cliente encontrado:");
                System.out.println(cliente);
            }

    }

    private void agregarCliente() {
        System.out.println("Introduce los datos del nuevo cliente:");

        System.out.println("Introduce el DNI");
        String dni = sc.nextLine();
        System.out.println("Ingresa el nombre");
        String nombre = sc.nextLine();

        System.out.println("Ingresa el número de teléfono");
        String telefono = sc.nextLine();

        System.out.println("Ingresa el email");
        String email = sc.nextLine();

        Cliente nuevoCliente = new Cliente(dni, nombre, telefono, email);

        clienteDAO.insertar(nuevoCliente);

    }

    private void actualizarCliente() {
        System.out.println("Introduce el DNI del cliente que deseas actualizar:");
        String dni = sc.nextLine();
        Cliente cliente = clienteDAO.buscarPorDni(dni);
            if (cliente == null) {
                System.out.println("No se encontró ningún cliente con el DNI proporcionado.");
                return;
            } else {
                System.out.println("Introduce los nuevos datos del cliente:");

                System.out.println("Ingresa el nuevo número de teléfono (deja en blanco para mantener el actual):");
                String telefono = sc.nextLine();
                if (!telefono.isEmpty()) {
                    cliente.setTelefono(telefono);
                }
    
                System.out.println("Ingresa el nuevo email (deja en blanco para mantener el actual):");
                String email = sc.nextLine();
                if (!email.isEmpty()) {
                    cliente.setEmail(email);
                }
    
                clienteDAO.actualizar(cliente);
            }
    }

    private void eliminarCliente() {
        System.out.println("DNI del cliente que deseas eliminar: ");
        String dni = sc.nextLine();
        clienteDAO.eliminar(dni);
    }
}     