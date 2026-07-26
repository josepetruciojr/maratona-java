package br.com.josepetruciojr.javacore.Oexception.exception.application;

import br.com.josepetruciojr.javacore.Oexception.exception.model.Funcionario;
import br.com.josepetruciojr.javacore.Oexception.exception.model.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTeste01 {
    public static void main(String[] args)  {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        //preciso lançar no metodo ou em um bloco try-catch
        //finally é usado para encerrar chamadas a banco de dados ou metodos.

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
