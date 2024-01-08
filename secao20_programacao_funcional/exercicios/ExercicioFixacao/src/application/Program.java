package application;

import entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // lendo valores do arquivo e acrescentando na lista Funcionarios
            List<Funcionario> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            // filtrando funcionarios com salario determinado
            System.out.print("Digite um valor de salario a consultar: ");
            double salario = sc.nextDouble();

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> listaOrdenada = list.stream()
                    .filter(x -> x.getSalario() > salario)
                    .map(x -> x.getEmail()).sorted(comp)
                    .collect(Collectors.toList());

            System.out.println("\n--LISTA DE EMAILS DOS FUNCIONARIOS COM SALARIO MAIOR QUE " + salario);
            listaOrdenada.forEach(System.out::println);

            // somando salario de funcionarios com inicial "M"
            double salarioM = list.stream()
                    .filter(x -> x.getNome().toUpperCase().charAt(0) == 'M')
                    .map(x -> x.getSalario())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println("\n--SOMA DOS SALARIOS DE FUNCIONARIOS COM NOME COMEÇANDO COM 'M' = R$" + salarioM);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}