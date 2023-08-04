import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 0, soma = 0;

        while (x != 101) {
            x = sc.nextInt();
            soma += x;
        }
        System.out.println("soma= " + soma);
    }
}