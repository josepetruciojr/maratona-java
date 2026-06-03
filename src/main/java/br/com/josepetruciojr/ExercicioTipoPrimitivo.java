package br.com.josepetruciojr;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ExercicioTipoPrimitivo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String name = "José";
        String address = "Street Fighter 01 New York";
        double salary = 2500.0;
        LocalDate dateSalaryReceived = LocalDate.now();
        String textDate = dateSalaryReceived.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.printf("I %s, residing at %s, confirm that I received a salary of %.2f, on %s."
                , name, address, salary, textDate);
    }
}
