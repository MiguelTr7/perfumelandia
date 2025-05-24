package com.carritoservice.carritoservice.controller;

import com.carritoservice.carritoservice.model.Producto;
import com.carritoservice.carritoservice.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @PostMapping("/agregar")
    public ResponseEntity<String> agregarProducto(@RequestBody Producto producto) {
        try {
            carritoService.agregarProducto(producto);
            return ResponseEntity.ok("Producto agregado al carrito");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminarProducto(@PathVariable int id) {
        boolean eliminado = carritoService.eliminarProducto(id);
        if (eliminado) {
            return ResponseEntity.ok("Producto eliminado del carrito");
        } else {
            return ResponseEntity.badRequest().body("Producto no encontrado en el carrito");
        }
    }

    @GetMapping("/ver")
    public ResponseEntity<List<Producto>> verCarrito() {
        return ResponseEntity.ok(carritoService.verProductos());
    }

    @PostMapping("/comprar")
    public ResponseEntity<String> comprar() {
        carritoService.comprar();
        return ResponseEntity.ok("Compra realizada con éxito");
    }
}
//Holaaa
