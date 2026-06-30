package br.com.josepetruciojr.javacore.EblocosInicializacao.application;
/**
 * blocos de inicialização sempre são executados antes do construtor, chamado não estático ou de instancia.
 * 1º alocado em espaço em memoria para o objeto
 * 2º cada atributo de classe é inicializado com valores default
 * 3º bloco de inicialização é executado primeiro
 * 4º o constrtutor é executado
 */
public class Anime {

    private String nome;
    private int[] episodios;

    {
        //bloco de inicialização para inicializar os valores do array
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}