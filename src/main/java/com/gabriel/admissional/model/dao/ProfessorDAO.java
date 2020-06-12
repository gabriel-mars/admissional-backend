package com.gabriel.admissional.model.dao;

import com.gabriel.admissional.model.base.BaseDAO;
import com.gabriel.admissional.model.entity.Professor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ProfessorDAO extends BaseDAO<Professor, Long> {

    @PersistenceContext
    private EntityManager manager;
}
