/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wizeline.productos.service;

import com.wizeline.productos.model.Producto;
import java.util.List;

/**
 *
 * @author edgargarcia
 */
public interface ItemService {
    public List<Producto> findAll();
    public Producto findById(Long id,Integer cantidad);
}
