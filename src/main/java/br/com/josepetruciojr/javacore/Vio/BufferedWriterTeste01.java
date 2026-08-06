package br.com.josepetruciojr.javacore.Vio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){//
            bufferedWriter.write("Caraca, escrevendo uma mensagem louca com o writer, Aloooooooo!");
            bufferedWriter.newLine();//pega o line separator do SO
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
