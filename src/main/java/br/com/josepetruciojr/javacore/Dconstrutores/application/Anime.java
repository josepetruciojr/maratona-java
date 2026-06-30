package br.com.josepetruciojr.javacore.Dconstrutores.application;
/**
 * O Java já cria um construtor padrão, assim que você instancia um objeto, automaticamente já tem um constutor vazio
 * que é padrão do Java
 * this() é chamada de construtor e não funciona fora dele, e precisa estar na primeira linha para não gerar erro
 * de compilção
 */
public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(){
        System.out.println("Primeiro eu vim aqui!!!");
    }

    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    /*quando você utiliza um tipo de retorno no "construtor" ele passa a ser um metodo.
    exe: public void Anime(){}
     */

    public void imprime(){
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println(episodios);
        System.out.println(genero);
        System.out.println(estudio);
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
