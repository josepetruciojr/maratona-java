package br.com.josepetruciojr.javacore.Oexception.exception.model;

import br.com.josepetruciojr.javacore.Oexception.exception.application.LoginInvalidoException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class Funcionario extends Pessoa{

    //sobrescrever o metodo nao é obrigado a lançar as mesmas exceções do metodo original
    //posso colocar qualquer filha de runtime
    //Não posso lançar checked que nao foi declarada no metodo original ou  uma mais generica

    public void salvar() throws LoginInvalidoException, FileNotFoundException, ArithmeticException {
        System.out.println("Salvando Funcionario");
    }
}
