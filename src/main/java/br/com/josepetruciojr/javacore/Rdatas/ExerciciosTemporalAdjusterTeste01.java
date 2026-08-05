package br.com.josepetruciojr.javacore.Rdatas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch(dayOfWeek){
            case THURSDAY -> addDays = 4;
            case FRIDAY -> addDays = 3;
            case SATURDAY -> addDays = 2;
            default -> addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}
public class ExerciciosTemporalAdjusterTeste01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        localDate = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        localDate = LocalDate.now().withDayOfMonth(30).with(new ObterProximoDiaUtil());
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        localDate = LocalDate.now().withDayOfMonth(29).with(new ObterProximoDiaUtil());
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());

        localDate = LocalDate.now().withDayOfMonth(25).with(new ObterProximoDiaUtil());
        System.out.println(localDate);
        System.out.println(localDate.getDayOfWeek());
    }
}
