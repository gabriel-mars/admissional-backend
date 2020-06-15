package com.gabriel.admissional.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.admissional.model.entity.Aluno;
import com.gabriel.admissional.model.entity.Turma;
import com.gabriel.admissional.model.service.TurmaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TurmaController {
	
	@Autowired
	private TurmaService service;

	@PostMapping("/turma")
	public void cadastrarTurma(@RequestBody Object data) throws ParseException {
		Turma turma = service.converterObject(data);
		
		service.cadastrarTurma(turma);
	}
	
	@GetMapping("/turma")
	public List<Turma> listarTurmas(){
		return service.buscarTodas();
	}
	
	@GetMapping("/turma/{id}")
	public Turma buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	
	@GetMapping("/turma/status/{id}")
	public Boolean checkStatus(@PathVariable Long id) {
		Turma turma = service.buscarPorId(id);
		
		System.out.println(turma.estaAberta());
		
		return turma.estaAberta();
	}
	
	@PutMapping("/turma/alunos/{id}")
	public void adicionarAlunos(@PathVariable Long id, @RequestBody Turma obj) {
		Turma turma = service.buscarPorId(id);
		List<Aluno> alunos = obj.getAlunos();
		
		for(Aluno aluno : alunos) {
			turma.incluirAluno(aluno);
		}
		
		service.atualizar(turma);
	}
}
