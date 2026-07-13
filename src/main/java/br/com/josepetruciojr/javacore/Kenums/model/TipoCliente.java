package br.com.josepetruciojr.javacore.Kenums.model;

//utiliza-se enum quando de precisa forçar formas dentre muitas opçoes. Ex: dias da semana
public enum TipoCliente {

    PESSOA_JURIDICA(1, "Pessoa Juridica"),
    PESSOA_FISICA(2, "Pessoa Fisica");

    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente findByNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()){
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public static TipoCliente findbyIdEnum(int valor){
        for(TipoCliente valorEnum : values()){
            if(valorEnum.getVALOR() == valor){
                return valorEnum;
            }
        }
        return null;
    }
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getVALOR() {
        return VALOR;
    }
}
