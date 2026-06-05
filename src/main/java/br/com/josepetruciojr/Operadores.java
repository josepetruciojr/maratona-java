package br.com.josepetruciojr;

public class Operadores {
    public static void main(String[] args) {

        //Arithmetic Operators

        int one = 1;
        int two = 2;
        int sum = one + two;
        int multiplication = one * two;
        double division = one / (double)two;

        //Curiosities: sum (+) overcharged -> println (3 <------ Value -----> 12) the first sum and second concatenate
        System.out.println(one + two +" <------ Value -----> " + one + two);

        //even or odd
        int restOfTheDivision = 20 % 2;

        //Logic: < > <= >= == !=.  The Java convention the word "is"
        boolean isBiggerThan = 10 > 20;
        boolean isSmallerThan = 10 < 20;
        boolean isDifferentThan = 10 != 20;
        boolean isEqualsThan = 10 == 20;

        //&& (and) - || (or) - ! (not)

        int age = 35;
        float salary = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double currencyAccount = 250.0;
        double savingsAccount = 10000;
        float playstationValue = 5800F;
        boolean isSufficientFunds = currencyAccount > playstationValue || savingsAccount > playstationValue;

        System.out.println("Buying a a playstation: " + isSufficientFunds);

        //Assignment operators = += -= /= *= %=

        double value = 1800;
        value = value + 1000;
        value += 1000;
        value -= 100;
        value *= 2;
        value /= 4;
        value %= 2;
        System.out.println(value);

        int counter = 0;
        counter =+ 1;
        counter++;
        counter--;
        System.out.println(counter++);
        ++counter;
        --counter;
        System.out.println(counter--);



    }
}
