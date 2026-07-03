package br.com.josepetruciojr.javacore.Gassociacao.application;

import br.com.josepetruciojr.javacore.Gassociacao.model.Produto;
import br.com.josepetruciojr.javacore.Gassociacao.model.Sacolao;

public class SacolaoTeste01 {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Mamão", 2);
        Produto produto2 = new Produto("Melão", 10);
        Produto produto3 = new Produto("Melancia", 30);
        Sacolao sacolao = new Sacolao("Hortifruti do Seu Zé");

        Produto[] produtos = {produto1, produto2, produto3};

        sacolao.setProduto(produtos);

        sacolao.imprime();


    }
}
