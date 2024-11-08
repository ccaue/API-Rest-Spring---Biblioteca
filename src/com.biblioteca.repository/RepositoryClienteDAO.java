package com.biblioteca.repository;

import com.biblioteca.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryClienteDAO extends JpaRepository<Cliente, Long> {
}
