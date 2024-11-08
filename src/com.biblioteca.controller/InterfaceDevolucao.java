package com.biblioteca.controller;

import com.biblioteca.model.Devolucao;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface InterfaceDevolucao {
    Devolucao salvarDevolucao(@RequestBody Devolucao devolucao);
    Devolucao alterarDevolucao(@RequestBody Devolucao devolucao);
    void excluirDevolucao(@PathVariable Long id);
    Optional<Devolucao> buscarDevolucao(@PathVariable Long id);
    List<Devolucao> listarTodos();
}
