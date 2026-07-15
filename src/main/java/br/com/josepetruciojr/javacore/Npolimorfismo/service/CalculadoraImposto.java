package br.com.josepetruciojr.javacore.Npolimorfismo.service;

import br.com.josepetruciojr.javacore.Npolimorfismo.model.Produto;
import br.com.josepetruciojr.javacore.Npolimorfismo.model.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio do Imposto do Produto");
        double imposto = produto.calculaImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        /*Há diversas formas de declarar:
            Podemos fazer produto instanceof Tomate / Tomate tomate = (Tomate) produto / acessar e printar tomate.getDataValidade()
            Podemos usar o Pattern Tomate tomate e printa logo em seguida -> preferi usar esse.
            Podemos fazer assim Tipo variavel = ((Tomate) produto).getDataValidade() e printa a variavel
        */

        if(produto instanceof Tomate tomate) {
            System.out.println(tomate.getDataValidade());
        }
    }
}
