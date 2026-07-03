package br.com.josepetruciojr.javacore.Gassociacao.model;

public class Sacolao {
    private String nome;
    private Produto[] produtos;

    public Sacolao(String nome) {
        this.nome = nome;
    }

    public Sacolao(String nome, Produto[] produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(produtos == null) return;
        for(Produto produto: produtos){
            System.out.printf("Produtos: %s - Quantidade: %d%n", produto.getNome(), produto.getQuantidade());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto[] getProduto() {
        return produtos;
    }

    public void setProduto(Produto[] produtos) {
        this.produtos = produtos;
    }
}
