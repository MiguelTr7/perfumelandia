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

    // Cuando el usuario quiera agregar un producto al carrito, se usará este metodo
    @PostMapping("/agregar")
    public String agregarProducto(@RequestBody Producto producto) {
        carritoService.agregarProducto(producto); // Llamamos al servicio para agregar el producto
        return "Producto agregado al carrito";
    }

    // Este metodo sirve para eliminar un producto del carrito usando su ID
    @DeleteMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable int id) {
        carritoService.eliminarProducto(id); // Quitamos el producto que tenga ese ID
        return "Producto eliminado del carrito";
    }

    // Este metodo muestra todos los productos que hay actualmente en el carrito
    @GetMapping("/ver")
    public List<Producto> verCarrito() {
        return carritoService.verProductos();
    }

    // Este metodo se usa cuando el usuario decide comprar los productos del carrito
    @PostMapping("/comprar")
    public String comprar() {
        carritoService.comprar(); // Llamamos al servicio para realizar la compra
        return "Compra realizada con éxito";
    }
}

