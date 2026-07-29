package br.com.josepetruciojr.javacore.Sformatacao;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTeste01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];//possui basicamente 6 tipos de implementações

        df[0] = DateFormat.getInstance();//MODELO: dd/MM/yyyy HH:ss.
        df[1] = DateFormat.getDateInstance();//MODELO: XX de fev. de yyyy.
        df[2] = DateFormat.getDateTimeInstance();//MODELO: XX de fev. de yyyy HH:mm:ss.
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);//MODELO dd/MM/yyyy.
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);//MODELO: XX de fev. de yyyy.
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);//MODELO: XX de fevereiro de yyyy.
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);//MODELO: dia semana, XX de fevereiro de yyyy.

        int i = 0;
        for (DateFormat dateFormat: df){
            System.out.println( i + " - " + dateFormat.format(calendar.getTime()));
            i++;
        }

    }
}
