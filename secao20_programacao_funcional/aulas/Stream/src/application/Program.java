package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7); // criando uma lista incluindo valores

        // convertendo a lista em uma Stream e printando
        // com .map() estamos aplicando uma função em cada valor dessa stream
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        /*
        Criando uma Stream com valores pre-estabelecidos e printando
         */
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        /*
        Stream com geração a partir de uma função
         */
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        /*
        Stream com sequencia de Fibonacci
         */
        Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(20).toArray()));
    }
}
