package org.bdi.proyecto3.service;

import org.bdi.proyecto3.model.*;

import java.util.List;

public interface IEmpleadosService {

    public List<Factura> listFacturas(String pNumero, String pIp);

    public List<Detalle> listDetalles(int pFactura, String pIp);

    public List<HistorialLlamada> listLlamadas(int pFactura, String pIp);

    public List<HistorialUsoDatos> listDatos(int pFactura, String pIp);

}
