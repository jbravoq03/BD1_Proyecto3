package org.bdi.proyecto3.model;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.sql.Timestamp;

public class HistorialLlamada {
    String numDesde;
    String numA;
    Timestamp Inicio;
    Timestamp Final;
    Timestamp Fecha;

    public HistorialLlamada() {}

    public String getNumDesde() {
        return numDesde;
    }

    public void setNumDesde(String numDesde) {
        this.numDesde = numDesde;
    }

    public String getNumA() {
        return numA;
    }

    public void setNumA(String numA) {
        this.numA = numA;
    }

    public Timestamp getInicio() {
        return Inicio;
    }

    public void setInicio(Timestamp inicio) {
        Inicio = inicio;
    }

    public Timestamp getFinal() {
        return Final;
    }

    public void setFinal(Timestamp aFinal) {
        Final = aFinal;
    }

    public Timestamp getFecha() {
        return Fecha;
    }

    public void setFecha(Timestamp fecha) {
        Fecha = fecha;
    }
}
