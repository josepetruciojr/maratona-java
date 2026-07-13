package br.com.josepetruciojr.javacore.Kenums.model;

//utiliza-se enum quando de precisa forçar formas dentre muitas opçoes. Ex: dias da semana
public enum TipoCliente {

    PESSOA_JURIDICA(1),
    PESSOA_FISICA(2);

    public final int VALOR;

    TipoCliente(int valor){
        this.VALOR = valor;
    }
}
