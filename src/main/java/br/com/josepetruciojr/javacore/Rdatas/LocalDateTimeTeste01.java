package br.com.josepetruciojr.javacore.Rdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2026, Month.JULY, 29);
        LocalTime time = LocalTime.of(19,52,23);

        //posso fazer o parse
        LocalDate date1 = LocalDate.parse("2026-07-29");
        LocalTime time1 = LocalTime.parse("19:54:00");

        //posso trabalhar com esses metodos combinados entre si
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        System.out.println(date1);
        System.out.println(time1);
        System.out.println("-------------");
        LocalDateTime ldt1 = date.atTime(time);
        System.out.println(ldt1);
        System.out.println("-------------");
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt2);
    }
}
