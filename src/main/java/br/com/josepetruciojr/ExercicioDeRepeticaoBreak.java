package br.com.josepetruciojr;

public class ExercicioDeRepeticaoBreak {

    public static void main(String[] args) {

        //imprimir os primeiros 25 numeros de um dado valor. Por ex: 50.
        int maxValue = 50;
        for (int i = 0; i < maxValue; i++) {

            if (i == 25) {
                break;
            }
            System.out.println(i);
        }

        //imprimir dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //condição parcela >= 1000

        double installment = 1000;
        double carValue = 50000;
        for (int i = 1; i < carValue; i++){
            var result = carValue/i;
            if(result != installment){
                System.out.println("Number of installment: " + i + "x");
                break;
            }
        }
    }
}
