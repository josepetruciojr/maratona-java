package br.com.josepetruciojr.javacore.Vio;


import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader

public class FileTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is hidden: " + file.isHidden());
            System.out.println("Last modify: " + file.lastModified()); // retorna um long de millsegundos desde 1/1/1970
            System.out.println("Last modify formated: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if(exists){
                var ex = file.delete();
                System.out.println("Deletado: " + ex);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
