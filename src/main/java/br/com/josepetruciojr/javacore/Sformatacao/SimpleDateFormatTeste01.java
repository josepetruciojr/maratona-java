package br.com.josepetruciojr.javacore.Sformatacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) throws ParseException {
        //seguindo as formatações da doc oracle java 8
        // '' aspas simples faz ignorar o que esta entre elas na string
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern2 = "'Brasil' dd 'de' LLLL 'de' yyyy 'at' HH:mm:ss z";
        SimpleDateFormat fmt = new SimpleDateFormat(pattern);
        SimpleDateFormat fmt2 = new SimpleDateFormat(pattern2);
        System.out.println(fmt.format(new Date()));
        System.out.println(fmt2.format(new Date()));

        //parse tem que passar o valor correto na string da formatação
        System.out.println("-------- Testando o parse --------");
        System.out.println(fmt2.parse("Brasil 29 de julho de 2026 at 19:27:14 BRT"));
    }
}
