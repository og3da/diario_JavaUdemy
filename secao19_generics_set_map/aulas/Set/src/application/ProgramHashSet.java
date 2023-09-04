package application;

import java.util.HashSet;
import java.util.Set;

public class ProgramHashSet {
    public static void main(String[] args) {
        // SE A ORDEM DOS ELEMENTOS NAO IMPORTAR A IMPLEMENTAÇÃO MAIS INDICADA
        // É O HashSet<>!

        // criando um SET
        Set<String> set = new HashSet<>();
        // adicionando valores ao SET
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        // printando todos dados
        System.out.println(set.contains("Notebook")); // printando se existe esse produto
        for (String p : set) {
            System.out.println(p);
        }
    }
}