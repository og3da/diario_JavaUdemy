import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("que horas sao: ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        }
        else if (hora < 18) {
                System.out.println("boa tarde");
        }
        else {
                System.out.println("boa noite");
        }
    }
}