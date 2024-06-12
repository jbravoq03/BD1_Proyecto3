package org.bdi.proyecto3.model;

import java.sql.Timestamp;

public class HistorialUsoDatos {

    String numero;
    Double QGigas;
    Timestamp Fecha;

    public HistorialUsoDatos() {}

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getQGigas() {
        return QGigas;
    }

    public void setQGigas(Double QGigas) {
        this.QGigas = QGigas;
    }

    public Timestamp getFecha() {
        return Fecha;
    }

    public void setFecha(Timestamp fecha) {
        Fecha = fecha;
    }
}