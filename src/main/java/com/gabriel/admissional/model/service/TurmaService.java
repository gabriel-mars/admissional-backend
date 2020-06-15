package com.gabriel.admissional.model.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabriel.admissional.model.dao.TurmaDAO;
import com.gabriel.admissional.model.entity.Professor;
import com.gabriel.admissional.model.entity.Turma;

@Service
@Transactional(readOnly = true)
public class TurmaService {
	
	// Service responsável por gerenciar a entidade Turma
	
	@Autowired
	private TurmaDAO dao;
	
	private static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	@Transactional(readOnly = false)
	public void cadastrarTurma(Turma turma) {
		try {
			dao.save(turma);
			System.out.println("Turma cadastrada!");
		} catch (Exception e) {
			System.out.println("Não foi possível cadastrar a turma. Erro: " + e);
		}
	}
	
	public List<Turma> buscarTodas(){
		return dao.findAll();
	}
	
	// Método para conversão do objeto recebido do front-end para a entidade Turma
	public Turma converterObject(Object obj) throws ParseException {
		Turma turma = new Turma();
		Professor professor = new Professor();
		
		String aux = obj.toString().replace("{", "");
		aux = aux.replace("}", "");
		aux = aux.replace("professor=", "");
		String[] textoSeparado = aux.split(",\\s");
		
		turma.setCodigo(textoSeparado[0].split("=")[1]);
		turma.setSala(textoSeparado[1].split("=")[1]);
		turma.setDataAbertura(format.parse(textoSeparado[2].split("=")[1]));
		turma.setDataEncerramento(format.parse(textoSeparado[3].split("=")[1]));
		
		professor.setId(Long.parseLong(textoSeparado[4].split("=")[1]));
		professor.setNome(textoSeparado[5].split("=")[1]);
		professor.setTitulacao(textoSeparado[6].split("=")[1]);
		
		turma.definirProfessor(professor);
		
		return turma;
	}
	
	public Turma buscarPorId(Long id) {
		return dao.findById(id);
	}
	
	@Transactional(readOnly = false)
	public void atualizar(Turma turma) {
		dao.update(turma);
	}
}
