package br.com.josepetruciojr.javacore.Gassociacao.application;

import br.com.josepetruciojr.javacore.Gassociacao.model.Jogador;
import br.com.josepetruciojr.javacore.Gassociacao.model.Time;

public class JogadorTeste03 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Bebeto");
        Jogador jogador2 = new Jogador("Beletti");
        Jogador jogador3 = new Jogador("Bosco");
        Time time = new Time("Flamengo"); //posso passar o array de jogadores direto no construtor

        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for(Jogador jogador: jogadores){
            jogador.setTime(time);
        }

        time.setJogador(jogadores); //ou setar diretamente o array de jogadores na associação de time com os jogadores
        System.out.println("------------------------");
        time.imprime();

        System.out.println("------------------------");
        jogador1.imprime();
    }
}
