package br.com.josepetruciojr.javacore.Sformatacao;

import java.util.Locale;

public class LocaleTeste02 {
    public static void main(String[] args) {
        //metodo para saber como seu SO esta configurado
        System.out.println(Locale.getDefault());
        //para saber todas as ISO suportadas pelo SO
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        //quantidade de paises
        for(String isoCountry: isoCountries){
            System.out.print(isoCountry + " ");
        }

        System.out.println();
        //quantidade e linguagens
        for(String isoLanguage: isoLanguages){
            System.out.print(isoLanguage + " ");
        }

    }
}
