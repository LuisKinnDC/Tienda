package com.app.tiendita.service;

import com.app.tiendita.entity.DetalleVenta;
import com.app.tiendita.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaServiceImp implements DetalleVentaService{
    @Autowired
    DetalleVentaRepository detalleVentaRepository;

    @Override
    public DetalleVenta registrar(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    @Override
    public DetalleVenta actualizar(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    @Override
    public void eliminar(DetalleVenta detalleVenta) {
        detalleVentaRepository.delete(detalleVenta);
    }

    @Override
    public List<DetalleVenta> consultar() {
        return detalleVentaRepository.findAll();
    }
}
