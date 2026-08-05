package br.com.josepetruciojr.javacore.Rdatas;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {
        //utilizado em sistemas legados
        //classe abstrata e não pode ser instaciada com new
        //possui varias implementações(ex: calendario gregoriano, budista japones imperial
        //fornece constantes também - semana, dia, mes, ano.
        Calendar calendar = Calendar.getInstance();
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo, primeiro dia da semana!");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.HOUR, 7);//tomar cuidado que as hora podem passar para outro dia ou ano então utilize o roll para virar e voltar
        calendar.roll(Calendar.HOUR, 7);
        Date date = calendar.getTime(); //hack para imprimir a data via calendar pegando o tempo em milisegundos e formatando pelo date
        System.out.println(date);
    }
}
