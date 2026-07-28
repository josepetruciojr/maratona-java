package br.com.josepetruciojr.javacore.Qstring.application;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "José Araucara";
        nome.concat(" Alalao");
        nome = nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("José Araucara");//caso vc nao declare um valor o tamanho é 16
        sb.append(" Alalao").append(" WOW");//uma stringbuilder nao pode receber diretamente uma string sb = nome; o append funciona como um concat
        //tomar cuidado com o tipo de retorno o substring por exemplo retorna uma string entao nao altera a string dentro do stringbuilder
        sb.reverse();
        sb.delete(0,2);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        //tudo isso tambem funciona para o String Buffer
    }
}
