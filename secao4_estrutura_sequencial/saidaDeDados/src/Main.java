import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // criando variaveis
        double x = 10.203040;
        String nome = "Maria";
        int idade = 30;
        double renda = 4000.0000;

        System.out.println("Variável sem formatação:");
        System.out.println(x);
        System.out.println();

        System.out.println("Variável com formatação:");
        System.out.printf("%.2f%n", x); // printando no console formatado com 2 casas decimais
        System.out.println();

        // agora vamos alterar a localização padrao para aparecer com separador "."
        Locale.setDefault(Locale.US);
        System.out.println("Variável com formatação de Locale:");
        System.out.printf("%.2f%n", x);

        // concatenando string
        System.out.println();
        System.out.println("RESULTADO = " + x + " metros");
        // concatenando & formatando
        System.out.printf("RESULTADO = %.2f metros", x);

        // formatando com varios tipos de dados
        System.out.println();
        System.out.println();
        System.out.printf("%s tem %d anos e ganha R$%.2f \n", nome, idade, renda);
    }
}