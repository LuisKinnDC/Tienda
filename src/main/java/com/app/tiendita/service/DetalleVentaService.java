package com.app.tiendita.service;

import com.app.tiendita.entity.DetalleVenta;

import java.util.List;

public interface DetalleVentaService {
    public DetalleVenta registrar(DetalleVenta detalleVenta);
    public DetalleVenta actualizar(DetalleVenta detalleVenta);
    public void eliminar(DetalleVenta detalleVenta);
    public List<DetalleVenta> consultar();
}
