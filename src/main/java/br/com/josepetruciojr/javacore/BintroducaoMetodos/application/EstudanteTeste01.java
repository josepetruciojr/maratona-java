package br.com.josepetruciojr.javacore.BintroducaoMetodos.application;

import br.com.josepetruciojr.javacore.BintroducaoMetodos.model.Estudante;
import br.com.josepetruciojr.javacore.BintroducaoMetodos.model.Impressora;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        Impressora impressora = new Impressora();

        //neste caso esses objetos apontam para o mesmo objeto que a variavel de referencia passada no metodo.
        estudante.age = 20;
        estudante.gender ='F';
        estudante.name = "Ana";
        impressora.imprime(estudante);

        estudante2.age = 30;
        estudante2.gender ='F';
        estudante2.name = "Maria";
        impressora.imprime(estudante2);

        //aqui eu printo o valor da variavel que mudou no metodo, por boas praticas se precisar alterar algo no metodo, de um new objeto e faz a alteração
        impressora.imprime(estudante);
    }
}
