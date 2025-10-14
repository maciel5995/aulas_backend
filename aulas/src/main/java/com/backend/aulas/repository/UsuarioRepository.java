package com.backend.aulas.repository;

import com.backend.aulas.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    boolean existsByEmail(String email);
}
