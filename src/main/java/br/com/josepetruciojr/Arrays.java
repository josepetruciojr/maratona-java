package br.com.josepetruciojr;

public class Arrays {
    public static void main(String[] args) {

        int[] age = new int[3];
        for (int i = 0; i < age.length; i++){
            age[i] = i;
            System.out.println(age[i]);
        }
    }
}
