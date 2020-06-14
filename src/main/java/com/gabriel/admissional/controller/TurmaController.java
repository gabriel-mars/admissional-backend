package com.gabriel.admissional.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
