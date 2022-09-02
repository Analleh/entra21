package com.entra21.primeiroprojetospring.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity // entidade do banco de dados
@Table (name = "franquia") // informar qual tabela
public class FranquiaEntity {
    @Column(name = "id") // informar qual coluna da tabela
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;
}
