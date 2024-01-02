import java.util.Scanner;

public class EntradaScannerChar {
    public static void main(String[] args) {

        // criando objeto "sc" que realiza a leitura de entrada com a classe Scanner
        Scanner sc = new Scanner(System.in);

        char x;
        x = sc.next().charAt(0);
        System.out.println("voce digitou: " + x);

        sc.close();
    }
}
