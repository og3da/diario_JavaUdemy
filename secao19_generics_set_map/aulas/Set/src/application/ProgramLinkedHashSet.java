package application;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramLinkedHashSet {
    public static void main(String[] args) {
        // SE OS ELEMENTOS DEVEM SER ORDENADOS PELA ORDEM QUE FORAM INSERIDOS,
        // A IMPLEMENTAÇÃO MAIS INDICADA É O LinkedHashSet<>!

        // criando um SET
        Set<String> set = new LinkedHashSet<>();
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
