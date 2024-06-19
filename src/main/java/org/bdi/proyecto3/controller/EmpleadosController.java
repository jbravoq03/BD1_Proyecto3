package org.bdi.proyecto3.controller;

import org.bdi.proyecto3.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.bdi.proyecto3.service.IEmpleadosService;
import org.bdi.proyecto3.model.ServiceResponse;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class EmpleadosController {

    @Autowired
    private IEmpleadosService iEmpleadosService;

    @GetMapping("/telefonia/listF/{numero}")
    public ResponseEntity<List<Factura>> getFacturas(@PathVariable("numero") String numero){
        String ip;

        ip = getIPAddress();

        var result = iEmpleadosService.listFacturas(numero, ip);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/telefonia/listD/{id}")
    public ResponseEntity<List<Detalle>> getDetalles(@PathVariable("id") int id){
        String ip;

        ip = getIPAddress();

        var result = iEmpleadosService.listDetalles(id, ip);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/telefonia/listHL/{id}")
    public ResponseEntity<List<HistorialLlamada>> getLlamadas(@PathVariable("id") int id){
        String ip;

        ip = getIPAddress();

        var result = iEmpleadosService.listLlamadas(id, ip);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/telefonia/listHD/{id}")
    public ResponseEntity<List<HistorialUsoDatos>> getDatos(@PathVariable("id") int id){
        String ip;

        ip = getIPAddress();

        var result = iEmpleadosService.listDatos(id, ip);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    private String getIPAddress() {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            return localHost.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace(); // Manejo de la excepción si no se puede obtener la dirección IP
            return "No se pudo obtener la dirección IP";
        }
    }




}
