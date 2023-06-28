package com.app.tiendita.repository;

import com.app.tiendita.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {
}
