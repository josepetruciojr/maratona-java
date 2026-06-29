package br.com.josepetruciojr.javacore.BintroducaoMetodos.model;

import org.w3c.dom.ls.LSOutput;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(20 - 10);
    }

    public void multiplicaDoisNumeros(int a, int b){
        System.out.println(a * b);
    }

    public double divideUmNumeros(double a, double b){
        if(b == 0) {
            return 0;
        }
        return a/b;
    }

    public void imprimeDoisNumeros(int a, int b){
        if(b == 0) {
            System.out.println("Não existe divisão por zero.");
            return;
        }
        System.out.println(a/b);
    }

    public void alteraDoidNumeros(int a, int b){
        a = 10;
        b = 10;
        System.out.println("Dentro do método alteraDoisNumeros: ");
        System.out.println("Este valor é: " + a);
        System.out.println("Este valor é: " + b);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }
        System.out.println(soma);
    }

    //utilizando o varargs
    //caso seja passado mais de um tipo de parametro o varargs precisa vir por ultimo, se vier na frente gera um erro de compilação
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int numero : numeros){
            soma += numero;
        }
        System.out.println(soma);
    }
}
