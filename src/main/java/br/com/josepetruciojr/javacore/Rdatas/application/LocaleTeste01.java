package br.com.josepetruciojr.javacore.Rdatas.application;

import br.com.josepetruciojr.javacore.GexercicioAssociacao.model.Local;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);//passando diretamente por ser uma classe final
        //segue o padrão da ISO 639 alpha 2 e 3166 alpha 2 (ex.: pt-BR)
        //é possivel setar locais e preferencia para tradução, formatação de moedas , preços e por ai vai.
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSuica = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        //posso atribuir a diversas classes
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia: " + df1.format(calendar.getTime()));
        System.out.println("Suica: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df3.format(calendar.getTime()));
        System.out.println("Japao: " + df4.format(calendar.getTime()));
        System.out.println("Holanda: " + df5.format(calendar.getTime()));

        System.out.println(localeHolanda.getDisplayCountry());//nome do local
        System.out.println(localeItaly.getDisplayLanguage(localeHolanda));//nome do local passando a linguagem de retorno

    }
}
