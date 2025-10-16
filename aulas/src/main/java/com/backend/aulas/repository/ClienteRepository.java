package com.backend.aulas.repository;

import com.backend.aulas.models.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    boolean existsByEmail(String email);
    Page<Cliente> findByNomeContainingIgnoreCase(String nome, Pageable pageable);
}
