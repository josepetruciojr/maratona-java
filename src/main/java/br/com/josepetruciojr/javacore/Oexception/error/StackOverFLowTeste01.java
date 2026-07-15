package br.com.josepetruciojr.javacore.Oexception.error;

public class StackOverFLowTeste01 {

    /*
        Demonstração de errors em java, a JVM vai parar pois é impossivel ela se recuperar
        no caso estamos demonstrando o StackOverFlowException pois estourou a memoria da stack por conta do metodo recursivo que foi chamado
        Erro é algo que acontece na JVM e não da pra se recuperado em tempo e execução
        técnicamente Error e Exception são diferente ambas herdam da super classe Throwable
     */
    public static void main(String[] args) {
        recursividade();
    }

    private static void recursividade() {

    }
}
