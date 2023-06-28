package com.app.tiendita.controller;

import com.app.tiendita.entity.Producto;
import com.app.tiendita.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @PostMapping
    public Producto registrar(@RequestBody Producto producto){
        return productoService.registrar(producto);
    }
    @PutMapping
    public Producto actualizar(@RequestBody Producto producto){
        return productoService.actualizar(producto);
    }
    @DeleteMapping
    public void eliminar(@RequestBody Producto producto){
        productoService.eliminar(producto);
    }
    @GetMapping
    public List<Producto> consultar(){
        return productoService.consultar();
    }
}
