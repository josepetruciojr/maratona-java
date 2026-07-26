package br.com.josepetruciojr.javacore.Oexception.exception.model;

import br.com.josepetruciojr.javacore.Oexception.exception.application.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando Pessoa");
    }
}
