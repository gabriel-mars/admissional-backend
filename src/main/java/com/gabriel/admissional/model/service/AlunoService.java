package com.gabriel.admissional.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabriel.admissional.model.dao.AlunoDAO;
import com.gabriel.admissional.model.entity.Aluno;

@Service
@Transactional(readOnly = true)
public class AlunoService {
	
	@Autowired
	private AlunoDAO dao;
	
	@Transactional(readOnly = false)
	public void criarAluno(Aluno aluno) {
		try {
			dao.save(aluno);
			System.out.println("Aluno criado!");
		} catch (Exception e) {
			System.out.println("Ocorreu um erro ao criar o aluno." + e.toString());
		}
	}
	
	public List<Aluno> buscarTodos() {
		return dao.findAll();
	}
}
