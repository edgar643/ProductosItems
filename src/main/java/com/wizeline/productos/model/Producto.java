/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wizeline.productos.model;

import com.wizeline.productos.model.Item;

/**
 *
 * @author edgargarcia
 */
public class Producto {
    private Item item;
    private Integer cantidad;

    public Producto() {
    }

    public Producto(Item item, Integer cantidad) {
        this.item = item;
        this.cantidad = cantidad;
    }

    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
