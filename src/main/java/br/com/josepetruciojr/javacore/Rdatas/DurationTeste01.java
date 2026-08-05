package br.com.josepetruciojr.javacore.Rdatas;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationTeste01 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours(7);

        Duration duration = Duration.between(now, nowAfterTwoYears);
        Duration duration2 = Duration.between(timeNow, timeMinusSevenHours);
        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration duration4 = Duration.of(2, ChronoUnit.DAYS);
        System.out.println(duration);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
    }
}
