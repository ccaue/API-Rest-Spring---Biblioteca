package com.biblioteca.controller;

import com.biblioteca.model.Emprestimo;
import com.biblioteca.repository.RepositoryEmprestimoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/v1")
public class ControllerEmprestimo implements InterfaceEmprestimo {

    @Autowired
    private RepositoryEmprestimoDAO repoEmprestimoDAO;

    @PostMapping("/emprestimo")
    @Override
    public Emprestimo salvarEmprestimo(@RequestBody Emprestimo emprestimo) {
        return repoEmprestimoDAO.save(emprestimo);
    }

    @PutMapping("/emprestimo")
    @Override
    public Emprestimo alterarEmprestimo(@RequestBody Emprestimo emprestimo) {
        return repoEmprestimoDAO.save(emprestimo);
    }

    @DeleteMapping("/emprestimo/{id}")
    @Override
    public void excluirEmprestimo(@PathVariable Long id) {
    	repoEmprestimoDAO.deleteById(id);
    }

    @GetMapping("/emprestimo/{id}")
    @Override
    public Optional<Emprestimo> buscarEmprestimo(@PathVariable Long id) {
        return repoEmprestimoDAO.findById(id);
    }

    @GetMapping("/emprestimo")
    @Override
    public List<Emprestimo> listarTodos() {
        return repoEmprestimoDAO.findAll();
    }
}
