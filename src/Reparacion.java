public class Reparacion {

    int idReparacion;
    String descripcion;
    double precio;
    String matriculaVehiculo;
    int idEmpleado;

    public Reparacion(int idReparacion, String descripcion, double precio, String matriculaVehiculo, int idEmpleado) {
        this.idReparacion = idReparacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.matriculaVehiculo = matriculaVehiculo;
        this.idEmpleado = idEmpleado;
        
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMatriculaVehiculo() {
        return matriculaVehiculo;
    }

    public void setMatriculaVehiculo(String matriculaVehiculo) {
        this.matriculaVehiculo = matriculaVehiculo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }


}
