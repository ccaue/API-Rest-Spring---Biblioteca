package com.biblioteca.controller;

import com.biblioteca.model.Livro;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.Optional;

public interface InterfaceLivro {
    Livro salvarLivro(@RequestBody Livro livro);
    Livro alterarLivro(@RequestBody Livro livro);
    void excluirLivro(@PathVariable Long id);
    Optional<Livro> buscarLivro(@PathVariable Long id);
    List<Livro> listarTodos();
}
