package org.bdi.proyecto3.repository;

import org.bdi.proyecto3.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpleadosRepository implements IEmpleadosRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Factura> listFacturas(String pNumero, String pIp) {
        String sql = "{CALL dbo.BuscarFactura (?, ?, ?)}";

        return jdbcTemplate.execute(sql, (CallableStatementCallback<List<Factura>>) cs -> {
            cs.setString(1, pNumero);
            cs.setString(2, pIp);
            cs.registerOutParameter(3, Types.INTEGER);

            cs.execute();

            List<Factura> facturas = new ArrayList<>();
            try (ResultSet rs = cs.getResultSet()) {
                while (rs.next()) {
                    Factura factura = new Factura();
                    factura.setFactura(rs.getInt("Id"));
                    factura.setFecha(rs.getTimestamp("Fecha"));
                    factura.setEsCerrada(rs.getInt("esCerrada"));
                    factura.setEsActivo(rs.getInt("esActivo"));
                    factura.setMontoTotal(rs.getDouble("MontoTotal"));
                    factura.setMontoTotalIVA(rs.getDouble("MontoTotalIVA"));
                    factura.setMontoMulta(rs.getDouble("MontoMulta"));
                    facturas.add(factura);
                }
            }
            return facturas;
        });
    }


    public List<Detalle> listDetalles(int pFactura, String pIp){

        String sql = "{CALL dbo.BuscarDetalle (?, ?, ?)}";

        return jdbcTemplate.execute(sql, (CallableStatementCallback<List<Detalle>>) cs -> {
            cs.setInt(1, pFactura);
            cs.setString(2, pIp);
            cs.registerOutParameter(3, Types.INTEGER);

            cs.execute();

            List<Detalle> detalles = new ArrayList<>();
            try (ResultSet rs = cs.getResultSet()) {
                while (rs.next()) {
                    Detalle detalle = new Detalle();

                    detalle.setTarifaBasica(rs.getDouble("TarifaBasica"));
                    detalle.setMinutosExceso(rs.getDouble("MinutosExceso"));
                    detalle.setGigasExceso(rs.getDouble("GigasExceso"));
                    detalle.setLlamadasFamiliares(rs.getDouble("LlamadasFamiliares"));
                    detalle.setLlamadas911(rs.getDouble("Llamadas911"));
                    detalle.setLlamadas110(rs.getDouble("Llamadas110"));
                    detalle.setLlamadas900(rs.getDouble("Llamadas900"));
                    detalle.setLlamadas800(rs.getDouble("Llamadas800"));

                    detalles.add(detalle);
                }
            }
            return detalles;
        });

    }

    public List<HistorialLlamada> listLlamadas(int pFactura, String pIp){

        String sql = "{CALL dbo.HistorialDetalle (?, ?, ?)}";

        return jdbcTemplate.execute(sql, (CallableStatementCallback<List<HistorialLlamada>>) cs -> {
            cs.setInt(1, pFactura);
            cs.setString(2, pIp);
            cs.registerOutParameter(3, Types.INTEGER);

            cs.execute();

            List<HistorialLlamada> Llamadas = new ArrayList<>();
            try (ResultSet rs = cs.getResultSet()) {
                while (rs.next()) {
                    HistorialLlamada llamada = new HistorialLlamada();

                    llamada.setNumDesde(rs.getString("numDesde"));
                    llamada.setNumA(rs.getString("numA"));

                    llamada.setInicio(rs.getTimestamp("horaInicio"));
                    llamada.setFinal(rs.getTimestamp("horaFin"));
                    llamada.setFecha(rs.getTimestamp("Fecha"));

                    Llamadas.add(llamada);
                }
            }
            return Llamadas;
        });

    }

    public List<HistorialUsoDatos> listDatos(int pFactura, String pIp){

        String sql = "{CALL dbo.HistorialDetalleDatos (?, ?, ?)}";

        return jdbcTemplate.execute(sql, (CallableStatementCallback<List<HistorialUsoDatos>>) cs -> {
            cs.setInt(1, pFactura);
            cs.setString(2, pIp);
            cs.registerOutParameter(3, Types.INTEGER);

            cs.execute();

            List<HistorialUsoDatos> Datos = new ArrayList<>();
            try (ResultSet rs = cs.getResultSet()) {
                while (rs.next()) {
                    HistorialUsoDatos dato = new HistorialUsoDatos();

                    dato.setNumero(rs.getString("numero"));
                    dato.setQGigas(rs.getDouble("QGigas"));

                    dato.setFecha(rs.getTimestamp("Fecha"));


                    Datos.add(dato);
                }
            }
            return Datos;
        });


    }

}
