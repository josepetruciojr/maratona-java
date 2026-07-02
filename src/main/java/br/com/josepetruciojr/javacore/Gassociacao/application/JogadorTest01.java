package br.com.josepetruciojr.javacore.Gassociacao.application;

import br.com.josepetruciojr.javacore.Gassociacao.model.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("José");
        Jogador jogador2 = new Jogador("José Petrucio");
        Jogador jogador3 = new Jogador("José Jr");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador: jogadores){
            System.out.println(jogador);
        }
    }
}
