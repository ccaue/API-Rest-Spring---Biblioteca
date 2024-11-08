package com.biblioteca.controller;

import com.biblioteca.model.Cliente;
import com.biblioteca.repository.RepositoryClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/v1")
public class ControllerCliente implements InterfaceCliente {

    @Autowired
    private RepositoryClienteDAO repoClienteDAO;

    @PostMapping("/cliente")
    @Override
    public Cliente salvarCliente(@RequestBody Cliente cliente) {
        return repoClienteDAO.save(cliente);
    }

    @PutMapping("/cliente")
    @Override
    public Cliente alterarCliente(@RequestBody Cliente cliente) {
        return repoClienteDAO.save(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    @Override
    public void excluirCliente(@PathVariable Long id) {
    	repoClienteDAO.deleteById(id);
    }

    @GetMapping("/cliente/{id}")
    @Override
    public Optional<Cliente> buscarCliente(@PathVariable Long id) {
        return repoClienteDAO.findById(id);
    }

    @GetMapping("/cliente")
    @Override
    public List<Cliente> listarTodos() {
        return repoClienteDAO.findAll();
    }
}
