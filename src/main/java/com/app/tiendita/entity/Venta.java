package com.app.tiendita.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
@Table
public class Venta {
    @Id
    String idVenta;
    String observacion;
    Date fechaEmision;
    String tipoMoneda;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "venta", cascade = CascadeType.ALL)
    private List<DetalleVenta> detalleVentas;

    public Venta(){}

    public Venta(String idVenta, String observacion, Date fechaEmision, String tipoMoneda) {
        this.idVenta = idVenta;
        this.observacion = observacion;
        this.fechaEmision = fechaEmision;
        this.tipoMoneda = tipoMoneda;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

}
