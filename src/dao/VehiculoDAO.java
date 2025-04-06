package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ConexionBD;
import model.Vehiculo;

public class VehiculoDAO {

     public void insertar(Vehiculo vehiculo) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String query = "INSERT INTO vehiculos (matricula, marca, modelo) VALUES (" + vehiculo.getMatricula() + ", " + vehiculo.getMarca() + ", " + vehiculo.getModelo() + ")";
            try (PreparedStatement stmt = conexion.prepareStatement(query)) {
                stmt.setString(1, vehiculo.getMatricula()); 
                stmt.setString(1, vehiculo.getMarca()); 
                stmt.setString(2, vehiculo.getModelo());  
                stmt.executeUpdate(); 

                System.out.println("Vehiculo agregado correctamente.");
            } catch (SQLException e) {
                System.out.println("Error al agregar el vehiculo: " + e.getMessage());
            }
        }
    }

    public void eliminar(String matricula) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String query = "DELETE FROM vehiculos WHERE matricula = ?";
            try (PreparedStatement stmt = conexion.prepareStatement(query)) {
                stmt.setString(1, matricula); 
                stmt.executeUpdate(); 
                System.out.println("Vehiculo eliminado.");
            } catch (SQLException e) {
                System.out.println("Error al eliminar el vehiculo: " + 
                e.getMessage());
            }
        }

    }


    public Vehiculo buscarPorMatricula(String matricula) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String query = "SELECT * FROM vehiculos WHERE matricula = ?"; 
            try (PreparedStatement stmt = conexion.prepareStatement(query)) {
                stmt.setString(1, matricula);  
                ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        Vehiculo vehiculo = new Vehiculo(
                            rs.getString("matricula"),
                            rs.getString("marca"),
                            rs.getString("modelo")
                        );                        
                        return vehiculo;
                    } 
                                                            
            } catch (SQLException e) {
                System.out.println("Error al buscar el vehiculo: " + e.getMessage());
            }
    
        }
        return null;
    }

}
