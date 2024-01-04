package application;

import entities.Product;
import util.NameUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /* nesse caso p/alterar cada item da lista precisamos converter p/stream
           stream é um tipo de dado que armazena valores

           a função map é usada para alterar cada valor armazenado em uma stream,
           gerando uma nova stream com os valores alterados

           collect(Collectors.toList()): converte em lista uma stream
         */
        List<String> names = list.stream().map(Product::staticNameToUpperCase).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
