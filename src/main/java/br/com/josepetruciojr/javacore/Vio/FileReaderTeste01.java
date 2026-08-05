package br.com.josepetruciojr.javacore.Vio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader
public class FileReaderTeste01 {
    public static void main(String[] args) {
        File file= new File("file.txt");

        try(FileReader fileReader = new FileReader(file)){
//            System.out.println(fileReader.read());//retorna um integer do primeiro caracter do arquivo
//            char[] in = new char[1];
//            fileReader.read(in);
//            for(char c: in){
//                System.out.println(c);
//            }
            int i;
            while((i=fileReader.read()) != -1){//recebe o valor ASCII do indice
                System.out.print((char)i);//cast para retornar o char e nao o int
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
