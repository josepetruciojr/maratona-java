package br.com.josepetruciojr.javacore.Hheranca.model;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, String cpf, double salario){
        super(nome, cpf); //aqui o super trás os argumentos do construtor da super classe -- o super e o this não podem ser chamados juntos
        this.salario = salario;
    }

    //utlizar o ctrl + o da a opções de sobrescrever varios metodos
    //todas as classes implicitamente herdam da classe object

    @Override
    public void imprime(){
        super.imprime(); //o super executa o metodo imprime() da super classe utilizando a herança
        System.out.println(this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
