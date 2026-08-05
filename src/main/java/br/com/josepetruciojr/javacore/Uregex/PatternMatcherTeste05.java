package br.com.josepetruciojr.javacore.Uregex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste05 {


    public static void main(String[] args) {
        //principais metacaracteres
        // \d = todos os digitos
        // \D = tudo o que nao for digito (ex: caracteres e digitos especiais)
        // \s = espaços em branco \t \n \f \r
        // \S = todos os caracter excluindo o espaço em branco
        // \w = tudo o que for de a-z ou A-Z, digitos e _. ( nao traz espaço em brancoe e caracteres especiais)
        // \W = tudo o que nao for incluso no \w. (espaços em branco e caracters especiais)
        // [] = range de caracter.. ex:[abc],[a-zA-C], [0-9A-Za-z]
        // ? Zero ou uma OCORRENCIA
        // * Zero ou muitas ocorrencias
        // + Uma ou muitas ocorrencias
        // {n,m} de n até m
        // () - agrupamento
        // | (ex: o(v|c)o - ovo ou oco) - pipe é ou
        // $ - representa o fim da linha
        // . - caracter curinga (ex: 1.3 = 123, 133, 1@3, 1A3)
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "junior@hotmail.com, 123pedraodaconstrucao@mail.com, @#!sakura@gmail.br, teste@gmail.com.br, neji@mail";
        System.out.println("Email valido: ");
        System.out.println("@#!sakura@gmail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));//pego todas as strings separadas por virgula
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
