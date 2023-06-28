package com.app.tiendita.service;

import com.app.tiendita.entity.Compra;
import com.app.tiendita.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompraServiceImp implements CompraService{
    @Autowired
    CompraRepository compraRepository;
    @Override
    public Compra registrar(Compra compra) {
        return compraRepository.save(compra);
    }

    @Override
    public Compra actualizar(Compra compra) {
        return compraRepository.save(compra);
    }

    @Override
    public void eliminar(Compra compra) {
        compraRepository.delete(compra);
    }

    @Override
    public List<Compra> consultar() {
        return compraRepository.findAll();
    }
}
