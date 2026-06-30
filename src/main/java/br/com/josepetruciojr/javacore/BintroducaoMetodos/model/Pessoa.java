package br.com.josepetruciojr.javacore.BintroducaoMetodos.model;

/**
 * Coesão é o quanto a classe faz, ex: quando uma classe resolve muito problemas ela tem baixa coesão, pois além de repre-
 * sentar uma entidade do mundo real, ela também possui muito métodos. Por boas prática cada classe deve resolver apenas-
 * assuntos relacionados a ela mesmo.
 * Acoplamento é quanto uma classe conhece da outra e o quanto ela depende da outra classe.
 * Uma das forma de manter o baixo acoplamento é manter os atributos privados.
 */
public class Pessoa {
    private String nome;
    private int idade;

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

    public void imprime() {
        if (this.idade < 0) {
            System.out.println("Idade inválida.");
            return;
        }
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
