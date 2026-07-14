package br.com.josepetruciojr.javacore.Npolimorfismo.service;

import br.com.josepetruciojr.javacore.Npolimorfismo.model.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio do Imposto do Produto");
        double imposto = produto.calculaImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
