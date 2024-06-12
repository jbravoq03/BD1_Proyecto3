package org.bdi.proyecto3.model;

public class Empleados {

    String Nombre;
    String Puesto;
    int Identidad;
    String FechaContratacion;
    int SaldoVacaciones;



    public Empleados() {}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }

    public int getIdentidad() {
        return Identidad;
    }

    public void setIdentidad(int ValorDocumentoIdentidad) {
        Identidad = ValorDocumentoIdentidad;
    }

    public String getFechaContratacion() {
        return FechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) { FechaContratacion = fechaContratacion; }

    public int getSaldoVacaciones() {
        return SaldoVacaciones;
    }

    public void setSaldoVacaciones(int saldoVacaciones) {
        SaldoVacaciones = saldoVacaciones;
    }

}
