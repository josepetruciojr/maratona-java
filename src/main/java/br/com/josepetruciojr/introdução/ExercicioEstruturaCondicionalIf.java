package br.com.josepetruciojr.introdução;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaCondicionalIf {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How much do you earn in salary per year?");
        double annualSalary = sc.nextDouble();

        if(annualSalary > 60000.0 &&  annualSalary <= 120000.0){
            annualSalary = annualSalary * 0.075 - 4500;
        }
        else if(annualSalary > 120000 &&  annualSalary <= 240000){
            annualSalary = annualSalary *  0.15 - 13500;
        }
        else if(annualSalary > 240000 &&  annualSalary <= 360000){
            annualSalary = annualSalary * 0.225 - 27000;
        }
        else{
            annualSalary = annualSalary * 0.275 - 48000;
        }

        System.out.println("Annual salary if taxes is: " + String.format("%.2f",annualSalary));
    }
}
