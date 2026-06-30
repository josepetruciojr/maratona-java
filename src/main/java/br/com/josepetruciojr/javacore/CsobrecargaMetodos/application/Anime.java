package br.com.josepetruciojr.javacore.CsobrecargaMetodos.application;
/**
 * O Java já cria um construtor padrão, assim que você instancia um objeto, automaticamente já tem um constutor vazio
 * que é padrão do Java
 */
public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //sobrecarga
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    //sobrecarga
    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome,tipo,episodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println(episodios);
        System.out.println(genero);
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

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
