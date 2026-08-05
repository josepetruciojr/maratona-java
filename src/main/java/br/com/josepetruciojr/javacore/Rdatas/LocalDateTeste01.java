package br.com.josepetruciojr.javacore.Rdatas;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        //classe java time
        System.out.println(Month.JANUARY.getValue());
        LocalDate localDate = LocalDate.of(2026,12,1);

        //metodos utilitarios
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getEra());
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.get(ChronoField.YEAR));//posso utilizar diretamente o getYear()
        System.out.println(localDate);
        LocalDate agora = LocalDate.now();
        agora = agora.plusDays(1);//por ser imutavel a variavel precisa ser reIniciada pois se tentar mudar ela cria uma copia do objeto e ignora o resultado
        System.out.println(agora);

        //diferente da calendar e da date que vc so podia pegar até o ano de 1970 como minima no localDate muda
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
