package com.app.tiendita.controller;

import com.app.tiendita.entity.Venta;
import com.app.tiendita.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    VentaService ventaService;

    @PostMapping
    public Venta registrar(@RequestBody Venta venta){
        return ventaService.registrar(venta);
    }
    @PutMapping
    public Venta actualizar(@RequestBody Venta venta){
        return ventaService.actualizar(venta);
    }
    @DeleteMapping
    public void eliminar(@RequestBody Venta venta){
        ventaService.eliminar(venta);
    }
    @GetMapping
    public List<Venta> consultar(){
        return ventaService.consultar();
    }
}
