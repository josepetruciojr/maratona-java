package br.com.josepetruciojr.javacore.Npolimorfismo.service;

import br.com.josepetruciojr.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
