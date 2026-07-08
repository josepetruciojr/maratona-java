package br.com.josepetruciojr.javacore.JmodificadorFinal.model;
/*
No java a constante é definida através da palavra final
Não aceita valores de inicialização padrão
Constante seguem a convenção de estar UPPERCASE e separadas por underline/underscore "_".
 */
public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE;
    public final Comprador COMPRADOR = new Comprador();

    static{
        //posso usar o bloco de inicialização para o atributo final por causa da precedencia de inicialização.
        VELOCIDADE_LIMITE = 250;
    }
        //Também posso utilizar o atributo final inicializando ele no construtor.
    public Carro(){
    }

    public void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
