package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.ConexionBD;
import model.Empleado;

public class EmpleadoDAO {

    public void insertar(Empleado empleado) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String query = "INSERT INTO empleados (dniEmpleado, nombre, puesto) VALUES (" + empleado.getNombre() + ", " + empleado.getDniEmpleado() + ", " + empleado.getPuesto() + ")";
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


    public void eliminar(String dniEmpleado) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String query = "DELETE FROM empleados WHERE dniEmpleado = ?";
            try (PreparedStatement stmt = conexion.prepareStatement(query)) {
                stmt.setString(1, dniEmpleado); 
                stmt.executeUpdate(); 
                System.out.println("Empleado eliminado correctamente.");
            } catch (SQLException e) {
                System.out.println("Error al eliminar el empleado: " + 
                e.getMessage());
            }
        }

    }


    public Empleado buscarPorDni(String dniEmpleado) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String query = "SELECT * FROM empleados WHERE dniEmpleado = ?"; 
            try (PreparedStatement stmt = conexion.prepareStatement(query)) {
                stmt.setString(1, dniEmpleado);  
                ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        Empleado empleado = new Empleado(
                            rs.getString("dniEmpleado"),
                            rs.getString("nombre"),
                            rs.getString("puesto")
                        );                        
                        return empleado;
                    } 
                                                            
            } catch (SQLException e) {
                System.out.println("Error al buscar cliente: " + e.getMessage());
            }
    
        }
        return null;
    }



    public List<Empleado> obtenerTodos() {
         Connection conexion = ConexionBD.conectar();
         List<Empleado> empleados = new ArrayList<>();
        if (conexion != null) {
            String query = "SELECT * FROM empleados"; 
            try (Statement stmt = conexion.createStatement(); 
                ResultSet rs = stmt.executeQuery(query)) {
            
                while (rs.next()) {
                    Empleado empleado = new Empleado();
                    Empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                    Empleado.setNombre(rs.getString("nombre"));
                    Empleado.setPuesto(rs.getString("puesto"));
                    Empleado.setDniEmpleado(rs.getString("dniEmpleado"));                   
                    empleados.add(empleado);
                    
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
        return empleados;
                
    }
}
