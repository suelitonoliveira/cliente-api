package com.example.cliente.model.repository;

import com.example.cliente.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Cliente, Integer> {
}
