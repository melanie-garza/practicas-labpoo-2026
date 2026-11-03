package com.gremio.repository;

import com.gremio.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
    // Spring Data JPA genera los métodos de SQL automáticamente
}