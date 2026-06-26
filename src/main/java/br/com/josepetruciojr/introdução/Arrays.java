package br.com.josepetruciojr.introdução;

public class Arrays {
    public static void main(String[] args) {

        testeArray();

    }

    public static void testeArray(){
        int[] age = new int[3];
        // loop for
        for (int i = 0; i < age.length; i++){
            age[i] = i;
            System.out.println("Age: " + age[i]);
        }

        String word = "Anaptalabobiparalelonologramation";
        char[] chars = word.toCharArray();

        int numberOfChars= 0;

        // for each
        for(char c : chars){
            System.out.println(c);
            numberOfChars++;
        }

        // print the count numberOfChars on the loop for each.
        System.out.println("Apos o char para testar se funciona: " + numberOfChars);

        // print the size of numberOfChars, in java arrays use .length()
        numberOfChars = word.length();
        System.out.println("Assim também funciona: " + numberOfChars);

        /*
        Ways to declarate arrays

        int[] number = new int[3];
        int[] number = {1,2,3};
        int[] number = new int[]{1,2,3};
         */
    }
}
