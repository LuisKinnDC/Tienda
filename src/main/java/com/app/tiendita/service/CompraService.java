package com.app.tiendita.service;

import com.app.tiendita.entity.Cliente;
import com.app.tiendita.entity.Compra;

import java.util.List;

public interface CompraService {
    public Compra registrar(Compra compra);
    public Compra actualizar(Compra compra);
    public void eliminar(Compra compra);
    public List<Compra> consultar();
}
