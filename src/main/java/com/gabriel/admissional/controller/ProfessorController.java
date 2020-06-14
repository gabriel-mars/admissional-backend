package com.gabriel.admissional.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.admissional.model.entity.Professor;
import com.gabriel.admissional.model.service.ProfessorService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProfessorController {
	
	@Autowired
	private ProfessorService service;
	
	@PostMapping("/professor")
	public void criarProfessor(@RequestBody Professor professor) {
		service.criarProfessor(professor);
	}
	
	@GetMapping("/professor")
	public List<Professor> listarProfessores() {
        return service.buscarTodos();
    }
	
	@GetMapping("/professor/{id}")
	public Professor buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
}
