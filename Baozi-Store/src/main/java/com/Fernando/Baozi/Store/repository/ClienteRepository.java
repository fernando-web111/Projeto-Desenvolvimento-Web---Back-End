package com.Fernando.Baozi.Store.repository;

import com.Fernando.Baozi.Store.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}