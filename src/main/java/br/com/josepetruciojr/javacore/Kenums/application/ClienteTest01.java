package br.com.josepetruciojr.javacore.Kenums.application;

import br.com.josepetruciojr.javacore.Kenums.model.Cliente;
import br.com.josepetruciojr.javacore.Kenums.model.TipoPagamento;
import br.com.josepetruciojr.javacore.Kenums.model.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("José", TipoCliente.valueOf("PESSOA_FISICA"));
        Cliente cliente1 = new Cliente("Joselino", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Joselino", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Joselino", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente4 = new Cliente("Josefao", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
