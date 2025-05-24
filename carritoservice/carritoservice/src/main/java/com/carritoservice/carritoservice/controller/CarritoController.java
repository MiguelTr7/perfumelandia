package com.carritoservice.carritoservice.controller;

import com.carritoservice.carritoservice.model.Producto;
import com.carritoservice.carritoservice.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @PostMapping("/agregar")
    public String agregarProducto(@RequestBody Producto producto) {
        carritoService.agregarProducto(producto);
        return "Producto agregado al carrito";
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable int id) {
        carritoService.eliminarProducto(id);
        return "Producto eliminado del carrito";
    }

    @GetMapping("/ver")
    public List<Producto> verCarrito() {
        return carritoService.verProductos();
    }

    @PostMapping("/comprar")
    public String comprar() {
        carritoService.comprar();
        return "Compra realizada con éxito";
    }
}

