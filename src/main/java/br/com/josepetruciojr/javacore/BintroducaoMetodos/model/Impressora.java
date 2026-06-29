package br.com.josepetruciojr.javacore.BintroducaoMetodos.model;

public class Impressora {
    public void imprime(Estudante estudante){
        //se eu durante este metodo altera o valor da variavel de referencia antes do sout, todas as variaveis vao printar o mesmo valor

        System.out.println("Nome: " + estudante.name + "\nIdade: " + estudante.age + "\nSexo: " + estudante.gender);

        //caso eu altere a variavel depois de printar eu altero o valor da variavel que chama o metodo também
        //boas práticas n]ao alterar no metodo

        estudante.name = "Gohan";
    }
}
