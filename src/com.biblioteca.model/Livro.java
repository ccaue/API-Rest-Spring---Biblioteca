package com.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponibilidade;
}
