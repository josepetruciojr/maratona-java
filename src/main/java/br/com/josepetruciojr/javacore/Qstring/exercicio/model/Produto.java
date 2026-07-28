package br.com.josepetruciojr.javacore.Qstring.exercicio.model;

public class Produto {
    private String nome;
    private Double precoProduto;

    public Produto(String nome, Double precoProduto) {
        this.nome = nome;
        this.precoProduto = precoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }
}
