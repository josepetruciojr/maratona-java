package br.com.josepetruciojr.javacore.GexercicioAssociacao.model;

public class Seminario {
    private String titulo;
    private Endereco endereco;
    private Aluno[] alunos;

    public Seminario(){};

    public Seminario(String titulo, Endereco endereco){
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("Nome do evento: " + this.titulo);
        if(endereco != null){
            System.out.println("Endereço: " + endereco.getEndereco());
        }
        else {
            System.out.println("Evento " + this.titulo + " não pode acontecer sem um endereço");
        }
    }

    public void imprimeParticipantes(){
        System.out.println("Imprimindo a lista de participantes no seminario:  " + titulo);
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
