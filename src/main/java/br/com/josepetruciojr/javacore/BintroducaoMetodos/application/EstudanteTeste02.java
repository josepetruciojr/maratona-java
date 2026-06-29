package br.com.josepetruciojr.javacore.BintroducaoMetodos.application;

import br.com.josepetruciojr.javacore.BintroducaoMetodos.model.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.age = 20;
        estudante.gender ='F';
        estudante.name = "Ana";
        estudante.imprime();

        estudante2.age = 30;
        estudante2.gender ='F';
        estudante2.name = "Maria";
        estudante2.imprime();
    }
}
