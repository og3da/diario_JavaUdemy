package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {
    public static void main(String[] args) {

        /*
        USANDO TreeSet, devemos implementar a classe Comparable<>
        pois ela sera usada para definir como o nosso TreeSet irá
        ordenar as inserções.

        Nesse caso estamos fazendo por ordem alfabetica, entao
        a comparação esta sendo feita por nome.
         */

        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }
    }
}