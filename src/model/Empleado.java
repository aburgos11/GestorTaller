package model;

public class Empleado {

    int idEmpleado;
    String nombre;
    String puesto; // Cual es su especialidad, el trabajo que realiza (Mecánico, Administrativo...) 
    
    public Empleado(int idEmpleado, String nombre, String puesto) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
            "idEmpleado=" + idEmpleado +
            ", nombre='" + nombre + '\'' +
            ", puesto='" + puesto + '\'' +
            '}';
    }

}
