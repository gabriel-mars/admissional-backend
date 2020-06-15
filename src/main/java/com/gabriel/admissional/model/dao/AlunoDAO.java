package com.gabriel.admissional.model.dao;

import com.gabriel.admissional.model.base.BaseDAO;
import com.gabriel.admissional.model.entity.Aluno;

import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class AlunoDAO extends BaseDAO<Aluno, Long> {

    @PersistenceContext
    private EntityManager manager;
    
    @SuppressWarnings("unchecked")
	public List<Object[]> findByTurma(Long id){
    	Query query = manager.createNativeQuery("SELECT * FROM aluno A WHERE A.turma_id = ?").setParameter(1, id);
    	return query.getResultList();
    }
}
