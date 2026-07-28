package br.com.josepetruciojr.javacore.Qstring.model;

public class StringTeste01 {
    public static void main(String[] args) {

        //O java cria um pool de strings - são imutáveis - String constant pool
        String nome = "José";
        String nome2 = "José";
        nome.concat(nome2);//por causa da imutabilidade da string o valor nao pode ser alterado sem ser criado um novo é criada um nova string no pool
        nome = nome.concat(" Petrucio"); // nome += " Petrucio"
        System.out.println(nome);
        System.out.println(nome == nome2);//usando o concat agora sim da false
        String nome3 = new String("José");//cria 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de strings
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());//nome agora esta sendo comparado com o valor dentro do pool de strings, o metodo pega a referencia dentro
    }
}
