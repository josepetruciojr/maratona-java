package br.com.josepetruciojr.javacore.CsobrecargaMetodos.model;

import br.com.josepetruciojr.javacore.CsobrecargaMetodos.application.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Kimetsu no Yaiba", "Stream", 30, "Ação/Aventura");
        anime.imprime();

    }
}
