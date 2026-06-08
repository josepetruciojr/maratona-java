package br.com.josepetruciojr;

public class Arrays {
    public static void main(String[] args) {

        testeArray();


    }

    public static void testeArray(){
        int[] age = new int[3];
        for (int i = 0; i < age.length; i++){
            age[i] = i;
            System.out.println("Age: " + age[i]);
        }

        String word = "Anaptalabobiparalelonologramation";
        char[] chars = word.toCharArray();

        int numberOfChars= 0;

        for(char c : chars){
            System.out.println(c);
            numberOfChars++;
        }

        System.out.println("Apos o char para testar se funciona: " + numberOfChars);

        numberOfChars = word.length();
        System.out.println("Assim também funciona: " + numberOfChars);
    }
}
