package view;

import dao.ClienteDAO;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteVIEW {
    private Scanner sc = new Scanner(System.in);
    private ClienteDAO clienteDAO = new ClienteDAO();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                case 1: // Buscar cliente
                System.out.println("Introduce el ID del cliente que deseas buscar");
                break;
    
                case 2: // Agregar cliente
                System.out.println("Introduce los datos del nuevo cliente:");
    
                System.out.println("Ingresa el ID");
                int idCliente = scanner.nextInt();
                scanner.nextLine();
    
                System.out.println("Ingresa el nombre");
                String nombreCliente = scanner.nextLine();
                scanner.nextLine();
    
                System.out.println("Ingresa el número de teléfono");
                String telefonoCliente = scanner.nextLine();
                scanner.nextLine();
    
                System.out.println("Ingresa el email");
                String emailCliente = scanner.nextLine();
                scanner.nextLine();
                                                
                break;
    
    
                case 3: // Modificar cliente
                            
                break;
    
    
                case 4: // Eliminar cliente
                           
                break;
    
    
                case 0: System.out.println("Volviendo al menú inicial");
                break;

            }
                                                        
    
    
        }

    }
}    
    
    

