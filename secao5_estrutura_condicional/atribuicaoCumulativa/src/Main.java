import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double conta=50;
        int minutos;
        minutos=sc.nextInt();

        if (minutos > 100) {
            conta += (minutos - 100) * 2;
        }

        System.out.printf("valor da conta = R$%.2f \n",conta);
        sc.close();
    }
}