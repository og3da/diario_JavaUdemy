import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N;

        N = sc.nextInt();
        if (N < 0) {
            System.out.println("DIGITE UM NUMERO POSITIVO");
        }
        else {
            System.out.println();
            for (int i=1; i<=N; i++) {
                System.out.print(i);
                System.out.print(" ");
                System.out.print((int) Math.pow(i, 2));
                System.out.print(" ");
                System.out.print((int) Math.pow(i, 3));
                System.out.println();
            }
        }

    }
}
