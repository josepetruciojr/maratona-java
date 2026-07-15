package br.com.josepetruciojr.javacore.Npolimorfismo.service;

import br.com.josepetruciojr.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
