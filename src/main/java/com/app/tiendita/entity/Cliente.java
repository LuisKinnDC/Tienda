package com.app.tiendita.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table
public class Cliente {
    @Id
    String ruc;
    String direccion;
    String nombres;
    String apellidos;

    @OneToMany(fetch =FetchType.LAZY, mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Compra> compras;

    public Cliente(){}

    public Cliente(String ruc, String direccion ,String nombres, String apellidos) {
        this.ruc = ruc;
        this.direccion = direccion;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

}
