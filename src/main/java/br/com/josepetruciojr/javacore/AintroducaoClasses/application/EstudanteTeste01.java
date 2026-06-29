package br.com.josepetruciojr.javacore.AintroducaoClasses.application;

import br.com.josepetruciojr.javacore.AintroducaoClasses.model.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.age = 20;
        estudante.gender ='F';
        estudante.name = "Ana";

        System.out.println("Nome: " + estudante.name + "\nIdade: " + estudante.age + "\nSexo: " + estudante.gender);
    }
}
