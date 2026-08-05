package br.com.josepetruciojr.javacore.Rdatas;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {
        Map<String, String> shortIds =  ZoneId.SHORT_IDS;//chave valor das zone_id suportadas pelo java
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        System.out.println("-------------1----------");
        ZoneId zone = ZoneId.of("Portugal");//nome errado lança uma exceçao ZoneRulesException
        System.out.println(zone);

        System.out.println("-------------2----------");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println("-------------3----------");
        now.atZone(zone);//imutável o objeto
        System.out.println(now);

        System.out.println("----------------4---------");
        ZonedDateTime zoneDateTime = now.atZone(zone);//converte o localdate com um zonedDateTime
        System.out.println(zoneDateTime);

        System.out.println("-------------5----------");
        Instant nowInstant = Instant.now();//zulutime
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(ZoneId.of("America/Sao_Paulo"));//
        System.out.println(zonedDateTime2);

        System.out.println("-------------6----------");

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        //cuidado ao setar a hora no formato correto coloco um offset customizado sem a zona so fazendo um offset
        ZoneOffset offset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offset);
        System.out.println(offsetDateTime);
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, offset);
        System.out.println(offsetDateTime1);
        //agora usando o instant e pegando um horario no zulu time
        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(offset);
        System.out.println(offsetDateTime2);
        System.out.println("-------------6----------");
        //calendario japones
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEra = LocalDate.of(1873,1,1);
        JapaneseDate japaneseDate1 = JapaneseDate.from(meijiEra);
        System.out.println(japaneseDate1);
    }
}
