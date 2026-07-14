package br.com.josepetruciojr.javacore.Npolimorfismo.model;

public class Computador extends Produto{
    public static final double IMPOSTO_PORCENTO = 21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Calculando o imposto do computador");
        return valor * IMPOSTO_PORCENTO;
    }
}
