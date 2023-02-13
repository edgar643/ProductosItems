package com.wizeline.productos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author edgargarcia
 */
@Configuration
public class AppConfig {
    @Bean("clienteRest")
    public RestTemplate registrarRestTemplate(){
    return new RestTemplate();
    }
}
