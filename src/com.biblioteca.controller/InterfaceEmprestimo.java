package com.biblioteca.controller;

import com.biblioteca.model.Emprestimo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.Optional;

public interface InterfaceEmprestimo {
    Emprestimo salvarEmprestimo(@RequestBody Emprestimo emprestimo);
    Emprestimo alterarEmprestimo(@RequestBody Emprestimo emprestimo);
    void excluirEmprestimo(@PathVariable Long id);
    Optional<Emprestimo> buscarEmprestimo(@PathVariable Long id);
    List<Emprestimo> listarTodos();
}
