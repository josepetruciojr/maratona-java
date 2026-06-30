package br.com.josepetruciojr.javacore.BintroducaoMetodos.application;

import br.com.josepetruciojr.javacore.BintroducaoMetodos.model.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Ana";
        funcionario.idade = 25;
        funcionario.salarios = new double[]{2000.0, 2000.0, 2000.0, 2000.0};
        funcionario.imprime();
        funcionario.mediaSalario();

    }
}
