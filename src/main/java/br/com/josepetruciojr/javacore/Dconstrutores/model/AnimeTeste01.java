package br.com.josepetruciojr.javacore.Dconstrutores.model;

import br.com.josepetruciojr.javacore.Dconstrutores.application.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Kimetsu no Yaiba", "Stream", 30, "Ação/Aventura", "Fox");
        anime.imprime();

    }
}
