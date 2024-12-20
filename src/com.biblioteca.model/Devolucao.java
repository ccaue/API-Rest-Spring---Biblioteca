package com.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name="devolucao")
public class Devolucao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="emprestimoId")
    private Long emprestimoId;
    
    @Column(name="dataDevolucao")
    private LocalDate dataDevolucao;
}
