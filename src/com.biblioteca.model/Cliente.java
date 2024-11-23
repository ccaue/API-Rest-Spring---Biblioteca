package com.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="nome", length = 100, unique = true)
    private String nome;
    
    @Column(name="email")
    private String email;
    
    @Column(name="telefone")
    private String telefone;
    
    @Column(name="endereco")
    private String endereco;

    @Column(name="usuario")
    private String usuario;

    @Column(name="senha")
    private String senha;
}
