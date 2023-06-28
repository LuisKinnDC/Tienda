package com.app.tiendita.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table
public class Producto {
    @Id
    String idProducto;
    String descripcion;
    String cantidad;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Compra> compras;



    public Producto(){}

    public Producto(String idProducto, String descripcion, String cantidad) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

}
