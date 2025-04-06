package model;

public class Vehiculo {

    String matricula;
    String marca;
    String modelo;
    int idCliente;  // ES SOLO UNA PEQUEÑA IDEA PARA ASOCIAR VEHICULOS CON SUS DUEÑOS, PERO ME DA QUE SERÁ MEJOR USAR DNI

    public Vehiculo(String matricula, String marca, String modelo /*int idCliente*/) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        //this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
        "idCliente=" + idCliente + '\'' +
        ", matricula=" + matricula + '\'' +
        ", marca=" + marca + '\'' +
        ", modelo=" + modelo + '\'' +
        '}';
    }

}
