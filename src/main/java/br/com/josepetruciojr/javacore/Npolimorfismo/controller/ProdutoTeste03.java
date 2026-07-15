package br.com.josepetruciojr.javacore.Npolimorfismo.controller;

import br.com.josepetruciojr.javacore.Npolimorfismo.model.Computador;
import br.com.josepetruciojr.javacore.Npolimorfismo.model.Produto;
import br.com.josepetruciojr.javacore.Npolimorfismo.model.Tomate;
import br.com.josepetruciojr.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {

        Produto produto = new Computador("NVMX1900", 3000);

        Tomate tomate = new Tomate("Italiano", 20);
        tomate.setDataValidade("12/07/2026");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
