package com.app.tiendita.service;

import com.app.tiendita.entity.Venta;

import java.util.List;

public interface VentaService {
    public Venta registrar(Venta venta);
    public Venta actualizar(Venta venta);
    public void eliminar(Venta venta);
    public List<Venta> consultar();
}
