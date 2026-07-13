package br.com.josepetruciojr.javacore.FmodificadoresEstaticos.model;
/**
 * blocos de inicialização sempre são executados antes do construtor, chamado não estático ou de instancia.
 * 0º bloco de inicialização é executado quando a JVM carregar a classe
 * 1º alocado em espaço em memoria para o objeto
 * 2º cada atributo de classe é inicializado com valores default
 * 3º bloco de inicialização é executado primeiro
 * 4º o constrtutor é executado
 * 5º para ser inicializado apenas uma vez use o static antes do bloco de inicialização
 * 6º quando você tiver mais de um bloco de inicialização static eles seram inicialização na ordem em que aparecem
 * 7º se você tiver um bloco de inicialização static e um não static, o static sera iniciado primeiro.
 */
public class Anime {

    private String nome;
    private static int[] episodios;

        static {
        //bloco de inicialização static para inicializar os valores do array apenas uma vez
        System.out.println("Dentro do bloco de inicialização estatico");
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
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
