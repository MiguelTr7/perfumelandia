package com.perfumelandia.pedidoservice.repository;

import com.perfumelandia.pedidoservice.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
