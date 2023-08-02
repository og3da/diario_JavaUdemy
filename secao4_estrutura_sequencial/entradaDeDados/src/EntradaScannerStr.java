import java.util.Scanner;

public class EntradaScannerStr {
    public static void main(String[] args) {

        // criando objeto "sc" que realiza a leitura de entrada com a classe Scanner
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("voce digitou: " + x);

        sc.close();
    }
}