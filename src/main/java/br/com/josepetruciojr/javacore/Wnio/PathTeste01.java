package br.com.josepetruciojr.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste01 {
    public static void main(String[] args) throws IOException {

        //aqui utilizando a interface Path e os metodos estaticos Paths e Files para trazer arquivos
        //aqui eu também posso em forma de varargs separando em varios argumentos o absolute path como no exemplo
        Path path = Paths.get("C:\\Users\\jose.azevedo\\Desktop\\java\\exercicios-java\\maratonajava\\file.txt");
        Path path1 = Paths.get("C:\\Users\\jose.azevedo\\Desktop\\java\\exercicios-java\\maratonajava", "file.txt");
        Path path2 = Paths.get("C:","\\Users\\jose.azevedo\\Desktop\\java\\exercicios-java\\maratonajava\\file.txt");
        Path path3 = Paths.get("C:","Users\\jose.azevedo", "Desktop\\java\\exercicios-java", "maratonajava\\file.txt");
        System.out.println(path.getFileName());
        System.out.println(path1.getFileName());
        System.out.println(path2.getFileName());
        System.out.println(path3.getFileName());

    }
}
