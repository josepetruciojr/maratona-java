package br.com.josepetruciojr.javacore.BintroducaoMetodos.application;

import br.com.josepetruciojr.javacore.BintroducaoMetodos.model.Calculadora;

public class CalculadoraTeste03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);

        //o varargs diminui codigo, na pratica ele transforma os parametros passados em um array
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9);
    }
}
