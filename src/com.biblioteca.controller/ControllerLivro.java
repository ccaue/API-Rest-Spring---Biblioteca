package com.biblioteca.controller;

import com.biblioteca.model.Livro;
import com.biblioteca.repository.RepositoryLivroDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/v1")
public class ControllerLivro implements InterfaceLivro {

    @Autowired
    private RepositoryLivroDAO repoLivroDAO;

    @PostMapping("/livro")
    @Override
    public Livro salvarLivro(@RequestBody Livro livro) {
        return repoLivroDAO.save(livro);
    }

    @PutMapping("/livro")
    @Override
    public Livro alterarLivro(@RequestBody Livro livro) {
        return repoLivroDAO.save(livro);
    }

    @DeleteMapping("/livro/{id}")
    @Override
    public void excluirLivro(@PathVariable Long id) {
    	repoLivroDAO.deleteById(id);
    }

    @GetMapping("/livro/{id}")
    @Override
    public Optional<Livro> buscarLivro(@PathVariable Long id) {
        return repoLivroDAO.findById(id);
    }

    @GetMapping("/livro")
    @Override
    public List<Livro> listarTodos() {
        return repoLivroDAO.findAll();
    }
}
