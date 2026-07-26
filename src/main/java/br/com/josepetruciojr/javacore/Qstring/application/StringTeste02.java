package br.com.josepetruciojr.javacore.Qstring.application;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "Jose";
        String numero = "012345";
        String nome2 = "   Petrucio     ";
        System.out.println(nome.charAt(0));//retorna o primeiro valor do index, se tiver fora do intervalo ele lança um StringIndexOutOfBoundsException
        System.out.println(nome.length());
        System.out.println(nome.replace("e", "J"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toUpperCase());
        System.out.println("----------");
        System.out.println(numero.length());
        System.out.println(numero.substring(3));// posso utilizar (0, 2) o valor final é sempre o passado -1
        System.out.println(nome2);
        System.out.println(nome2.trim());
    }
}
