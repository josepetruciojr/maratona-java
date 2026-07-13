package br.com.josepetruciojr.javacore.Kenums.model;

//possivel criar enumeração dentro da classe
public class Cliente {

    private String nome;
    private String tipo;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    /**

     É um forma de criar um atributo que pertença a classe somente e não possa ser modificado não usual, alternativo ao Enum.
    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

    public Cliente(String nome, String tipo) {
        if(!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)){
            return;
        }
        this.nome = nome;
        this.tipo = tipo;
    }

    */

    public Cliente(String nome, TipoCliente tipoCliente){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", Tipo Cliente=" + tipoCliente +
                ", Tipo Pagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
