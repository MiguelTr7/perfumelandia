package com.carritoservice.carritoservice.service;

import com.carritoservice.carritoservice.model.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarritoService {

    private final List<Producto> carrito = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        carrito.add(producto);
    }

    public void eliminarProducto(int id) {
        carrito.removeIf(p -> p.getId() == id);
    }

    public List<Producto> verProductos() {
        return carrito;
    }

    public void comprar() {
        carrito.clear();
    }
}
