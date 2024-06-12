package org.bdi.proyecto3.model;

import java.sql.Timestamp;

public class Factura {
    int Factura;
    Timestamp Fecha;
    int esCerrada;
    int esActivo;
    Double MontoTotal;
    Double MontoTotalIVA;
    Double MontoMulta;

    public Double getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        MontoTotal = montoTotal;
    }

    public Factura() {}

    public int getFactura() {
        return Factura;
    }

    public void setFactura(int factura) {
        Factura = factura;
    }

    public Timestamp getFecha() {
        return Fecha;
    }

    public void setFecha(Timestamp fecha) {
        Fecha = fecha;
    }

    public int getEsCerrada() {
        return esCerrada;
    }

    public void setEsCerrada(int esCerrada) {
        this.esCerrada = esCerrada;
    }

    public int getEsActivo() {
        return esActivo;
    }

    public void setEsActivo(int esActivo) {
        this.esActivo = esActivo;
    }

    public Double getMontoTotalIVA() {
        return MontoTotalIVA;
    }

    public void setMontoTotalIVA(Double montoTotalIVA) {
        MontoTotalIVA = montoTotalIVA;
    }

    public Double getMontoMulta() {
        return MontoMulta;
    }

    public void setMontoMulta(Double montoMulta) {
        MontoMulta = montoMulta;
    }
}
