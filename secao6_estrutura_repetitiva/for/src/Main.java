import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N, soma=0;

        // repetições
        N = sc.nextInt();
        // sintaxe:
        // for ( início ; condição ; incremento)
        for (int i=1; i<=N; i++) {
            soma += sc.nextInt();
        }

        System.out.println("soma= " + soma);
    }
}