package br.com.josepetruciojr.javacore.FmodificadoresEstaticos.application;

import br.com.josepetruciojr.javacore.FmodificadoresEstaticos.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Celta", 290);
        Carro carro2 = new Carro("Ferrari", 300);
        Carro carro3 = new Carro("Mustang", 380);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
        System.out.println("-----------");
        Carro.setVelocidadeLimite(200);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();


    }

}
