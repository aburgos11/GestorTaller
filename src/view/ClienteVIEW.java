package view;

import dao.ClienteDAO;
import java.util.ArrayList;
import java.util.Scanner;

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
                modificarCliente();       
                break;

                case 5: // Eliminar cliente
                eliminarCliente();
                break;
    
                case 0: System.out.println("Volviendo al menú inicial");
                break;

            }
                                                        
    
    
        } while (opcionClientes != 0);

    }
}    