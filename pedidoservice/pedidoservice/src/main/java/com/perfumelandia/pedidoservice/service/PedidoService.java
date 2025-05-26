
package com.perfumelandia.pedidoservice.service;

import com.perfumelandia.pedidoservice.model.EstadoPedido;
import com.perfumelandia.pedidoservice.model.Pedido;
import com.perfumelandia.pedidoservice.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public Pedido crear(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido actualizarEstado(Long id, EstadoPedido nuevoEstado) {
        Pedido pedido = pedidoRepository.findById(id).orElseThrow();
        pedido.setEstado(nuevoEstado);
        return pedidoRepository.save(pedido);
    }
}