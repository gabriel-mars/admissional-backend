package com.gabriel.admissional.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabriel.admissional.model.base.ProfessorRepository;
import com.gabriel.admissional.model.dao.ProfessorDAO;
import com.gabriel.admissional.model.entity.Professor;

@Service
@Transactional(readOnly = true)
public class ProfessorService {
	
	@Autowired
	private ProfessorDAO dao;
	
	@Autowired
	private ProfessorRepository _repository;
	
	@Transactional(readOnly = false)
	public void criarProfessor(Professor professor) {
		try {
			dao.save(professor);
			System.out.println("Professor criado!");
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao criar o professor." + e.toString());
		}
	}
	
	public List<Professor> buscarTodos() {
		return _repository.findAll();
	}
}
