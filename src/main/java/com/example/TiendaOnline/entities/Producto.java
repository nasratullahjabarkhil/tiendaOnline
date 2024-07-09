package com.example.TiendaOnline.entities;

public class Producto {

    public int idProdcuto;
    public String nombreProduct;
    public String descripcion;
    public double precio;
    public int stock;

    public Producto(int idProdcuto, double precio, String descripcion, String nombreProduct, int stock) {
        this.idProdcuto = idProdcuto;
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombreProduct = nombreProduct;
        this.stock = stock;
    }

    public int getIdProdcuto() {
        return idProdcuto;
    }

    public void setIdProdcuto(int idProdcuto) {
        this.idProdcuto = idProdcuto;
    }

    public String getNombreProduct() {
        return nombreProduct;
    }

    public void setNombreProduct(String nombreProduct) {
        this.nombreProduct = nombreProduct;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
