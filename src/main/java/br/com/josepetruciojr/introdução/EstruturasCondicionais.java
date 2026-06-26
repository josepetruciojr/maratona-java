package br.com.josepetruciojr.introdução;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        final boolean isAuthorized = age >= 18;

        if(isAuthorized){
            System.out.println("Authorized");
        }
        else{
            System.out.println("Not authorized");
        }

        String categoria;

        if(age < 18 ){
            System.out.println("Novo para beber");
            categoria = "Menor";
        }
        else if (age < 65 ){
            System.out.println("Pode beber");
            categoria = "Maior";
        }
        else{
            categoria = null;
            System.out.println("Não tem idade ou problemas de saúde");
        }

        System.out.println(categoria);
    }
}
