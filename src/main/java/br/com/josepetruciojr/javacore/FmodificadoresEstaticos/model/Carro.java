package br.com.josepetruciojr.javacore.FmodificadoresEstaticos.model;

public class Carro {
    private String marca;
    private double velocidadeMaxima;
    /*O modificador static define que o membro pertence a classe e não há um instância e isso quer dizer que a classe
    não precisa ser instanciada para chamar o metodo.
     */
    private static double velocidadeLimite = 250;


    public Carro(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public void imprime() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);

    }
}
