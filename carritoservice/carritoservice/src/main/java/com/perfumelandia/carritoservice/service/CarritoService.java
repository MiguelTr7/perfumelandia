package com.perfumelandia.carritoservice.service;

import com.perfumelandia.carritoservice.model.Carrito;
import com.perfumelandia.carritoservice.repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    public Carrito crear(Carrito carrito) {
        return carritoRepository.save(carrito);
    }

    public Optional<Carrito> obtener(Long id) {
        return carritoRepository.findById(id);
    }

    public Carrito agregarProducto(Long carritoId, Long productoId) {
        Carrito carrito = carritoRepository.findById(carritoId).orElseThrow();
        carrito.getProductoIds().add(productoId);
        return carritoRepository.save(carrito);
    }

    public Carrito eliminarProducto(Long carritoId, Long productoId) {
        Carrito carrito = carritoRepository.findById(carritoId).orElseThrow();
        carrito.getProductoIds().remove(productoId);
        return carritoRepository.save(carrito);
    }


}
