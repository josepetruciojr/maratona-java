package br.com.josepetruciojr.javacore.Oexception.exception.application;

public class LoginInvalidoException extends Exception{

    public LoginInvalidoException() {
        super("Login Invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
