import java.util.Locale;
import java.util.Scanner;

public class EntradaScannerDouble {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        // criando objeto "sc" que realiza a leitura de entrada com a classe Scanner
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();
        System.out.printf("voce digitou: %.2f \n", x);

        sc.close();
    }
}
