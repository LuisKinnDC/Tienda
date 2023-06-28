package com.app.tiendita.service;

import com.app.tiendita.entity.Cliente;

import java.util.List;

public interface ClienteService {
    public Cliente registrar(Cliente cliente);
    public Cliente actualizar(Cliente cliente);
    public void eliminar(Cliente cliente);
    public List<Cliente> consultar();
}
