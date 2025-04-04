package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.ConexionBD;

public class ClienteDAO {
    public void insertar(Cliente cliente) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String query = "INSERT INTO clientes (dni, nombre, telefono, direccion) VALUES (" + cliente.getNombre() + ", " + cliente.getTelefono() + ", " + cliente.getEmail() + ")";
            try (PreparedStatement stmt = conexion.prepareStatement(query)) {
                stmt.setString(1, cliente.getDni()); // Asignar valor al DNI
                stmt.setString(1, cliente.getNombre()); // Asigna el valor del nombre
                stmt.setString(2, cliente.getTelefono()); // Asigna el valor del teléfono
                stmt.setString(3, cliente.getEmail()); // Asigna la dirección
                stmt.executeUpdate(); // Ejecuta la consulta de inserción
                System.out.println("Cliente agregado exitosamente.");
            } catch (SQLException e) {
                System.out.println("Error al agregar cliente: " + e.getMessage());
            }
        }
    }
    public void actualizar(Cliente cliente) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
           
        }
    }
   
    public void eliminar(String dni) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String query = "DELETE FROM clientes WHERE dni = ?";
            try (PreparedStatement stmt = conexion.prepareStatement(query)) {
                stmt.setString(1, dni); // Asigna el ID del cliente
                stmt.executeUpdate(); // Ejecuta la eliminación
                System.out.println("Cliente eliminado.");
            } catch (SQLException e) {
                System.out.println("Error al eliminar cliente: " + 
                e.getMessage());
            }
        }

    }
    
    public Cliente buscarPorDni(String dni) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            
        }
    }
    
    public List<Cliente> obtenerTodos() {
         Connection conexion = ConexionBD.conectar();
         List<Cliente> clientes = new ArrayList<>();
        if (conexion != null) {
            String query = "SELECT * FROM clientes"; 
            try (Statement stmt = conexion.createStatement(); 
                ResultSet rs = stmt.executeQuery(query)) {
            
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setId(rs.getInt("id"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setTelefono(rs.getString("telefono"));
                    cliente.setEmail(rs.getString("email"));
                    clientes.add(cliente);
                    
                }
            } catch (SQLException e) {
            System.out.println("Error al realizar la consulta: " + e.getMessage());
            }finally {
                try {
                    conexion.close(); // Cierra la conexión en el bloque finally
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return clientes;
                
    }

}
