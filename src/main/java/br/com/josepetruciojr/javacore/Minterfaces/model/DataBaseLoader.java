package br.com.josepetruciojr.javacore.Minterfaces.model;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando Dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo os Dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Fazendo checagem de permissões dentro do banco de dados");
    }

    //implementa mas não pode ser sobrestico
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do MaxDataSize na classe");
    }
}
