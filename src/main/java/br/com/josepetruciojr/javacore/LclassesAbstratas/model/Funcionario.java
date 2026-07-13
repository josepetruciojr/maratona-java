package br.com.josepetruciojr.javacore.LclassesAbstratas.model;

/**
 * final e abstract são opostos
 * classe abstrata não pode ser instanciada, mas pode ser herdada.
 * no metodo ele nao pode ter corpo precisa ser necessariamente sobrescrito.
 * consigo utilizar polimorfismo para instanciar uma subclasse.
 * numa classe abstrata posso ter metodos abstratos e nao abstratos, porem metodos abstratos so podem existir em classes abstratas
 * java nao permite multipla herança
 * se a classe abstrata que extend outra classe abstrata tiver metodos abstratos so precisa sobrecrever este metodo na super classe.
 */
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }

    public abstract void calculaBonus();
}
