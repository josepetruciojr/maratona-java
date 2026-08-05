package br.com.josepetruciojr.javacore.TresourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {
        //como internacionalizar as suas msgs
        //criar um arquivo fora do pacote do programa
        //nome pode ser qq um, porem um preciso informar por ex: texto_en_US
        //criada a pasta resources - dentro dela os bundles
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages");
        System.out.println(bundle.getString("ola"));
        ResourceBundle bundle1 = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle1.getString("ola"));
    }
}