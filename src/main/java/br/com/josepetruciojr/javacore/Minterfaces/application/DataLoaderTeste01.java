package br.com.josepetruciojr.javacore.Minterfaces.application;

import br.com.josepetruciojr.javacore.Minterfaces.model.DataBaseLoader;
import br.com.josepetruciojr.javacore.Minterfaces.model.DataLoader;
import br.com.josepetruciojr.javacore.Minterfaces.model.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        System.out.println("-------");
        dataBaseLoader.remove();
        fileLoader.remove();
        System.out.println("-------");
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
        System.out.println("-------");
        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
