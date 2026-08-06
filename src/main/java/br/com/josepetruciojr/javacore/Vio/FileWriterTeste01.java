package br.com.josepetruciojr.javacore.Vio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriterTeste01
//BufferedReader
public class FileWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        //posso usar FileWriter fileWriter = new FileWriter(file) -- dentro try eu preciso fechar ele no try ou no finally ao inves do TryWithResources
        try (FileWriter fileWriter = new FileWriter(file, true)){//com o append ele escreve mais uma linha ao inves de sobrescrever
            fileWriter.write("Caraca, escrevendo uma mensagem louca com o writer, Aloooooooo!\n");//para pular uma linha
            fileWriter.flush();//escreve tudo dentro do buffer e no fim o java ja o close
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
