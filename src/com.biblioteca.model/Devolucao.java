package com.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Devolucao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long emprestimoId;
    private LocalDate dataDevolucao;
    private boolean multa;
}
