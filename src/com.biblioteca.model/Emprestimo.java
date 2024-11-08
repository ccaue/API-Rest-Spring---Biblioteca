package com.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long clienteId;
    private Long livroId;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
}
