package br.com.josepetruciojr.javacore.BintroducaoMetodos.model;

public class Funcionario {

    /*
    Crie uma classe Funcionario com os seguintes atributos

    nome, idade e salario(3 ultimos)

    crie 02 metodos
    1-imprimir os dados.
    2-fazer a media dos salario e imprimir o resultado.
     */
    public String nome;
    public int idade;
    public double salario;

    public void imprime(){
        System.out.println("Nome: " + this.nome +
                            " Idade: " + this.idade +
                            " Salario: " + this.salario);
    }

    public void mediaSalario(double... salarios){

    }
}
