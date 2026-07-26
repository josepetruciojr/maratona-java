package br.com.josepetruciojr.javacore.Pwrappers.application;

public class WrapperTeste01 {
    public static void main(String[] args) {

        //Todos os tiPos Primitivos
        byte byteP = 1;
        short shortP = 20;
        int intP = 127;
        long longP = 100000L;
        float floatP = 10.0F;
        double doubleP = 100D;
        char charP  ='J';
        boolean booleanP = false;

        //wrappers encaPsulam os tiPos Primitivos transformando-os em objetos
        //regras de polimorfismo são aplicadas, um integer nao cabe em um long
        //passagem de parametro por referencia
        //Collection trabalham somente com classe wrappers
        //tipo primitivo sempre possiveis devem ser usados
        Byte byteW  = 1;
        Short shortW = 20;
        Integer intW = 127;//autoboxing quando o java faz o a conversao direta de primitivo para wrapper
        Long longW = 10L;
        Float floatW = 10.0F;
        Double doubleW = 100D;
        Character charW  ='J';
        Boolean booleanW = false;

        //unboxing quando vai de um wrapper para um tip primitivo
        //usando parse para transforma um tipo ou string em um tipo wrapper
        //classe Character tem varios metodos estaticos
        int i = intW;
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("True"); //ele só retorn o equalsIgnoreCase
        System.out.println(verdadeiro);


    }
}
