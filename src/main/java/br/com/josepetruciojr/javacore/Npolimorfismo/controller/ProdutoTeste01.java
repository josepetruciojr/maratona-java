package br.com.josepetruciojr.javacore.Npolimorfismo.controller;

import br.com.josepetruciojr.javacore.Npolimorfismo.model.Computador;
import br.com.josepetruciojr.javacore.Npolimorfismo.model.Tomate;
import br.com.josepetruciojr.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MAC", 12000);
        Tomate tomate = new Tomate("Cereja", 7.00);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
