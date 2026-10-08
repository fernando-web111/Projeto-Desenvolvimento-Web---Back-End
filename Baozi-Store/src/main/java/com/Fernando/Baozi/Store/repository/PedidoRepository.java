package com.Fernando.Baozi.Store.repository;

import com.Fernando.Baozi.Store.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}