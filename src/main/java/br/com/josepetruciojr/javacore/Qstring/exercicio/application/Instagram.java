package br.com.josepetruciojr.javacore.Qstring.exercicio.application;

import br.com.josepetruciojr.javacore.Qstring.exercicio.model.Comentario;
import br.com.josepetruciojr.javacore.Qstring.exercicio.model.Post;

import java.text.ParseException;

import static br.com.josepetruciojr.javacore.Qstring.exercicio.model.Post.sdf;

public class Instagram {
    public static void main(String[] args) throws ParseException{
        Comentario comentario = new Comentario("Legal, Foto maneira!");
        Comentario comentario2 = new Comentario("Que lugar é esse?");

        Post post = new Post(sdf.parse("22/03/2026 14:40:00"), "Viagem ao Capitolio",
                    "Viajamos e conhecemos este lugar incrivel", 120);
        post.addComentario(comentario);
        post.addComentario(comentario2);

        System.out.println(post);
    }
}
