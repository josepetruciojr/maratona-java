package br.com.josepetruciojr.javacore.Npolimorfismo.controller;

import br.com.josepetruciojr.javacore.Npolimorfismo.model.Computador;
import br.com.josepetruciojr.javacore.Npolimorfismo.model.Televisao;
import br.com.josepetruciojr.javacore.Npolimorfismo.model.Tomate;
import br.com.josepetruciojr.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MAC", 12000);
        Tomate tomate = new Tomate("Cereja", 7.00);
        Televisao televisao = new Televisao("Samsung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
