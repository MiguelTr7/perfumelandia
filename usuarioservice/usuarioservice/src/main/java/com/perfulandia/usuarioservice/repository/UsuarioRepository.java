package com.perfulandia.usuarioservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.perfulandia.usuarioservice.model.Usuario;
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
