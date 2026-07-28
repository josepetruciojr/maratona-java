package br.com.josepetruciojr.javacore.Qstring.exercicio.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date data;
    private String titulo;
    private String conteudo;
    private Integer curtidas;

    private List<Comentario> comentarios = new ArrayList<>();

    public Post(Date data, String titulo, String conteudo, Integer curtidas) {
        this.data = data;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public void addComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    public void removeComentario(Comentario comentario){
        comentarios.remove(comentario);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n")
                .append(curtidas + " Likes - " + sdf.format(data) + " - \n")
                .append(conteudo + "\n")
                .append("Comentarios: \n");
                int totalComentarios = 0;
                for(Comentario c: comentarios){
                    sb.append(c.getTexto() + "\n");
                    totalComentarios++;
                    }
                sb.append("Total de comentarios: " + totalComentarios);
        return sb.toString();
    }
}
