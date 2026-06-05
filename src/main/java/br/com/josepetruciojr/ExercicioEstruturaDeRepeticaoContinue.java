package br.com.josepetruciojr;

public class ExercicioEstruturaDeRepeticaoContinue {

    public static void main(String[] args) {
        int evenNumbers = 100;

        for (int i = 0; i <= evenNumbers; i++) {
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
