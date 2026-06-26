package br.com.josepetruciojr;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1,2,3,4,5,6,7... Mouth
        //31,28,31,30... Days

        int[][] days = new int[3][3];
        days[0][0] = 1;
        days[0][1] = 2;
        days[0][2] = 3;
        days[1][0] = 4;
        days[1][1] = 5;
        days[1][2] = 6;
        days[2][0] = 7;
        days[2][1] = 8;
        days[2][2] = 9;

        /* aqui a iteração passar pelo array de referencia i que são posições na memoria
        j itera sobre os valores
         */

        for(int i = 0; i < days.length; i++){
            for(int j = 0; j < days[i].length; j++){
                System.out.println(days[i][j]);
            }
        }

        System.out.println("------------------------------");

        /*
        aqui a iteração vem da variavel de referencia arrayDays passando pelos indexes deste array e acessando
        o indexes de arrayDay e printando num
        */
        for(int[] arrayDays : days){
            for (int num : arrayDays){
                System.out.println(num);
            }
        }
    }
}
