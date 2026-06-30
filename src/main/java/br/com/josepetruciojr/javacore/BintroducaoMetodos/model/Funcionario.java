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
    public String nome;
    public int idade;
    public double[] salarios;

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
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media dos salários: " + media);
    }
}
