package br.com.josepetruciojr.javacore.Kenums.application;

import br.com.josepetruciojr.javacore.Kenums.model.Cliente;
import br.com.josepetruciojr.javacore.Kenums.model.TipoCliente;
import br.com.josepetruciojr.javacore.Kenums.model.TipoPagamento;

public class ClienteTeste02 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Akira", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println();
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        TipoCliente tipoCliente2 = TipoCliente.findByNomeRelatorio("Pessoa Fisica"); //metodos static criado para retornar um enum pelo atributo recebendo uma STRING
        int tipoEnum = 1;
        TipoCliente tipoCliente3 = TipoCliente.findbyIdEnum(tipoEnum); //metodos static criado para retornar um enum pelo atributo recebendo um int

        System.out.println(tipoCliente.getNomeRelatorio());
        System.out.println(tipoCliente2);
        System.out.println(tipoCliente3);
    }
}
