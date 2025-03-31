public class Reparacion {

    int idReparacion;
    String descripcion;
    double precio;
    int idEmpleado;
    Vehiculo vehiculo;

    public Reparacion(int idReparacion, String descripcion, double precio, String matriculaVehiculo, int idEmpleado) {
        this.idReparacion = idReparacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.vehiculo = vehiculo;
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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "Reparacion{" +
                "idReparacion=" + idReparacion +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", vehiculo=" + vehiculo +                
                ", idEmpleado=" + idEmpleado +
                '}';
    }


}
