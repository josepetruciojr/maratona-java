package br.com.josepetruciojr.javacore.Sformatacao;

import br.com.josepetruciojr.javacore.GexercicioAssociacao.model.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class DateTimeFormatterTeste01 {
    public static void main(String[] args) {
        //format obj para str e parse de str para obj
        LocalDate date = LocalDate.now();

        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("---------Parse--------");
        LocalDate parse1 = LocalDate.parse("20260802", DateTimeFormatter.BASIC_ISO_DATE);//neste parse eu mandei a str e o dataformatter que são NotNull
        LocalDate parse2 = LocalDate.parse("2026-08-02+04:00", DateTimeFormatter.ISO_DATE);//aceita offset
        LocalDate parse3 = LocalDate.parse("2026-08-02", DateTimeFormatter.ISO_LOCAL_DATE);//nao aceita o offsetzoned - DateTimeParseException
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        System.out.println("--------format-------");
        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2026-08-02T04:35:49.9997649", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        System.out.println("--------formatando customizado---------");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.getDefault());
        String dtfPattern = LocalDate.now().format(dtf);
        System.out.println(dtfPattern);
        LocalDate parseDtf = LocalDate.parse("02.agosto.2026", dtf);//fiz o parse passando o pattern de formatação
        System.out.println(parseDtf);
    }
}
