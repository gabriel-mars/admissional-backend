package com.gabriel.admissional.model.base;

public interface iUsuarios {

    void definirNome(String nome);
    String obterNome();

    void definirMatricula(Integer numeroMatricula);
    Integer obterMatricula();
}
