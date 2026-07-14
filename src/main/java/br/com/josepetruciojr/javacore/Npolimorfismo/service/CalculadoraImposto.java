package br.com.josepetruciojr.javacore.Npolimorfismo.service;

import br.com.josepetruciojr.javacore.Npolimorfismo.model.Computador;
import br.com.josepetruciojr.javacore.Npolimorfismo.model.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio do Imposto do Computador");
        double imposto = computador.calculaImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio do Imposto do Computador");
        double imposto = tomate.calculaImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
