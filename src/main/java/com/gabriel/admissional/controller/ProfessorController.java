package com.gabriel.admissional.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.admissional.model.entity.Professor;
import com.gabriel.admissional.model.service.ProfessorService;

@RestController
public class ProfessorController {
	
	@Autowired
	private ProfessorService service;
	
	@PostMapping("/professor")
	public void criarProfessor(@RequestBody Professor professor) {
		service.criarProfessor(professor);
	}
	
	@GetMapping("/aluno")
    public List<Professor> listarProfessores() {
        return (List<Professor>) service.buscarTodos();
    }
}
