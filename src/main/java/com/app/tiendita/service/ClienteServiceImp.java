package com.app.tiendita.service;

import com.app.tiendita.entity.Cliente;
import com.app.tiendita.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceImp implements ClienteService{
    @Autowired
    ClienteRepository clienteRepository;
    @Override
    public Cliente registrar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void eliminar(Cliente cliente) {
        clienteRepository.delete(cliente);
    }

    @Override
    public List<Cliente> consultar() {
        return clienteRepository.findAll();
    }
}
