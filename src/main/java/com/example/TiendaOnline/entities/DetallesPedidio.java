package com.example.TiendaOnline.entities;

public class DetallesPedidio {
    public int idDetalles;
    public int idPedido;
    public int idProducto;
    public int cantidad;
    public double precioUnitario;

    public DetallesPedidio(int idDetalles, int idPedido, int idProducto, int cantidad, double precioUnitario) {
        this.idDetalles = idDetalles;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getIdDetalles() {
        return idDetalles;
    }

    public void setIdDetalles(int idDetalles) {
        this.idDetalles = idDetalles;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
