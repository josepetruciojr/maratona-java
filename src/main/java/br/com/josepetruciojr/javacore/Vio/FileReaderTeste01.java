package br.com.josepetruciojr.javacore.Vio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriterTeste01
//BufferedReader
public class FileReaderTeste01 {
    public static void main(String[] args) {
        File file= new File("file.txt");

        try(FileReader fileReader = new FileReader(file)){
            //System.out.println(fileReader.read());//retorna um integer da quantiade caracter que ele leu
//            char[] in = new char[1000];
//            int size = fileReader.read(in);
//            System.out.println(size);
//            for(char c: in){
//                System.out.print(c);
//            }
            int i;
            while((i=fileReader.read()) != -1){//recebe o valor ASCII do indice - retorna -1 quando chega no final do arquivo
                System.out.print((char)i);//cast para retornar o char e nao o int
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
