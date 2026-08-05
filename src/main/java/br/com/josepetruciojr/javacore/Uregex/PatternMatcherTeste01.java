package br.com.josepetruciojr.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {
    //expressões regulares, linguagem criada por meta-caracteres que encontram padroes em textos.
    //tambem utilizado para validações, como saber se a sintaxe do email foi digitada corretamente
    //ex:encontrar todos os links http, todas as frases que começam com numero, arquivos com varios nomes de funcionario, todos os emails

    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abaaba";
        String texto2 = "abababa";

        //duas classes para trabalhar a Pattern e a Matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");
        //retorna onde ele encontra a expressão que da um match no que o regex esta passando
        //no ex: aba ele compila 0 4 ele nao repetira os indices que ja passaram. 012 (3) 456 desta forma
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+" ");//assim ela acha o indice e o que ela encontrou
        }
    }
}
