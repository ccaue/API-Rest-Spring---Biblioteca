package com.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name="emprestimo")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="clienteId")
    private Long clienteId;
    
    @Column(name="livroId")
    private Long livroId;
    
    @Column(name="dataEmprestimo")
    private LocalDate dataEmprestimo;
    
    @Column(name="dataDevolucao")
    private LocalDate dataDevolucao;
}
