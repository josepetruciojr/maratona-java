package br.com.josepetruciojr.javacore.Npolimorfismo.controller;

import br.com.josepetruciojr.javacore.Npolimorfismo.model.Computador;
import br.com.josepetruciojr.javacore.Npolimorfismo.model.Produto;
import br.com.josepetruciojr.javacore.Npolimorfismo.model.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {

        //utilizando polimorfismo aqui eu so consigo ter acesso a metodos e atributos herdados.
        Produto produto = new Computador("NVMX1900", 12000);
        Produto produto1 = new Tomate("Italiano", 15);

        System.out.println("Produto: " + produto.getNome() + " - valor: " + produto.getValor());
        System.out.println("Produto: " + produto1.getNome() + " - valor: " + produto1.getValor());
        System.out.println("-----------------------------");
        System.out.println("Imposto primeiro produto: " + produto.calculaImposto());
        System.out.println("Imposto segundo produto: " + produto1.calculaImposto());
        System.out.println("-----------------------------");
    }
}
