package br.com.josepetruciojr.javacore.Npolimorfismo.model;

public class Televisao extends Produto{
    public static final double IMPOSTO_PORCENTO = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Calculando o imposto da televisao");
        return valor * IMPOSTO_PORCENTO;
    }
}
