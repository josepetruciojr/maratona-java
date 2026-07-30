package br.com.josepetruciojr.javacore.Rdatas.application;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTeste01 {
    public static void main(String[] args) {
        //classe baseada em datas
        //retonar os valores em dias
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);
        //caso eu tente pegar um periodo de meses ex. retornara um valor direto se eu nao utilizar a chronounits
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays((p3.getDays()))).getMonths());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}
