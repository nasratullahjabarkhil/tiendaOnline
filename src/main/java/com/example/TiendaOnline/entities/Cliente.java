package com.example.TiendaOnline.entities;

import jakarta.persistence.Entity;

@Entity
public class Cliente {
    public Integer idCliente;
    public String nombre;
    public String direccion;
    public String telefono;
    public String email;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String direccion, String telefono, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
