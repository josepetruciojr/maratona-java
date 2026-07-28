package br.com.josepetruciojr.javacore.Qstring.exercicio.model;

public class ItemPedido {
    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public ItemPedido(){}

    public ItemPedido(Produto produto, Integer quantidade, Double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double subTotal(){
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                " Nome: " + produto.getNome() +
                " quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
