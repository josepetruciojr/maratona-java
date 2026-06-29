package br.com.josepetruciojr.javacore.BintroducaoMetodos.application;

import br.com.josepetruciojr.javacore.BintroducaoMetodos.model.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10,10);

        double result = calculadora.divideUmNumeros(20,0);
        System.out.println(result);
        System.out.println("---------------------");
        calculadora.imprimeDoisNumeros(86,0);
    }
}
