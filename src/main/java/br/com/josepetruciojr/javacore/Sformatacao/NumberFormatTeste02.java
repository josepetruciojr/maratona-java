package br.com.josepetruciojr.javacore.Sformatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste02 {
    public static void main(String[] args){
       //classe numberformat é uma classe abstrata
        Locale localeUS = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        //depois de passada a formatação do local, é usado entao o numberformat passando o locale para formatar a moeda
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[1] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        
        //valor a ser formatado na impressao
        double valor = 100_000_000.2130;
        for (NumberFormat numberFormat : nfa) {
            //testar a configuração digitos fracionarios
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        System.out.println("--------------------");
        String valorString = "￥100,000,000";// na Strign nao utilizar o underline ou caracter que falhe no parse e os valores de String precisam ser exatos
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
