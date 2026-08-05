package br.com.josepetruciojr.javacore.Rdatas;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23,32,12);
        LocalTime timeNow = LocalTime.now();

        System.out.println(localTime);
        System.out.println(timeNow);

        //varios metodos utilitarios
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIN);//mesma ideia do midnight
        System.out.println(LocalTime.MAX);

    }
}
