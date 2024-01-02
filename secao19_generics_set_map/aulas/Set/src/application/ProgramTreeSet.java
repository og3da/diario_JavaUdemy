package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramTreeSet {
    public static void main(String[] args) {
        // SE OS ELEMENTOS DEVEM SER ORDENADOS, A IMPLEMENTAÇÃO MAIS INDICADA
        // É O TreeSet<>!

        // criando um SET
        Set<String> set = new TreeSet<>();
        // adicionando valores ao SET
        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");

        // printando todos dados (em ordem alfabetica)
        for (String p : set) {
            System.out.println(p);
        }
    }
}
