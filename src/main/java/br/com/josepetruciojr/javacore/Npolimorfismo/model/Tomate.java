package br.com.josepetruciojr.javacore.Npolimorfismo.model;

public class Tomate extends Produto {
    public static final double IMPOSTO_PORCENTO = 0.06;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        return valor * IMPOSTO_PORCENTO;
    }
}
