package br.com.josepetruciojr.javacore.Minterfaces.model;

public interface DataLoader {
    public static final int MAX_VALUE = 10;//por padrão todos os atributos de um interfaces são constantes

    void load();
    //Não quebra classes onde ja foram implementadas esta interface utilizando o modificador default
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do MaxDataSize na interface");
    }
}
