package br.com.josepetruciojr.javacore.GexercicioAssociacao.model;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(){};

    public Aluno(String nome, int idade, Seminario seminario){
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println(this.nome);
    }
    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

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
}
