import java.util.Scanner;

public class EntradaScannerInt {
    public static void main(String[] args) {

        // criando objeto "sc" que realiza a leitura de entrada com a classe Scanner
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();
        System.out.println("voce digitou: " + x);

        sc.close();
    }
}
