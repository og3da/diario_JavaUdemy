import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int numerosInteiros[] = new int[n];
        for (int i=0; i<numerosInteiros.length; i++) {
            int inteiroDigitado = sc.nextInt();
            numerosInteiros[i] = inteiroDigitado;
        }

        System.out.println("\nINTEIROS NEGATIVOS: ");
        for (int i=0; i<numerosInteiros.length; i++) {
            if (numerosInteiros[i] < 0) {
                System.out.println(numerosInteiros[i]);
            }
        }

        sc.close();
    }
}
