package br.com.josepetruciojr.javacore.LclassesAbstratas.application;

import br.com.josepetruciojr.javacore.LclassesAbstratas.model.Desenvolvedor;
import br.com.josepetruciojr.javacore.LclassesAbstratas.model.Funcionario;
import br.com.josepetruciojr.javacore.LclassesAbstratas.model.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Mustafa", 20000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("José Petrucio", 12000);
        Funcionario funcionario = new Gerente("Aluna", 1000);//Polimorfismo mesmo a classe pai sendo abstract
        System.out.println("--------");
        System.out.println(gerente);
        System.out.println("--------");
        System.out.println(desenvolvedor);
        System.out.println("--------");
        System.out.println(funcionario);
        System.out.println("--------");

    }
}
