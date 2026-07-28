package br.com.josepetruciojr.javacore.Qstring.exercicio.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static br.com.josepetruciojr.javacore.Qstring.exercicio.model.Cliente.SIMPLE_DATE_FORMAT;

public class Pedido {
    private Date dataPedido;
    private final OrderStatus status;
    private List<ItemPedido> itemPedidos = new ArrayList<>();
    private Cliente cliente;

    public Pedido(Cliente cliente, Date dataPedido, OrderStatus status) {
        this.dataPedido = dataPedido;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void addItem(ItemPedido item){
        itemPedidos.add(item);
    }

    public void removeItem(ItemPedido item){
        itemPedidos.remove(item);
    }

    public Double total(){
        double total = 0.0;
        for(ItemPedido ip: itemPedidos){
            total += ip.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente= " + cliente.getNome() +
                ", dataPedido= " + SIMPLE_DATE_FORMAT.format(dataPedido) +
                ", status= " + status +
                ", itemPedidos= " + itemPedidos +
                "\ntotal= " + total() +
                '}';
    }
}
