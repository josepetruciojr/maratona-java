package br.com.josepetruciojr.javacore.BintroducaoMetodos.application;

import br.com.josepetruciojr.javacore.BintroducaoMetodos.model.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 2;
        int b = 4;

        /*tipos primitivos é enviada uma cópia do valor da váriavel para o metodo e não uma referencia.
         */

        calculadora.alteraDoidNumeros(a, b);
        System.out.println("---------------");
        System.out.println("Dentro da classe CalculadoraTeste");
        System.out.println("Este valor é: " + a);
        System.out.println("Este valor é: " + b);
    }
}
