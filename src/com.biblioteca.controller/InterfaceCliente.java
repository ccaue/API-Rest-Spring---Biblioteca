package com.biblioteca.controller;

import com.biblioteca.model.Cliente;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.Optional;

public interface InterfaceCliente {
    Cliente salvarCliente(@RequestBody Cliente cliente);
    Cliente alterarCliente(@RequestBody Cliente cliente);
    void excluirCliente(@PathVariable Long id);
    Optional<Cliente> buscarCliente(@PathVariable Long id);
    List<Cliente> listarTodos();
}
