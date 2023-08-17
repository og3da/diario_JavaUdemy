package application;

import entitites.Comment;
import entitites.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        // criando mascara de data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // POST 1
        // instanciando comentarios
        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");
        // instanciando postagem
        Post p1 = new Post(
                sdf.parse("16/08/2023 10:00:00"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        // adicionando comentarios instanciados para a postagem
        p1.addComment(c1);
        p1.addComment(c2);

        // POST 2
        // instanciando comentarios
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        // instanciando postagem
        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night",
                "See you tomorrow",
                5);
        // adicionando comentarios instanciados para a postagem
        p2.addComment(c3);
        p2.addComment(c4);

        // retorno
        System.out.println(p1);
        System.out.println(p2);
    }
}
