package com.Fernando.Baozi.Store.repository;

import com.Fernando.Baozi.Store.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}