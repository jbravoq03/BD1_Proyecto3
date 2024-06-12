package org.bdi.proyecto3.service;

import org.bdi.proyecto3.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.bdi.proyecto3.repository.IEmpleadosRepository;

import java.util.List;

@Service
public class EmpleadosService implements IEmpleadosService{

    @Autowired
    private IEmpleadosRepository iEmpleadosRepository;

    @Override
    public List<Factura> listFacturas(String pNumero, String pIp) {
        List<Factura> list;
        try{
            list = iEmpleadosRepository.listFacturas(pNumero, pIp);
        }catch (Exception ex){
            throw ex;
        }
        return list;
    }
    @Override
    public List<Detalle> listDetalles(int pFactura, String pIp){
        List<Detalle> list;
        try{
            list = iEmpleadosRepository.listDetalles(pFactura, pIp);
        }catch (Exception ex){
            throw ex;
        }
        return list;
    }
    @Override
    public List<HistorialLlamada> listLlamadas(int pFactura, String pIp)
    {
        List<HistorialLlamada> list;
        try{
            list = iEmpleadosRepository.listLlamadas(pFactura, pIp);
        }catch (Exception ex){
            throw ex;
        }
        return list;
    }
    @Override
    public List<HistorialUsoDatos> listDatos(int pFactura, String pIp)
    {
        List<HistorialUsoDatos> list;
        try{
            list = iEmpleadosRepository.listDatos(pFactura, pIp);
        }catch (Exception ex){
            throw ex;
        }
        return list;
    }

}
