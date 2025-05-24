package com.carritoservice.carritoservice.service;

import com.carritoservice.carritoservice.model.Producto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductoValidatorService {

    private final RestTemplate restTemplate;

    public ProductoValidatorService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public boolean validarProductoExistente(Long productoId) {
        try {
            String url = "http://localhost:8081/productos/" + productoId;
            Producto producto = restTemplate.getForObject(url, Producto.class);
            return producto != null;
        } catch (HttpClientErrorException e) {
            return false;
        }
    }
}
