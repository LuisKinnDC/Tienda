package com.app.tiendita.controller;

import com.app.tiendita.entity.DetalleVenta;
import com.app.tiendita.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalleVenta")
public class DetalleVentaController {
    @Autowired
    DetalleVentaService detalleVentaService;
    @PostMapping
    public DetalleVenta registrar(@RequestBody DetalleVenta detalleVenta){
        return detalleVentaService.registrar(detalleVenta);
    }@PutMapping
    public DetalleVenta actualizar(@RequestBody DetalleVenta detalleVenta){
        return detalleVentaService.actualizar(detalleVenta);
    }
    @DeleteMapping
    public void eliminar(@RequestBody DetalleVenta detalleVenta){
        detalleVentaService.eliminar(detalleVenta);
    }
    @GetMapping
    public List<DetalleVenta> consultar(){
        return detalleVentaService.consultar();
    }
}
