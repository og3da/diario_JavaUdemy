import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tpCombustivel, alcool=0, gasolina=0, diesel=0, controle=1;

        while (controle == 1) {
            tpCombustivel = sc.nextInt();
            if (tpCombustivel < 1 || tpCombustivel > 4) {
                System.out.println("digite um numero entre 1 e 4!");
            } else if (tpCombustivel == 4) {
                controle=0;
            } else if (tpCombustivel == 1) {
                alcool += 1;
            } else if (tpCombustivel == 2) {
                gasolina += 1;
            } else if (tpCombustivel == 3) {
                diesel += 1;
            }
        }

        System.out.println("--------------");
        System.out.println("MUITO OBRIGADO");
        System.out.println("alcool = " + alcool);
        System.out.println("diesel = " + diesel);
        System.out.println("gasolina = " + gasolina);
    }
}
