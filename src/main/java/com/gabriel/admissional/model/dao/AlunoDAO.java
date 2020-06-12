package com.gabriel.admissional.model.dao;

import com.gabriel.admissional.model.base.BaseDAO;
import com.gabriel.admissional.model.entity.Aluno;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AlunoDAO extends BaseDAO<Aluno, Long> {

    @PersistenceContext
    private EntityManager manager;
}
