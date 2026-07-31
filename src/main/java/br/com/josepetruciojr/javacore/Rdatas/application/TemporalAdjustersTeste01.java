package br.com.josepetruciojr.javacore.Rdatas.application;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTeste01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH,18);//aqui eu busco um valor especifico do mes atual

        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-------------------------");
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));//aqui eu retorno o dia proximo ou ele mesmo se for o mesmo dia
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-------------------------");
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-------------------------");
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-------------------------");
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-------------------------");
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("-------------------------");
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());



    }
}
