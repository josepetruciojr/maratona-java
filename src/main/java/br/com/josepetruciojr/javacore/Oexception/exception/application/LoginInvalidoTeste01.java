package br.com.josepetruciojr.javacore.Oexception.exception.application;

import java.util.Scanner;

public class LoginInvalidoTeste01 {
    public static void main(String[] args){

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

        System.out.println("Finalizado");
    }

    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String userNameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("User: ");
        String userDigitado = teclado.nextLine();
        System.out.println("Password: ");
        String senhaDigitada = teclado.nextLine();
        if(!userNameDB.equals(userDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }
        System.out.println("Login Efetuado!");
    }
}
