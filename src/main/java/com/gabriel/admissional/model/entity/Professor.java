package com.gabriel.admissional.model.entity;

import com.gabriel.admissional.model.base.iUsuarios;

import javax.persistence.*;

@Entity
public class Professor implements iUsuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String titulacao;
    
    Professor (String nome, String titulacao) {
    	this.nome = nome;
    	this.titulacao = titulacao;
    }
   
    public Professor() {
	
    }

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

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", nome=" + nome + ", titulacao=" + titulacao + "]";
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

    }

    @Override
    public Integer obterMatricula() {
        return null;
    }
}
