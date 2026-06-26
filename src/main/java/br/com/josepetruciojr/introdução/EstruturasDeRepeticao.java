package br.com.josepetruciojr.introdução;

public class EstruturasDeRepeticao {

    public static void main(String[] args) {

        //while, do while, for

        int counter = 10;

        while (counter > 0){
            System.out.println("Counting: " + counter);
            counter--;
            if(counter == 0){
                System.out.println("Acabou, chegamos ao " + counter + ".");
            }
        }
        do{
            counter++;
            System.out.println("Counting: " + counter + ".");
        } while(counter < 10);

        for(counter = 0; counter <= 10; counter++){
            System.out.println("Counting: " + counter);
        }
    }
}
