package com.app.tiendita.service;

import com.app.tiendita.entity.Producto;

import java.util.List;

public interface ProductoService {
    public Producto registrar(Producto producto);
    public Producto actualizar(Producto producto);
    public void eliminar(Producto producto);
    public List<Producto> consultar();
}
