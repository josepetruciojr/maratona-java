package br.com.josepetruciojr.javacore.JmodificadorFinal.application;

import br.com.josepetruciojr.javacore.JmodificadorFinal.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Amasteraso");
        System.out.println(carro.COMPRADOR);
    }
}
