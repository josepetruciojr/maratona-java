package br.com.josepetruciojr.javacore.Gassociacao.application;

import br.com.josepetruciojr.javacore.Gassociacao.model.Jogador;
import br.com.josepetruciojr.javacore.Gassociacao.model.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("José");
        Time time = new Time("Seleção Uruguaia");

        /*relação de asssociação uma variavel de referencia Time foi declarada na classe Jogador
        foi criado entao uma relação unidirecional.
         */
        jogador.setTime(time);

        jogador.imprime();

    }
}
