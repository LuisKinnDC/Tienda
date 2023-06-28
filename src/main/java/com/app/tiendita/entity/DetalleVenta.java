package com.app.tiendita.entity;

import jakarta.persistence.*;

@Entity
@Table
public class DetalleVenta {
    @Id
    String idDetalleVenta;
    String unidadMedida;
    String valorUnitario;
    Float descuento;
    String importeVenta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Venta")
    private Venta venta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Compra")
    private Compra compra;

    public DetalleVenta(){}

    public DetalleVenta(String idDetalleVenta, String unidadMedida, String valorUnitario, Float descuento, String importeVenta) {
        this.idDetalleVenta = idDetalleVenta;
        this.unidadMedida = unidadMedida;
        this.valorUnitario = valorUnitario;
        this.descuento = descuento;
        this.importeVenta = importeVenta;
    }

    public String getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(String idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    public String getImporteVenta() {
        return importeVenta;
    }

    public void setImporteVenta(String importeVenta) {
        this.importeVenta = importeVenta;
    }

}
