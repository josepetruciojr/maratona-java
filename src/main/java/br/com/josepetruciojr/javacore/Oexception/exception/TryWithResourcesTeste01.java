package br.com.josepetruciojr.javacore.Oexception.exception;

import br.com.josepetruciojr.javacore.Oexception.exception.model.Leitor1;
import br.com.josepetruciojr.javacore.Oexception.exception.model.Leitor2;

import java.io.*;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    //implementa a interface Closeable e fecha os objetos chamados na ordem inversa.O catch e o finally nao precisam ser declarados
    //e o throws pode ser escrito na assinatura do metodo
    public static void lerArquivo(){
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
