package com.gabriel.admissional.model.entity;

import com.gabriel.admissional.model.base.iUsuarios;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Aluno implements iUsuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private Long id;
    @Getter @Setter private String nome;
    @Getter @Setter private Integer matricula;

    Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public void definirNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String obterNome() {
        return null;
    }

    @Override
    public void definirMatricula(Integer numeroMatricula) {
        this.matricula = numeroMatricula;
    }

    @Override
    public Integer obterMatricula() {
        return null;
    }
}
