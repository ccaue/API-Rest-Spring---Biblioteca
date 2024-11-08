package com.biblioteca.controller;

import com.biblioteca.model.Devolucao;
import com.biblioteca.repository.RepositoryDevolucaoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/v1")
public class ControllerDevolucao implements InterfaceDevolucao {

    @Autowired
    private RepositoryDevolucaoDAO repoDevolucaoDAO;

    @PostMapping("/devolucao")
    @Override
    public Devolucao salvarDevolucao(@RequestBody Devolucao devolucao) {
        return repoDevolucaoDAO.save(devolucao);
    }

    @PutMapping("/devolucao")
    @Override
    public Devolucao alterarDevolucao(@RequestBody Devolucao devolucao) {
        return repoDevolucaoDAO.save(devolucao);
    }

    @DeleteMapping("/devolucao/{id}")
    @Override
    public void excluirDevolucao(@PathVariable Long id) {
    	repoDevolucaoDAO.deleteById(id);
    }

    @GetMapping("/devolucao/{id}")
    @Override
    public Optional<Devolucao> buscarDevolucao(@PathVariable Long id) {
        return repoDevolucaoDAO.findById(id);
    }

    @GetMapping("/devolucao")
    @Override
    public List<Devolucao> listarTodos() {
        return repoDevolucaoDAO.findAll();
    }
}
