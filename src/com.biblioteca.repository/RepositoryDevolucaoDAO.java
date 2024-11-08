package com.biblioteca.repository;

import com.biblioteca.model.Devolucao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDevolucaoDAO extends JpaRepository<Devolucao, Long> {
}
