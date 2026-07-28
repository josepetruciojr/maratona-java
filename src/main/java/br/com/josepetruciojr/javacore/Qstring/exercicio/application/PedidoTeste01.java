package br.com.josepetruciojr.javacore.Qstring.exercicio.application;

import br.com.josepetruciojr.javacore.Qstring.exercicio.model.*;

import java.text.ParseException;

import static br.com.josepetruciojr.javacore.Qstring.exercicio.model.Cliente.SIMPLE_DATE_FORMAT;

public class PedidoTeste01 {
    public static void main(String[] args) throws ParseException {
        Cliente cliente = new Cliente("Jamelão","jamelao@email.com",
                SIMPLE_DATE_FORMAT.parse("12/02/1993"));
        Produto produto = new Produto("mouse", 20.0);
        Produto produto1 = new Produto("teclado", 100.0);
        Produto produto2 = new Produto("mousepad", 30.0);

        ItemPedido itemPedido = new ItemPedido(produto,2, produto.getPrecoProduto());
        ItemPedido itemPedido1 = new ItemPedido(produto1,1, produto1.getPrecoProduto());
        ItemPedido itemPedido2 = new ItemPedido(produto2,7, produto2.getPrecoProduto());

        Pedido pedido = new Pedido(cliente, SIMPLE_DATE_FORMAT.parse("28/07/2026"), OrderStatus.PAGAMENTO_PENDENTE);
        pedido.addItem(itemPedido);
        pedido.addItem(itemPedido1);
        pedido.addItem(itemPedido2);
        pedido.total();
        System.out.println(pedido);

    }
}
