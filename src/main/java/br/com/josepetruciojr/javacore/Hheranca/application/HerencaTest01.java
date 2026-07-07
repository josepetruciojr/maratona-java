package br.com.josepetruciojr.javacore.Hheranca.application;

import br.com.josepetruciojr.javacore.Hheranca.model.Endereco;
import br.com.josepetruciojr.javacore.Hheranca.model.Funcionario;
import br.com.josepetruciojr.javacore.Hheranca.model.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Nathalia", "111444555-96");
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua 7, 789.");
        endereco.setCep("12345-789");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-----------------");

        Funcionario funcionario = new Funcionario("Josefa", "222444555-96" ,3600.0 );
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3600.0);

        funcionario.imprime();
    }
}
