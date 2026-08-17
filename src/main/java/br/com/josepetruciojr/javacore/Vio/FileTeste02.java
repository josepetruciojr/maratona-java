package br.com.josepetruciojr.javacore.Vio;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) throws IOException {

        //baseado no sistema UNIX eu crio um diretorio com o metodo mkdir
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println("Criou 1: " + isDiretorioCriado);

        //aqui eu crio um file txt dentro do diretorio pssando o absolute path
        File fileArquivDiretorio = new File("C:\\Users\\jose.azevedo\\Desktop\\java\\exercicios-java\\maratonajava\\pasta\\arquivo.txt");
        boolean isFileCriado = fileArquivDiretorio.createNewFile();
        System.out.println("Criou 2: " + isFileCriado);

        //aqui eu crio um file txt dentro diretorio passando o diretorio como 1° args e a String no file como 2° args
        File fileArquivoDiretorio2 = new File(fileDiretorio,"arquivo2.txt");
        boolean isFileCriado2 = fileArquivoDiretorio2.createNewFile();
        System.out.println("Criou 3: " + isFileCriado2);

        //aqui eu estou renomeado o file e colocando ele dentro do mesmo diretorio, caso eu não passe o diretorio ele vai para raiz
        File fileRenomeado = new File(fileDiretorio, "arquivo_renomeado");
        boolean isRenomeado = fileArquivDiretorio.renameTo(fileRenomeado);
        System.out.println("File Renomeado: " + isRenomeado);

        //aqui esotu renomeando a pasta do diretorio direto na raiz
        File fileDiretorioRenomeado = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(fileDiretorioRenomeado);
        System.out.println("Diretorio Renomeado: " + isDiretorioRenomeado);
    }
}
