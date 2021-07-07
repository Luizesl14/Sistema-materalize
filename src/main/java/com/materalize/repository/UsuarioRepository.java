package com.materalize.repository;

import com.materalize.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, String> {

      String findByEmail(String email);
      String findBySenha(String senha);
}
