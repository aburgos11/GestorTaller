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
                stmt.setString(1, cliente.getDni()); 
                stmt.setString(1, cliente.getNombre()); 
                stmt.setString(2, cliente.getTelefono()); 
                stmt.setString(3, cliente.getEmail()); 
                stmt.executeUpdate(); 
                System.out.println("Cliente agregado correctamente.");
            } catch (SQLException e) {
                System.out.println("Error al agregar cliente: " + e.getMessage());
            }
        }
    }


    public void actualizar(Cliente cliente) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String query = "UPDATE clientes SET telefono = ?, email = ? WHERE dni = ?";
            try (PreparedStatement stmt = conexion.prepareStatement(query)) {
                stmt.setString(1, cliente.getTelefono());
                stmt.setString(2, cliente.getEmail());
                stmt.setString(3, cliente.getDni()); 
                stmt.executeUpdate();
                System.out.println("Teléfono y email actualizados para el cliente con DNI: " + cliente.getDni());
            } catch (SQLException e) {
                System.out.println("Error al actualizar cliente por DNI: " + e.getMessage());
            }

        }
    }

   
    public void eliminar(String dni) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String query = "DELETE FROM clientes WHERE dni = ?";
            try (PreparedStatement stmt = conexion.prepareStatement(query)) {
                stmt.setString(1, dni); 
                stmt.executeUpdate(); 
                System.out.println("Cliente eliminado.");
            } catch (SQLException e) {
                System.out.println("Error al eliminar el cliente: " + 
                e.getMessage());
            }
        }

    }

    
    public Cliente buscarPorDni(String dni) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String query = "SELECT * FROM clientes WHERE dni = ?"; 
            try (PreparedStatement stmt = conexion.prepareStatement(query)) {
                stmt.setString(1, dni);  
                ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        Cliente cliente = new Cliente(
                            rs.getString("dni"),
                            rs.getString("nombre"),
                            rs.getString("telefono"),
                            rs.getString("email")
                        );                        
                        return cliente;
                    } 
                                                            
            } catch (SQLException e) {
                System.out.println("Error al buscar cliente: " + e.getMessage());
            }
    
        }
        return null;
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
                    cliente.setDni(rs.getString("dni"));
                    clientes.add(cliente);
                    
                }
            } catch (SQLException e) {
            System.out.println("Error al realizar la consulta: " + e.getMessage());
            }finally {
                try {
                    conexion.close(); 
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return clientes;
                
    }

}
