package br.com.josepetruciojr;

public class TesteOperadoresDeBit {
    public static void main (String[] args) {
        int x = -100;
        x >>= 2;
        System.out.println(x);
        x = 100;
        x >>= 2;
        System.out.println(x);
        x = -100;
        x >>>= 2;
        System.out.println(x);
        x = 100;
        x >>>= 2;
        System.out.println(x);
    }
}

