package com.perfumelandia.carritoservice.controller;

import com.perfumelandia.carritoservice.model.Carrito;
import com.perfumelandia.carritoservice.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.perfumelandia.carritoservice.model.Producto;

@RestController
@RequestMapping("/api/v1/carritos")
public class CarritoController {

    private final CarritoService servicio;
    private final RestTemplate restTemplate;
    public CarritoController(CarritoService servicio,  RestTemplate restTemplate){
        this.servicio = servicio;
        this.restTemplate = restTemplate;
    }

    @Autowired
    private CarritoService carritoService;

    @PostMapping
    public Carrito crear(@RequestBody Carrito carrito) {
        return carritoService.crear(carrito);
    }

    @PutMapping("/{id}/agregar")
    public Carrito agregarProducto(@PathVariable Long id, @RequestParam Long productoId) {
        return carritoService.agregarProducto(id, productoId);
    }

    @PutMapping("/{id}/eliminar")
    public Carrito eliminarProducto(@PathVariable Long id, @RequestParam Long productoId) {
        return carritoService.eliminarProducto(id, productoId);
    }

    @GetMapping("/{id}")
    public Carrito obtener(@PathVariable Long id) {
        return carritoService.obtener(id).orElseThrow();
    }

    //Nuevo
    @GetMapping("/productos/{id}")
    public Producto obtenerProducto(@PathVariable long id){
        return restTemplate.getForObject("http://localhost:8086/api/productos/"+id, Producto.class);
    }
}

