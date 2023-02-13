/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wizeline.productos.controller;

import com.wizeline.productos.model.Producto;
import com.wizeline.productos.service.ItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author edgargarcia
 */
@RestController
public class ProductoController {

    @Autowired
    private ItemService itemService;
    

    @GetMapping("/listar")
    public List<Producto> listar() {
        return itemService.findAll();

    }
    @GetMapping("/detalle/{codigo}/cantidad/{cantidad}")
    public Producto detalle(@PathVariable Long codigo,@PathVariable Integer cantidad){
    return itemService.findById(codigo, cantidad);
    
    }
}
