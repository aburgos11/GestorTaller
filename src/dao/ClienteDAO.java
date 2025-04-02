package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteDAO {
    public void instertar(Cliente cliente) {INSERT INTO Clientes (nombre, telefono, email) VALUES ( + Cliente.getNombre() + , + Cliente.getTelefono() +, + Cliente.getEmail() +);}
    public void actualizar(Cliente cliente) {   }
    public void eliminar(int id) {  }
    public Cliente buscarPorId(int id) {    }
    public List<Cliente> obtenerTodos() {SELECT * FROM Cliente;}

}
