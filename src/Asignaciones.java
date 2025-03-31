public class Asignaciones {

    int idAsignacion;
    int idEmpleado;
    int idReparacion;

    public Asignaciones (int idAsignacion, int idEmpleado, int idReparacion) {
        this.idAsignacion = idAsignacion;
        this.idEmpleado = idEmpleado;
        this.idReparacion = idReparacion;
    }

    public int getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(int idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

}
