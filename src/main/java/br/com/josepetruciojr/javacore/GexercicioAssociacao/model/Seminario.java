package br.com.josepetruciojr.javacore.GexercicioAssociacao.model;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(){};

    public Seminario(String titulo, Local local){
        this.titulo = titulo;
        this.local = local;
    }

    public void imprime(){
        System.out.println("Nome do evento: " + this.titulo);
        if(local != null){
            System.out.println("Endereço: " + local.getEndereco());
        }
        else {
            System.out.println("Evento " + this.titulo + " não pode acontecer sem um endereço");
        }
    }

    public void imprimeParticipantes(){
        System.out.println("Imprimindo a lista de participantes no seminario:  " + titulo);
        if (alunos == null) return;
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

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
