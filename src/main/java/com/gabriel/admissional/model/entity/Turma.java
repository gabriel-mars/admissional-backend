package com.gabriel.admissional.model.entity;

import com.gabriel.admissional.model.base.iTurma;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
public class Turma implements iTurma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String sala;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataAbertura;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataEncerramento;
    
    @Getter @Setter
    @OneToMany
    @JoinColumn(name = "turma_id")
    private List<Aluno> alunos;
    
    @OneToOne
    @JoinColumn(name = "professor")
    private Professor professor;
    
    Turma(String codigo, String sala, Date dataAbertura, Date dataEncerramento) {
    	this.codigo = codigo;
    	this.sala = sala;
    	this.dataAbertura = dataAbertura;
    	this.dataEncerramento = dataEncerramento;
    }
    
    public Turma() {}

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
    public Boolean estaAberta() {
        return null;
    }

    @Override
    public void definirProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public void incluirAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
