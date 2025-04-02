package model;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
        System.out.println("Conexión establecida correctamente.");
        } else {
        System.out.println("No se pudo establecer la conexión.");
        }
    }
}