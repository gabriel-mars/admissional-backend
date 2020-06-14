package com.gabriel.admissional.model.entity;

import com.gabriel.admissional.model.base.iUsuarios;

import javax.persistence.*;

@Entity
public class Aluno implements iUsuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer matricula;

    Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public Aluno() {}

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
    public void definirNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String obterNome() {
        return this.nome;
    }

    @Override
    public void definirMatricula(Integer numeroMatricula) {
        this.matricula = numeroMatricula;
    }

    @Override
    public Integer obterMatricula() {
        return this.matricula;
    }
}
