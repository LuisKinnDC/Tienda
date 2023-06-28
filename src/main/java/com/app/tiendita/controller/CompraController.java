package com.app.tiendita.controller;

import com.app.tiendita.entity.Compra;
import com.app.tiendita.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class CompraController {
    @Autowired
    CompraService compraService;

    @PostMapping
    public Compra registrar(@RequestBody Compra compra){
        return compraService.registrar(compra);
    }
    @PutMapping
    public Compra actualizar(@RequestBody Compra compra){
        return compraService.actualizar(compra);
    }
    @DeleteMapping
    public void eliminar(@RequestBody Compra compra){
        compraService.eliminar(compra);
    }
    @GetMapping
    public List<Compra> consultar(){
        return compraService.consultar();
    }
}
