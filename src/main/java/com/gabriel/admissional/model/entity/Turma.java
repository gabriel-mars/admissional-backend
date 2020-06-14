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

import java.util.Date;
import java.util.List;

@Entity
public class Turma implements iTurma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private Long id;
    
    @Getter @Setter private String codigo;
    @Getter @Setter private String sala;
    @Getter @Setter private Date dataAbertura;
    @Getter @Setter private Date dataEncerramento;
    
    @Getter @Setter
    @OneToMany
    @JoinColumn(name = "turma_id")
    private List<Aluno> alunos;
    
    @OneToOne
    @JoinColumn(name = "professor")
    @Getter @Setter private Professor professor;
    
    Turma(String codigo, String sala, Date dataAbertura, Date dataEncerramento) {
    	this.codigo = codigo;
    	this.sala = sala;
    	this.dataAbertura = dataAbertura;
    	this.dataEncerramento = dataEncerramento;
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
