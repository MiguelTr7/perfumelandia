package com.carritoservice.carritoservice.service;

import com.carritoservice.carritoservice.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CarritoService {

    private final List<Producto> carrito = Collections.synchronizedList(new ArrayList<>());

    @Autowired
    private ProductoValidatorService productoValidator;

    public void agregarProducto(Producto producto) {
        if (!productoValidator.validarProductoExistente((long) producto.getId())) {
            throw new IllegalArgumentException("El producto con ID " + producto.getId() + " no existe.");
        }
        carrito.add(producto);
    }

    public boolean eliminarProducto(int id) {
        return carrito.removeIf(p -> p.getId() == id);
    }

    public List<Producto> verProductos() {
        return new ArrayList<>(carrito);
    }

    public void comprar() {
        carrito.clear();
    }
}
