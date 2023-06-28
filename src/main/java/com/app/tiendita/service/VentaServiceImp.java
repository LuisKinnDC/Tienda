package com.app.tiendita.service;

import com.app.tiendita.entity.Venta;
import com.app.tiendita.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImp implements VentaService{
    @Autowired
    VentaRepository ventaRepository;

    @Override
    public Venta registrar(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public Venta actualizar(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public void eliminar(Venta venta) {
        ventaRepository.delete(venta);
    }

    @Override
    public List<Venta> consultar() {
        return ventaRepository.findAll();
    }
}
