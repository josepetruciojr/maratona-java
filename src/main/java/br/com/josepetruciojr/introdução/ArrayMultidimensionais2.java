package br.com.josepetruciojr.introdução;

public class ArrayMultidimensionais2 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        /*
        Ao rodar este codigo será lançada um NullPointerException, pois é um array de 3 posições que nao faz
        referencia a nada. O padrão da variavel de referencia é Null.
        Para resolver é necessário referenciar novos array dentro do index que aponta pra memoria.
         */

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        for(int[] arrayBase : arrayInt) {
            System.out.println("\n------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        /*
        Para iniciar um novo array multidimensional outra forma seria
         */

        int[][] arrayInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};

        for(int[] arrayBase : arrayInt2) {
            System.out.println("\n------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
