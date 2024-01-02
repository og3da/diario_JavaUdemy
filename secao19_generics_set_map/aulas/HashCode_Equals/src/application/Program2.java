package application;

import entities.Client;

public class Program2 {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "m@gmail.com");
        Client c2 = new Client("Maria", "m@gmail.com");

        // printando HashCode
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        // printando se sao iguais
        System.out.println("comparando conteúdo dos objetos: " + c1.equals(c2));

        // nao podemos fazer a comparação assim pois ela compara o nro do objeto na memoria
        // e não o conteudo dos objetos!
        System.out.println("comparando nro de referencia do objeto na memoria:");
        System.out.println(c1 == c2);
    }
}
