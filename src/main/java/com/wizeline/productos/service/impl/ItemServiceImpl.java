/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wizeline.productos.service.impl;


import com.wizeline.productos.model.Item;
import com.wizeline.productos.model.Producto;
import com.wizeline.productos.service.ItemService;
import java.util.List;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
        import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 *
 * @author edgargarcia
 */
@Service
public class ItemServiceImpl implements ItemService {
@Autowired
    private RestTemplate clienteRest;
    @Override
    public List<Producto> findAll() {

       List<Item> items = Arrays.asList(clienteRest.getForObject("http://localhost:8001/listar", Item[ ].class));
    return items.stream().map(p -> new Producto(p,1) ).collect(Collectors.toList());
    }

    @Override
    public Producto findById(Long id, Integer cantidad) {
        //Map<String,String> pathVariables = new HashMap<String,String>();
      Item item=clienteRest.getForObject("http://localhost:8001/detalle/"+String.valueOf(id), Item.class);
      return new Producto(item,cantidad ); 
    }
    
}
