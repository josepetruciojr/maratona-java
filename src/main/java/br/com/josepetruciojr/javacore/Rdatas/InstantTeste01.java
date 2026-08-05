package br.com.josepetruciojr.javacore.Rdatas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantTeste01 {
    public static void main(String[] args) {
        //Zulu Time
        Instant now = Instant.now();
        System.out.println(now);
        //LocalDateTime do meu SO, testando as aulas do Prof Nelio Alves manipulando datas
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Portugal")));
        System.out.println(now.getEpochSecond());//retorna um long
        System.out.println(now.getNano());//retorna um inteiro em nano segundos 999.999.999

        //retorna uma data de 1970
        System.out.println(Instant.ofEpochSecond(3,1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3,-1_000_000_000));
    }
}
