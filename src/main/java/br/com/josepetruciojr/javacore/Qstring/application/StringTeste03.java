package br.com.josepetruciojr.javacore.Qstring.application;

public class StringTeste03 {

    public static void main(String[] args) {
        String original = "abcde ABCDE abc ABC   ";

        String lowerCase = original.toLowerCase();
        String trim = original.trim();
        String subString = original.substring(2);
        String subString2 = original.substring(2, 8);
        String replace = original.replace("abc", "xy");
        int indexOf = original.indexOf("bc");
        int LastIndexOf = original.lastIndexOf("bc");

        //para a função split divide uma string que esta separada, por virgulas ou espaços segue o exemplo abaixo
        String arrayString = "Batata,Alho,Cebola";

        String[] array = arrayString.split(",");

        for(String strings: array){
            System.out.println(strings);
        }

    }
}
