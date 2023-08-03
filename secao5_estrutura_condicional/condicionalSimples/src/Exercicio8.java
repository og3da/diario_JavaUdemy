import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario, imposto1 = 1000 * 0.08, imposto2 = 1500 * 0.18, impostoFinal = 0;
        System.out.println("Digite o salario da pessoa em Lisarb: ");
        salario = sc.nextDouble();

        if (salario <= 2000.00) {
            System.out.println("ISENTO!");
        }
        else if (salario <= 3000.00) {
            impostoFinal = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.00) {
            impostoFinal = (salario - 3000) * 0.18 + imposto1;
        }
        else if (salario >= 4500.01) {
            impostoFinal = (salario - 4500) * 0.28 + imposto1 + imposto2;
        }

        System.out.printf("VALOR DO IMPOSTO = R$%.2f \n", impostoFinal);
        sc.close();
    }
}
