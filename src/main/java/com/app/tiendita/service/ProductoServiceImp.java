package com.app.tiendita.service;

import com.app.tiendita.entity.Producto;
import com.app.tiendita.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImp implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;

    @Override
    public Producto registrar(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizar(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void eliminar(Producto producto) {
        productoRepository.delete(producto);
    }

    @Override
    public List<Producto> consultar() {
        return productoRepository.findAll();
    }
}
