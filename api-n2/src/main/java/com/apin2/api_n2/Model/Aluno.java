package com.apin2.api_n2.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Entity
@Table(name = "TABELA_ALUNO")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String rg;

    @Column(nullable = false)
    private String curso;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private String telefone;
}
