package com.example.demorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demorest.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}