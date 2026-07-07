package br.com.josepetruciojr.javacore.Hheranca.model;

public class Pessoa {
    //utlizando modificadores de acesso protected eu consigo acessar os atributos diretamente em
    // subclasses e no respectivo package em todas as classes que instanciarem objetos do tipo Pessoa.
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println("Endereco" + this.endereco.getLogradouro() + " - Cep: " + this.endereco.getCep());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
