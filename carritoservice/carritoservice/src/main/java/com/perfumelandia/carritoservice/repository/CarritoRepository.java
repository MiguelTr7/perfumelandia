package com.perfumelandia.carritoservice.repository;

import com.perfumelandia.carritoservice.model.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoRepository extends JpaRepository<Carrito, Long> {
}