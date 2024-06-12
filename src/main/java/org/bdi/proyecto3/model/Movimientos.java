package org.bdi.proyecto3.model;
import java.sql.Timestamp;

public class Movimientos {

    int Identidad;
    String Movimiento;
    Timestamp Fecha;
    int Monto;


    public Movimientos() {}

    public int getIdentidad() {
        return Identidad;
    }

    public void setIdentidad(int identidad) {
        Identidad = identidad;
    }

    public String getMovimiento() {
        return Movimiento;
    }

    public void setMovimiento(String movimiento) {
        Movimiento = movimiento;
    }

    public Timestamp getFecha() {
        return Fecha;
    }

    public void setFecha(Timestamp fecha) {
        Fecha = fecha;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int monto) {
        Monto = monto;
    }
}
