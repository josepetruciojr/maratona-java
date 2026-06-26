package br.com.josepetruciojr.javacore.AintroducaoClasses.application;

import br.com.josepetruciojr.javacore.AintroducaoClasses.model.Estudante;

public class Estudante02 {
    public static void main(String[] args) {
        //da para criar um new sem referencia, mas ele fica vazio sem link com o objeto
        new Estudante();

        Estudante estudante =  new Estudante();
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
    }
}
