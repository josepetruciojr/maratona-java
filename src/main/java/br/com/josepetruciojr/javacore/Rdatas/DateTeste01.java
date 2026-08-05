package br.com.josepetruciojr.javacore.Rdatas;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        //possui varios metodos deprecated
        Date date = new Date(1_000_000_000L);//armazena um long de milisegundos data e hora desde 01 Jan 1970
        Date date2 = new Date();//armazena a data e hora atual da máquina
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date.getTime());//utilizando o getTime() eu pego o valor dos milisegundos do long
        System.out.println(date2.getTime());//retornou o long atual da minha máquina
        System.out.println("--------");
        date2.toInstant();
        System.out.println(date2);
        System.out.println("--------");
        //para adicionar uma hora
        date2.setTime(date2.getTime() + 3_600_000);
        System.out.println(date2);
    }
}
