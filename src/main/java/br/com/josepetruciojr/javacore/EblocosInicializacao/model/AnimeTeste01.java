package br.com.josepetruciojr.javacore.EblocosInicializacao.model;

import br.com.josepetruciojr.javacore.EblocosInicializacao.application.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
