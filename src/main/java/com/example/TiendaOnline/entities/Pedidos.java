package com.example.TiendaOnline.entities;

import java.util.Date;

public class Pedidos {

    public int idPedido;
    public int idCliente;
    public Date fechaPedido;
    public double total;

    public Pedidos(int idPedido, int idCliente, double total, Date fechaPedido) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.total = total;
        this.fechaPedido = fechaPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
