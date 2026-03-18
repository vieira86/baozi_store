package com.example.demorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demorest.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}