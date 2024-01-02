public class Casting {
    public static void main(String[] args) {

        int a,b;
        double resultado;
        a = 5;
        b = 2;

        // nesse caso o resultado vai ser arredondado pois as variaveis são int
        resultado = a / b;
        System.out.println("resultado inteiro = " + resultado);

        // vamos converter o resultado para double
        resultado = (double) a / b;
        System.out.println("resultado exato = " + resultado);

    }
}
