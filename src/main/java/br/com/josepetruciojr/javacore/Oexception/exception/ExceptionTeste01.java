package br.com.josepetruciojr.javacore.Oexception.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args){
        criarNovoArquivo();
    }

    /**
     *
     * Checked exception, neste caso tentar criar um arquivo onde não há permissão de gravação de dados.
     * O teste simula e lança um IOException que é a exceção que da um catch e expoe o StackTrace
     *
     */
    public static void criarNovoArquivo(){

        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+ isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
