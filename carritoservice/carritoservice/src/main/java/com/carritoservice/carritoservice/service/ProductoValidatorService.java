package com.carritoservice.service;

import com.carritoservice.carritoservice.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductoValidatorService {

    @Autowired
    private RestTemplate restTemplate;

    public boolean validarProductoExistente(Long productoId) {
        try {
            String url = "http://localhost:8081/productos/" + productoId;
            Producto producto = restTemplate.getForObject(url, Producto.class);
            return producto != null;
        } catch (Exception e) {
            return false;
        }
    }
}
