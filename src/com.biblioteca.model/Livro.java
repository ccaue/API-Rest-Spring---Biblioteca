package com.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="titulo", length = 50)
    private String titulo;
    
    @Column(name="autor", length = 50)
    private String autor;
    
    @Column(name="ano")
    private int ano;
    
    @Column(name="capa")
    private String capa;

    @Column(name="quantidade")
    private int quantidade;
}
