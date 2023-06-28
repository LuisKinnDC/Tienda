package com.app.tiendita.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table
public class Compra {
    @Id
    String idCompra;
    Date fecha;
    String cantidad;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ruc")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Producto")
    private Producto producto;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "compra", cascade = CascadeType.ALL)
    private List<DetalleVenta> detalleVentas;




    public Compra(){}

    public Compra(String idCompra, Date fecha, String cantidad) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }


}
