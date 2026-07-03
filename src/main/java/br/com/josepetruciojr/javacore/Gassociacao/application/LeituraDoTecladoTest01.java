package br.com.josepetruciojr.javacore.Gassociacao.application;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Eu prevejo o futuro! ---");
        System.out.println("Digite sua pergunta e eu responderei SIM ou NÂO");
        String pergunta = input.nextLine();

        //aqui eu pego o tamanho da String e testo o tamanho da string -1 e vejo se o ultimo index é um '\0000'
        //ex: "oi " -> ex.length() retorna 3 e o -1 salva o index do vazio na comparação como 2. ENtão fica charAt(2)
        //o ultimo caracter esta vazio ' ' true
        if(pergunta.charAt(pergunta.length() - 1) == ' '){
            System.out.println("SIM");
        }
        else {
            System.out.println("NÂO");
        }
        System.out.println(pergunta.length() - 1);
    }
}
