package br.com.josepetruciojr.javacore.Vio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTeste01 {
    public static void main(String[] args) {
        File file= new File("file.txt");

        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String linha;
            //O file reader retorna o -1 e o buffered reader retorna um null quando chega no final do arquivo
            while((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
