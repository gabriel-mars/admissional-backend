package com.gabriel.admissional.controller;

import com.gabriel.admissional.model.entity.Aluno;
import com.gabriel.admissional.model.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    private AlunoService service;

    @PostMapping("/aluno")
    public void cadastrarAluno(@RequestBody Aluno aluno){
    	service.criarAluno(aluno);
    }

    @GetMapping("/aluno")
    public List<Aluno> listarAlunos() {
        return (List<Aluno>) service.buscarTodos();
    }
}
