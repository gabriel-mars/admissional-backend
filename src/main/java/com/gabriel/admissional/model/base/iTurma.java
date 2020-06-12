package com.gabriel.admissional.model.base;

import com.gabriel.admissional.model.entity.Aluno;
import com.gabriel.admissional.model.entity.Professor;

public interface iTurma {

    Boolean estaAberta();
    void definirProfessor(Professor professor);
    void incluirAluno(Aluno aluno);
}
