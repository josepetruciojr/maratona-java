package br.com.josepetruciojr.javacore.AintroducaoClasses.application;

import br.com.josepetruciojr.javacore.AintroducaoClasses.model.Carro;

public class CarroTeste01 {

    public static void main(String[] args) {

        Carro carroUm = new Carro();
        carroUm.name = "Fiat";
        carroUm.model = "Uno";
        carroUm.year = 1992;

        Carro carroDois = new Carro();
        carroDois.name = "Chevrolet";
        carroDois.model = "Celta";
        carroDois.year = 1996;

        /*
        variaveis de referência podem apontar para o mesmo objeto, mas depois de executar você perde o resultado anterior,
        não há como voltar, basta estar na mesma linha de herança.
        carroUm = carroDois; ou carroDois = carroUm;
         */

        System.out.println("Primeiro carro:\nNome: " + carroUm.name + "\nModelo: " + carroUm.model + "\nAno: " + carroUm.year);
        System.out.println("-----------------------------");
        System.out.println("Segundo carro:\nNome: " + carroDois.name + "\nModelo: " + carroDois.model + "\nAno: " + carroDois.year);



    }
}
