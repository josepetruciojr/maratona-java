package br.com.josepetruciojr.javacore.BintroducaoMetodos.model;

import com.sun.security.jgss.GSSUtil;

public class Funcionario {

    /*
    Crie uma classe Funcionario com os seguintes atributos

    nome, idade e salario(3 ultimos)

    crie 02 metodos
    1-imprimir os dados.
    2-fazer a média dos salário e imprimir o resultado.

        Aprendi que para chamar o metodo length e calcular ele diretamente sem criar uma variavel acontece assim.
        media / salarios.length funcionou dentro do metodo println, mas não fora dele, foi preciso colocar o /= para chamar a divisão.

     */
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void imprime() {
        if (salarios == null) {
            System.out.println("Nome: " + this.nome +
                    "\nIdade: " + this.idade);
            return;
        }
        System.out.println("Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nSalario: ");

        for (double salario: salarios){
            System.out.println("Salario: " + salario);
        }
    }

    public void mediaSalario() {
        if (salarios == null) {
            System.out.println("Não é possível calcular a média sem valores.");
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media dos salários: " + media);
    }
}
