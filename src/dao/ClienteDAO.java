package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.ConexionBD;

public class ClienteDAO {
    public void insertar(Cliente cliente) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String query = "INSERT INTO clientes (nombre, telefono, direccion) VALUES (" + cliente.getNombre() + ", " + cliente.getTelefono() + ", " + cliente.getEmail() + ")";
            try (PreparedStatement stmt = conexion.prepareStatement(query)) {
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
    public void actualizar(Cliente cliente) {}
    public void eliminar(int id) {}
    public Cliente buscarPorId(int id) {}
    public List<Cliente> obtenerTodos() {
        
    }

}
