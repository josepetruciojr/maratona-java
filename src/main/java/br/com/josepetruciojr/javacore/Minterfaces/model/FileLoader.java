package br.com.josepetruciojr.javacore.Minterfaces.model;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um Arquivo");
    }

    //o modificador de acesso nao pode ser mais restritivo do que o da superclasse
    //private --> default --> protected --> public
    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivos");
    }

    @Override
    public void checkPermission() {
        System.out.println("Fazendo checagem de permissões dentro de um arquivo");
    }
}
