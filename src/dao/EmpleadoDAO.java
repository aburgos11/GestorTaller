package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Cliente;
import model.ConexionBD;
import model.Empleado;

public class EmpleadoDAO {
    public void insertar(Empleado empleado) {
            Connection conexion = ConexionBD.conectar();
            if (conexion != null) {
                String query = "INSERT INTO empleados (dniEmpleado, nombre, puesto) VALUES (" + empleado.getNombre() + ", " + empleado.getDniEmpleado()() + ", " + empleado.getPuesto() + ")";
                try (PreparedStatement stmt = conexion.prepareStatement(query)) {
                    stmt.setString(1, empleado.getDniEmpleado()); 
                    stmt.setString(1, empleado.getNombre()); 
                    stmt.setString(2, empleado.getPuesto());  
                    stmt.executeUpdate(); 
                    System.out.println("Empleado agregado correctamente.");
                } catch (SQLException e) {
                    System.out.println("Error al agregar Empleado: " + e.getMessage());
                }
            }
        }
}
