package br.com.josepetruciojr.introdução;

public class TiposPrimitivos {
    public static void main(String[] args) {
        /*
        byte, short, int, long.
        float, double.
        char - can be numeric or can be a Unicode ASCII Table.
        boolean - true or false.
         */

        int number = 1;
        double decimalNumber = 20;
        float floatNumber = 2000.0f;
        long longNumber = 1000000L;
        byte byteNumber = -128;
        short shortNumber = 2;

        char character = 'c';
        boolean condition = true;

        System.out.println("A idade "+number+" ano.");
        System.out.println(character);
        System.out.println(floatNumber);

        //Casting

        longNumber = (long) 155.33;
        System.out.println(longNumber);

        //String is a reference type and a Wrapper Class.

        String text = "Isto é um grande texto e pode ser colocado aqui";
        var textTwo = "Isto é um texto";

        System.out.println(text);
        System.out.println(textTwo);


    }
}
