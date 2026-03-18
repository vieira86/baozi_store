package com.example.demorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demorest.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}